<?php

require_once('funciones.php');


$id = $_GET['id'];

$conexion = db_connect();


  
if ($conexion)
{

	$borrapersona = mysqli_query($conexion,"DELETE from agenda where ID = '$id'");
	
	if ($borrapersona)
	{
		$mensaje = "Se ha borrado el registro ".$id." de la base de datos";
	}
	else
		$mensaje="No se pudo borrar el registro de la persona en la base de datos";
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);



Cabecera();

AbreContenido();

if ($conexion && $borrapersona)
{
   Mensaje($mensaje, "si");
  
   
   
   CrearListado();
}
else
   Mensaje($mensaje,"no");	



	
CierraContenido();


?>

