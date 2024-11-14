<?Php

$Nombre = $_POST['nombre'];
$Contra = $_POST['password'];
$Email = $_POST['correo'];
$Casilla = $_POST['casilla'];
$nacionalidad = $_POST['menu'];

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
	  <td><?php echo $Nombre; ?></td>
	</tr>
    <tr>
	  <td>Email</td>
	  <td><?php echo $Email; ?></td>
	</tr> 
	<tr>
	  <td>Casilla</td>
	  <td><?php echo $Casilla; ?></td>
	</tr> 
	<tr>
	  <td>Nacionalidad</td>
	  <td><?php echo $nacionalidad; ?></td>
	</tr> 
	
	</table>

</body>
</html>


<?php


?>