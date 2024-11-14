<?php

require_once('funciones.php');

$id = $_GET['id'];


$conexion = db_connect();


  
if ($conexion)
{
       
	$persona = mysqli_query($conexion,"SELECT * from agenda where ID = '$id'");
	
	if ($persona)
	{

	

                       $datos = mysqli_fetch_array($persona);
		

		$ape=$datos['Apellido'];
		$nom=$datos['Nombre'];
		$dir=$datos['Direccion'];
		$loc=$datos['Localidad'];
		$pcia=$datos['Provincia'];
		$tel=$datos['Telefono'];
		$mail=$datos['Mail'];
	}
	else
		$mensaje="No se pudo recuperar los datos de la persona";
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);

Cabecera();

AbreContenido();

if ($conexion && $persona)

   FormularioEdicion($id,$ape,$nom,$dir,$loc,$pcia,$tel,$mail);
else
   Mensaje($mensaje,"no");	



	
CierraContenido();


?>
