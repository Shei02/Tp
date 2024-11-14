<?Php

$Nombre = $_POST['nombre'];
$Contra = $_POST['password'];
$Email = $_POST['correo'];
$Casilla = $_POST['casilla'];
$nacionalidad = $_POST['menu'];

echo "El nombre es ";
echo $Nombre;
echo "<br>";
echo "El correo es ";
echo $Email;
echo "<br>";
echo "la opcion es ";
echo $Casilla;
echo "<br>";
echo "La nacionalidad es ";
echo $nacionalidad;

?>