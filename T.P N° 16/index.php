<?php

require_once('funciones.php');


$conexion = db_connect();

Cabecera();

AbreContenido();

echo "web ok";

echo "<br>";

if ($conexion)    
    echo "La conexión con la base de datos está correcta";
else
    echo "Hay un error en la conexión con la base de datos";
	
CierraContenido();

?>
