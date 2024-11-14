<?php

require_once('funciones.php');



$txtMes = $_POST['txtMes'];
$txtDia = $_POST['txtDia'];
$txtCantHs = $_POST['txtCantHs'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"INSERT INTO HsTrabajadas (Mes, Dia, CantHs) VALUES ('$txtMes', '$txtDia','$txtCantHs')");
	
	if ($altacorrecta)
		$mensaje="Se agregó información a HsTrabajadas";
	else
		$mensaje="No se pudo informacion a HsTrabajadas";
	
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
