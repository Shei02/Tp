<?php

require_once('funciones.php');

$id=$_POST['IdEmp'];

$fecha = $_POST['fecha'];
$txtcanths = $_POST['txtcanths'];

$fechaseparada = explode("-",$fecha);

$dia=$fechaseparada[2];
$mes=$fechaseparada[1];

$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"INSERT INTO HsTrabajadas (IdEmp, Mes, Dia, CantHs) VALUES ('$id', '$mes','$dia','$txtcanths')");
	
	if ($altacorrecta)
		$mensaje="Se agregaron HsTrabajadas al empleado";
	else
		$mensaje="No se pudo agregar HsTrabajadas al empleado";
	
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
