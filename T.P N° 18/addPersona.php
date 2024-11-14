<?php

require_once('funciones.php');



$txtapellido = $_POST['txtapellido'];
$txtnombre = $_POST['txtnombre'];
$txtdirec = $_POST['txtdirec'];
$txtlocal = $_POST['txtlocal'];
$txtpcia = $_POST['txtpcia'];
$txttel = $_POST['txttel'];
$txtmail = $_POST['txtmail'];



$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"INSERT INTO agenda (Apellido, Nombre, Direccion, Localidad, Provincia, Telefono, Mail) VALUES ('$txtapellido', '$txtnombre', '$txtdirec', '$txtlocal', '$txtpcia', '$txttel', '$txtmail')");
	
	if ($altacorrecta)
		$mensaje="Se agregó una persona a la agenda";
	else
		$mensaje="No se pudo agregar una persona a la agenda";
	
	mysqli_close($conexion);
	
}
else
	$mensaje="No se pudo conectar con la base de datos";



Cabecera();

AbreContenido();

if ($conexion && $altacorrecta)

   Mensaje($mensaje,"si");	
else
   Mensaje($mensaje,"no");	  

	
CierraContenido();


?>
