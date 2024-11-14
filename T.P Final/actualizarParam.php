<?php

require_once('funciones.php');

$id = $_GET['id'];


$conexion = db_connect();


  
if ($conexion)
{
       
	$parametros = mysqli_query($conexion,"SELECT * from parametros where ID = '$id'");
	
	if ($parametros)
	{

	

                       $datos = mysqli_fetch_array($parametros);
		

		$suelba=$datos['SueldoBasico'];
		$valorhs=$datos['ValorHora'];
		
	}
	else
		$mensaje="No se pudo recuperar los datos de parametros";
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);

Cabecera();

AbreContenido();

if ($conexion && $parametros)

   FormularioEdicion($suelba,$valorhs);
else
   Mensaje($mensaje,"no");	



	
CierraContenido();


?>
