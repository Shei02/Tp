<?php

require_once('funciones.php');

$id = $_GET['IdHsTrab'];

$conexion = db_connect();



if ($conexion)
{

	$borrahstrabajadas = mysqli_query($conexion,"DELETE from HsTrabajadas where IdHsTrab = '$id'");
	
	if ($borrahstrabajadas)
	{
		$mensaje = "Se ha borrado las horas ".$id." de la base de datos";
	}
	else
		$mensaje="No se pudo borrar las horas de un empleado en la base de datos";
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);



Cabecera();

AbreContenido();


if ($conexion && $borrahstrabajadas)
{
   Mensaje($mensaje, "si");
     
   CrearListadoHs();
}
else
   Mensaje($mensaje,"no");

	
CierraContenido();


?>

