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
					<a class="nav-link" href="listado.php">Listado</a>
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

function Mensaje($m, $modo)
{
	if ($modo == "si")
	{
	?>
	<div class="alert alert-success">
	<?php
	
	echo $m;
	
	?>
	</div>
	<?php
	}
	
	else
	{
	 ?>
	 <div class="alert alert-warning">
	 <?php
	
	echo $m;
	
	?>
	</div>
	<?php
	}	
	
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
    <label for="txtmail" class="col-2 col-form-label">Mail</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-phone-square"></i>
          </div>
        </div> 
        <input id="txtmail" name="txtmail" placeholder="Escriba su direcci&oacute;n de mail" type="email" class="form-control"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
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

<?php	
	
}

function CrearListado()
{
	?>
	
	      <div class="row">
                <div class="col-md-12">
                    <div class="page-header clearfix">
                        <h2 class="pull-left">Agenda</h2>
                        <a href="agregar.php" class="btn btn-success pull-right">Agregar</a>
                    </div>
                    <?php
                    $conexion = db_connect(); 
    
                    $sql = "SELECT * FROM Agenda";
                    $result = mysqli_query($conexion, $sql);
                    if($result){
                        if(mysqli_num_rows($result) > 0){
                            echo "<table class='table table-bordered table-striped'>";
                                echo "<thead>";
                                    echo "<tr>";
                                        echo "<th>#</th>";
                                        echo "<th>Apellido</th>";
			     echo "<th>Nombre</th>";
                                        echo "<th>Direcci&oacute;n</th>";
                                        echo "<th>Localidad</th>";
                                        echo "<th>Pcia.</th>";
			     echo "<th>Tel&eacute;fono</th>";
			     echo "<th>Mail</th>";
			     echo "<th>Acci&oacute;n</th>";
                                    echo "</tr>";
                                echo "</thead>";
                                echo "<tbody>";
                                while($row = mysqli_fetch_array($result)){
                                    echo "<tr>";
                                        echo "<td>" . $row['ID'] . "</td>";
                                        echo "<td>" . $row['Apellido'] . "</td>";
                                        echo "<td>" . $row['Nombre'] . "</td>";
                                        echo "<td>" . $row['Direccion'] . "</td>";
                                        echo "<td>" . $row['Localidad'] . "</td>";
			     echo "<td>" . $row['Provincia'] . "</td>";
			     echo "<td>" . $row['Telefono'] . "</td>";
			     echo "<td>" . $row['Mail'] . "</td>";
                                        echo "<td>";
                                            
                                        
			     echo "<a href='actualizar.php?id=". $row['ID'] ."' title='Actualizar' data-toggle='tooltip'><i class='fa fa-edit'></i></a>";
                                            
                                         echo "<a href='borrar.php?id=". $row['ID'] ."' title='Borrar' data-toggle='tooltip'><i class='fa fa-trash'></i></a>";
                                        echo "</td>";
                                    
                                    echo "</tr>";
                                }
                                echo "</tbody>";   
                                                    
                            echo "</table>";
                            
                           
                            mysqli_free_result($result);
                        } else{
                            Mensaje("No hay registros de personas para mostrar", "no");
                        }
                    } else{
                        Mensaje("Hay un problema para recuperar los datos de la Agenda", "no");
                    }
                    mysqli_close($conexion);
                    ?>
                </div>
         </div>
		 
<?php	
	
}
		 
function FormularioEdicion ($id,$apellido,$nombre,$dire,$local,$pcia,$tel,$mail)
{
?>	
<div class="container border">

<form action="modifPersona.php" method="post">
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
        <input id="txtapellido" name="txtapellido" placeholder="Escriba su apellido" type="text" class="form-control" required="required" value=<?php echo $apellido; ?>> 
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
        <input id="txtnombre" name="txtnombre" placeholder="Escriba su nombre" type="text" required="required" class="form-control" value=<?php echo $nombre; ?>> 
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
        <input id="txtdirec" name="txtdirec" placeholder="Escriba su direcci&oacute;n" type="text" class="form-control" value=<?php echo $dire; ?>> 
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
        <input id="txtlocal" name="txtlocal" placeholder="Escriba su localidad" type="text" class="form-control" value=<?php echo $local; ?>> 
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
        <input id="txtpcia" name="txtpcia" placeholder="Escriba su provincia" type="text" class="form-control" required="required" value=<?php echo $pcia; ?>> 
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
        <input id="txttel" name="txttel" placeholder="Escriba su n&uacute;mero de tel&eacute;fono" type="text" class="form-control" value=<?php echo $tel; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div> 
  
  <div class="form-group row">
    <label for="txtmail" class="col-2 col-form-label">Mail</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-phone-square"></i>
          </div>
        </div> 
        <input id="txtmail" name="txtmail" placeholder="Escriba su direcci&oacute;n de mail" type="email" class="form-control" value=<?php echo $mail; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div> 
  
  <input id="id" name="id" type="hidden" value=<?php echo $id; ?>>
  
  <div class="form-group row">
    <div class="offset-5 col-7">
      <button name="submit" type="submit" class="btn btn-primary">Guardar</button>
	  
    </div>
  </div>
  </fieldset>
</form>

</div>	
	
	
<?php	
	
}

?>