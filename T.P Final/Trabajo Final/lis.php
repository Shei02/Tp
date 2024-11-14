<?php

require_once('funciones.php');

$mes=$_POST['mes'];

Cabecera();

AbreContenido();

ListadoGeneral($mes);


	
CierraContenido();


?>
