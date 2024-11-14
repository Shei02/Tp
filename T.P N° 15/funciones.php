>?php

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

</head> 
	
	>?php
}
function BarraMenu()
{
	?>
	
	  <nav class="navbar navbar-expand-sm bg-info navbar-dark">
			<a class="navbar-brand" href="#">Agenda</a>
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="#">opcion 1</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">opcion 2</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">opcion 3</a>
				</li>
				
			</ul>
		</nav>
	
	>?php
}

function AbreContenido()
{
	?>
	<body> 
    
      <div class="wrapper"> 
    
	>?php
	BarraMenu();
}	  

function Pie()
{
	?>
	    
      <div class="wrapper"> 
	     Poner algo como pie
      </div> 
	>?php
	
}	

function CierraContenido()
{
	
	     Pie();
    ?>		 
         </div> 
       
    
     </body> 
  
     </html> 
	>?php

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
	
	
}
  ?>
