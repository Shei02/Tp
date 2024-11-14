<?php

function Cabecera()
{
	?>
	<!DOCTYPE html> 
<html lang="en"> 
  
<head> 
    <title> 
       Agenda
    </title> 
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

</head> 
	
	<?php
}
function BarraMenu()
{
	?>
	
	  <nav class="navbar navbar-expand-sm bg-info navbar-dark">
			<a class="navbar-brand" href="index.php">Agenda</a>
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="agregar.php">Agregar</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Listado</a>
				</li>
				
				
			</ul>
		</nav>
	
	<?php
}

function AbreContenido()
{
	?>
	<body> 
    
      <div class="wrapper"> 
    
	<?php
	BarraMenu();
}	  

function Pie()
{
	?>
	 
    
      <div class="container p-3 my-3 bg-primary text-white text-center"> 
	     Agenda Personal <i class="fa fa-copyright"></i> 7° Info 2020
      </div> 
	<?php
	
}	  


function CierraContenido()
{
	
	     Pie();
    ?>		 
         </div> 
       
    
     </body> 
  
     </html> 
	<?php
}
function db_connect()
{
  $host="localhost"; //servidor donde esta la base de datos
  $usuario="sheila.artaza"; //usuario de la base de datos
  $clave="sheart7"; //contraseña para el usuario de la base de datos
  $bd="Sheila"; //nombre de la base de datos
  
    
   $result = mysqli_connect($host, $usuario, $clave, $bd);
   if (!$result)
   {
	  
      return false;
   }
   

   return $result;
}
function FormularioAlta()
{
?>	
<div class="container border">

<form action="addPersona.php" method="post">
<fieldset>
  <legend>Informaci&oacute;n Personal</legend>
  
  <div class="form-group row">
    <label for="txtapellido" class="col-2 col-form-label">Apellido</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtapellido" name="txtapellido" placeholder="Escriba su apellido" type="text" class="form-control" required="required"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtnombre" class="col-2 col-form-label">Nombre</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtnombre" name="txtnombre" placeholder="Escriba su nombre" type="text" required="required" class="form-control"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtdirec" class="col-2 col-form-label">Direcci&oacute;n</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtdirec" name="txtdirec" placeholder="Escriba su direcci&oacute;n" type="text" class="form-control"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtlocal" class="col-2 col-form-label">Localidad</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtlocal" name="txtlocal" placeholder="Escriba su localidad" type="text" class="form-control"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtpcia" class="col-2 col-form-label">Pcia.</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtpcia" name="txtpcia" placeholder="Escriba su provincia" type="text" class="form-control" required="required"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txttel" class="col-2 col-form-label">Tel&eacute;fono</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-phone-square"></i>
          </div>
        </div> 
        <input id="txttel" name="txttel" placeholder="Escriba su n&uacute;mero de tel&eacute;fono" type="text" class="form-control"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div> 
  <div class="form-group row">
    <div class="offset-4 col-8">
      <button name="submit" type="submit" class="btn btn-primary">Guardar</button>
	  <button name="submitres" type="reset" class="btn btn-primary">Limpiar</button>
    </div>
  </div>
  </fieldset>
</form>

</div>	
	
	
<?php	
	
}
  ?>
