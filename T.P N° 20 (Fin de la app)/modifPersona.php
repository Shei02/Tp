<?php

require_once('funciones.php');


$id = $_POST['id'];
$txtapellido = $_POST['txtapellido'];
$txtnombre = $_POST['txtnombre'];
$txtdirec = $_POST['txtdirec'];
$txtlocal = $_POST['txtlocal'];
$txtpcia = $_POST['txtpcia'];
$txttel = $_POST['txttel'];
$txtmail = $_POST['txtmail'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	

                     

            $modifcorrecta = mysqli_query($conexion,"UPDATE agenda SET Apellido='$txtapellido', Nombre='$txtnombre', Direccion='$txtdirec', Localidad='$txtlocal', Provincia='$txtpcia', Telefono='$txttel', Mail='$txtmail' where ID = '$id'");
	
	if ($modifcorrecta)
		$mensaje="Se modifcaron los datos de una persona en la agenda";
	else
		$mensaje="No se pudo modificar los datos de una persona en la agenda";
	
	mysqli_close($conexion);
	
}
else
	$mensaje="No se pudo conectar con la base de datos";



Cabecera();

AbreContenido();

if ($conexion && $modifcorrecta)
{
   Mensaje($mensaje,"si");	
   CrearListado();
}
   else
   Mensaje($mensaje,"no");	  

	
CierraContenido();


?>


