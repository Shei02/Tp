<?php

require_once('funciones.php');



$txtsuelba = $_POST['txtsuelba'];
$txtvalorhs = $_POST['txtvalorhs'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"INSERT INTO parametros (Sueldo Basico, Valor Hora) VALUES ('$txtsuelba', '$txtvalorhs')");
	
	if ($altacorrecta)
		$mensaje="Se agregó valor a parametros";
	else
		$mensaje="No se pudo agregar valor";
	
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
