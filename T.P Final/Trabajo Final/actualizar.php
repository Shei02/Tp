<?php

require_once('funciones.php');

$id = $_GET['id'];


$conexion = db_connect();


  
if ($conexion)
{
       
	$empleado = mysqli_query($conexion,"SELECT * from empleados where IdEmp = '$id'");
	
	if ($empleado)
	{

	

                       $datos = mysqli_fetch_array($empleado);
		

		$NomA=$datos['NombreAp'];
		$DNI=$datos['DNI'];
	}
	else
		$mensaje="No se pudo recuperar los datos del empleado";
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);

Cabecera();

AbreContenido();

if ($conexion && $empleado)

   FormularioEdicionEm($id,$NomA,$DNI);
else
   Mensaje($mensaje,"no");	



	
CierraContenido();


?>
