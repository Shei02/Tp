<?php

require_once('funciones.php');



$txtNombreAp = $_POST['txtNombreAp'];
$txtDNI = $_POST['txtDNI'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"INSERT INTO empleados (NombreAp, DNI) VALUES ('$txtNombreAp', '$txtDNI')");
	
	if ($altacorrecta)
		$mensaje="Se agregó una persona a empleados";
	else
		$mensaje="No se pudo agregar un empleado";
	
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
