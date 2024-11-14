<?Php

$nombre = $_POST['nombre'];
$apellidos  = $_POST['apellidos'];
$email = $_POST['correo'];
$telefono = $_POST['menu'];
$alojamiento = $_POST['menu'];
$casilla =$_POST['casilla'];

?>

<html>
<head>
  <title> Datos del Formulario </title>
  </head>
<body>

   <h1>Datos Ingresados </h1>
   
   <table border="1">
    <tr>
	  <td>Campo</td>
	  <td>Valor</td>
	</tr> 
	
	<tr>
	  <td>Nombre</td>
	  <td><?php echo $nombre; ?></td>
	</tr>
	<tr>
	  <td>Apellidos</td>
	  <td><?php echo $apellidos; ?></td>
	</tr>
    <tr>
	  <td>Email</td>
	  <td><?php echo $email; ?></td>
	</tr> 
	<tr>
	  <td>Telefono</td>
	  <td><?php echo $telefono; ?></td>
	</tr> 
	<tr>
	  <td>Alojamiento</td>
	  <td><?php echo $alojamiento; ?></td>
	</tr> 
	<tr>
	   <td>Casilla</td>
	   <td><?php echo $casilla; ?></td>
	</tr>
	</table>

</body>
</html>


<?php


?>