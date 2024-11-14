<?php

require_once('funciones.php');

$conexion = db_connect();


  
if ($conexion) {
    
	
	$altacorrecta = mysqli_query($conexion,"SELECT * FROM parametros");
	
	if ($persona){
		
		$datos=mysqli_fetch_array($persona);
		
		$txtid = $_POST['txtid'];
		$txtsuelba = $_POST['txtsuelba'];
        $txtvalorhs = $_POST['txtvalorhs'];
	}
	else
		$mensaje="No se pudo agregar valor";
	
	
	
}
else
	$mensaje="No se pudo conectar con la base de datos";

mysqli_close($conexion);

Cabecera();

AbreContenido();

FormularioParam($id,$suelba, $valorhs);
	  
CierraContenido();


?>
