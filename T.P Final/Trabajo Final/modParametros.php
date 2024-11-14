<?php

require_once('funciones.php');


$id = $_POST['IdParam'];
$txtSueldoBas = $_POST['txtSueldoBas'];
$txtValorHora = $_POST['txtValorHora'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	

                     

            $modifcorrecta = mysqli_query($conexion,"UPDATE parametros SET SueldoBas='$txtSueldoBas', ValorHora='$txtValorHora' where IdParam = '$id'");
	
	if ($modifcorrecta)
		$mensaje="Se modificaron los datos de parametros";
	else
		$mensaje="No se pudo modificar los datos de parametros";
	
	mysqli_close($conexion);
	
}
else
	$mensaje="No se pudo conectar con la base de datos";



Cabecera();

AbreContenido();


if ($conexion && $modifcorrecta)
{
   Mensaje($mensaje,"si");	
   ListadoSueldo();
}
   else
   Mensaje($mensaje,"no");	  

	
CierraContenido();


?>


