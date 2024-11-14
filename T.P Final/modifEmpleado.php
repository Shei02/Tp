<?php

require_once('funciones.php');


$id = $_POST['IdEmp'];
$txtnombreyap = $_POST['txtnombreyap'];
$txtdni = $_POST['txtdni'];

$conexion = db_connect();


  
if ($conexion) {
    
	
	

                     

            $modifcorrecta = mysqli_query($conexion,"UPDATE empleados SET NombreAp='$txtnombreyap', DNI='$txtdni' where IdEmp = '$id'");
	
	if ($modifcorrecta)
		$mensaje="Se modifcaron los datos de un empleado";
	else
		$mensaje="No se pudo modificar los datos de un empleado";
	
	mysqli_close($conexion);
	
}
else
	$mensaje="No se pudo conectar con la base de datos";



Cabecera();

AbreContenido();

if ($conexion && $modifcorrecta)
{
   Mensaje($mensaje,"si");	
   CrearListado();
}
   else
   Mensaje($mensaje,"no");	  

	
CierraContenido();


?>


