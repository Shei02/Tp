<?php

function Cabecera()
{
	

	?>
	<!DOCTYPE html> 
    <html lang="en"> 
  
   <head> 
       <title> 
         Liquidación de Sueldos
       </title> 
  	
       <meta charset="utf-8">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	   
    </head> 
	
	<?php

}

function BarraMenu()
{
	?>
	
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  
	  <ul class="nav nav-pills">
		<a class="navbar-brand" href="index.php">Liquidacion De Sueldos</a>
		<li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="index.php">Empleados</a>
                            <div class="dropdown-menu">
                                   <a class="dropdown-item" href="nuevo.php">Nuevo</a>
                                   <a class="dropdown-item" href="listado.php">Listado</a>
                            </div>
                         </li>
		<li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="index.php">Sueldos</a>
                            <div class="dropdown-menu">
                                   <a class="dropdown-item" href="listadohs.php">Listado Hs Trab</a>
                                   <a class="dropdown-item" href="liquidacion.php">Liquidacion General</a>
                            </div>
                         </li>				 
        
		<li class="nav-item">
                             <a class="nav-link" href="actualizarParam.php">Parametros</a>
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
	     Liquidacion Sueldos <i class="fa fa-copyright"></i> 7° Informatica 2020
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

<form action="addEmpleado.php" method="post">
<fieldset>
  <legend>Informaci&oacute;n Personal</legend>
  
  <div class="form-group row">
    <label for="txtNombreAp" class="col-2 col-form-label">Nombre y Apellido</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtNombreAp" name="txtNombreAp" placeholder="Escriba su nombre y apellido" type="text" class="form-control" required="required"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtDNI" class="col-2 col-form-label">DNI</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-phone-square"></i>
          </div>
        </div> 
        <input id="txtDNI" name="txtDNI" placeholder="Escriba su n&uacute;mero de dni" type="text" class="form-control"> </input>
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
                        <h2 class="pull-left">Empleados</h2>
                        <a href="agregar.php" class="btn btn-success pull-right">Agregar</a>
                    </div>
                    <?php
                    $conexion = db_connect(); 
    
                    $sql = "SELECT * FROM empleados";
                    $result = mysqli_query($conexion, $sql);
                    if($result){
                        if(mysqli_num_rows($result) > 0){
                            echo "<table class='table table-bordered table-striped'>";
                                echo "<thead>";
                                    echo "<tr>";
                                        echo "<th>IdEmp</th>";
                                        echo "<th>NombreAp</th>";
			     echo "<th>DNI</th>";
				 echo "<th>Acci&oacute;n</th>";
                                 echo "</tr>";
                                echo "</thead>";
                                echo "<tbody>";
                                while($row = mysqli_fetch_array($result)){
                                    echo "<tr>";
                                        echo "<td>" . $row['IdEmp'] . "</td>";
                                        echo "<td>" . $row['NombreAp'] . "</td>";
										echo "<td>" . $row['DNI'] . "</td>";
			     
                                        echo "<td>";
                                            
                                        
										  echo "<a href='actualizar.php?id=". $row['IdEmp'] ."' title='Actualizar' data-toggle='tooltip'><i class='fa fa-edit'></i></a>";
                                            
                                         echo "<a href='carga.php?id=". $row['IdEmp'] ."' title='Carga' data-toggle='tooltip'><i class='fa fa-black-tie'></i></a>";
                                        echo "</td>";
                                    
                                    echo "</tr>";
                                }
                                echo "</tbody>";   
                                                    
                            echo "</table>";
                            
                           
                            mysqli_free_result($result);
                        } else{
                            Mensaje("No hay registros de empleados para mostrar", "no");
                        }
                    } else{
                        Mensaje("Hay un problema para recuperar los datos de los empleados", "no");
                    }
                    mysqli_close($conexion);
                    ?>
                </div>
         </div>
		 
<?php	
	
}

function FormularioEdicionEm ($IdEmp,$NombreAp,$DNI)
{
?>	
<div class="container border">

<form action="modifEmpleado.php" method="post">
<fieldset>
  <legend>Informaci&oacute;n Personal</legend>
  
  <div class="form-group row">
    <label for="txtNombreAp" class="col-2 col-form-label">Nombre y Apellido</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtNombreAp" name="txtNombreAp" placeholder="Escriba su nombre y apellido" type="text" class="form-control" required="required" value=<?php echo $NombreAp; ?>></input> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtDNI" class="col-2 col-form-label">DNI</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtDNI" name="txtDNI" placeholder="Escriba su dni" type="text" required="required" class="form-control" value=<?php echo $DNI; ?>></input> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <input id="IdEmp" name="IdEmp" type="hidden" value=<?php echo $IdEmp; ?>></input>
  
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

function FormularioHs($IdEmp,$NombreAp,$DNI)
{
	$hoy=getdate();
	$di=$hoy[mday];
	$me=$hoy[mon];
	$an=$hoy[year];
	
	$fecha=strval($an)."-".strval($me)."-".strval($di);
	
?>	
<div class="container border">

<form action="addHoras.php" method="post">
<fieldset>
  <legend>Informaci&oacute;n De Horarios</legend>
  
  <div class="form-group row">
    <label for="txtNombreAp" class="col-2 col-form-label">Nombre y Apellido</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtNombreAp" name="txtNombreAp" placeholder="Escriba su nombre y apellido" type="text" class="form-control" required="required" value=<?php echo $NombreAp; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtDNI" class="col-2 col-form-label">DNI</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtDNI" name="txtDNI" placeholder="Escriba su dni" type="text" required="required" class="form-control" value=<?php echo $DNI; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div> 
  
  <div class="from-group row">
    <label for="txtFecha" class="col-2 col-form-label">FECHA</label>
	<div class="col-8">
	<div class="input-group">
	<div class="input-group-prepend">
	<div class="input-group-text">
	<i class="fa fa-edit"></i>
   </div>
  </div>
	<input id="fecha" name="fecha" type="date" required="required" class="form-control" value=<?php echo $fecha; ?>>
	<div class="input-group-prepend">
	<div class="input-group-text">
	<i class="fa fa-angle-right"></i>
	</div>
	</div>
	</div>
	</div>
	</div>
	
<div class="from-group row">
    <label for="txtcanths" class="col-2 col-form-label">Cant. HS</label>
	<div class="col-8">
	<div class="input-group">
	<div class="input-group-prepend">
	<div class="input-group-text">
	<i class="fa fa-edit"></i>
   </div>
  </div>
	<input id="txtcanths" name="txtcanths" placeholder="Ingrese horas trabajadas" type="text" required="required">
	<div class="input-group-prepend">
	<div class="input-group-text">
	<i class="fa fa-angle-right"></i>
	</div>
	</div>
	</div>
	</div>
	</div>	
  
   <input id="IdEmp" name="IdEmp" type="hidden" value=<?php echo $IdEmp; ?>>
  	
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

function CrearListadoHs()
{
	?>
	  <div class="row">
	     <div class="col-md-12">
		 <div class="page-header clearfix">
		    <h2 class="pull-left">Empleados</h2>
			<a href="agregar.php" class="btn btn-success pull-right">Agregar</a>
		</div>
        <?php
		
        $conexion = db_connect();
        $sql = "SELECT hstrabajadas.IdHsTrab, empleados.NombreAp, hstrabajadas.Mes, hstrabajadas.Dia, hstrabajadas.CantHs FROM hstrabajadas inner join empleados on hstrabajadas.IdEmp = empleados.IdEmp order by empleados.NombreAp";		
        $result = mysqli_query($conexion, $sql);
		
		if ($result) {
			
			if(mysqli_num_rows($result) > 0) {
				echo "<table class='table table-bordered table-striped'>";
					echo "<thead>";
				         echo "<tr>";
						    echo "<th>#</th>";
							echo "<th>Nombre y Apellido</th>";
							echo "<th>Mes</th>";
							echo "<th>Dia</th>";
							echo "<th>Cant Horas</th>";
							echo "<th>Acci&oacute;n</th>";
						echo "</tr>";
					echo "</thead>";
					echo "<tbody>";
					
					while($row = mysqli_fetch_array($result)) {
						echo "<tr>";
			                echo "<td>" . $row[0] . "</td>";
							echo "<td>" . $row[1] . "</td>";
							echo "<td>" . $row[2] . "</td>";
							echo "<td>" . $row[3] . "</td>";
							echo "<td>" . $row[4] . "</td>";
							echo "<td>";
							
							echo "<a href='borrar.php?IdHsTrab=" . $row[0] ."' title='Borrar Hs Trabajadas' data-toggle='tooltip'><i class='fa fa-trash'></i></a>";
                            echo "</td>";
						echo "</tr>";	
						}
					echo "</tbody>";
				echo "</table>";
				mysqli_free_result($result);
			} 
			else 
			{
				Mensaje("No hay registros para mostrar", "no");
			}
		} 
		else 
		   {
			
			Mensaje("Hay un problema para recuperar datos", "no");
			}
                    
		mysqli_close($conexion);
        ?>
       </div>
    </div>
		 
<?php	
	
}
           		  							
function FormularioParam($id, $suelba,$valorhs)
{
   ?>	
       <div class="container border">

           <form action="modParametros.php" method="post">
           <fieldset>
           <legend>Informaci&oacute;n Parametros</legend>
  
  <div class="form-group row">
    <label for="txtsuelba" class="col-2 col-form-label">Sueldo Basico</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtsuelba" name="txtsuelba" placeholder="Escriba sueldo basico" type="text" class="form-control" required="required"> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtvalorhs" class="col-2 col-form-label">Valor Hora</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtvalorhs" name="txtvalorhs" placeholder="Escriba valor hora" type="text" required="required" class="form-control"> 
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

function ListadoSueldo()
{
	?>
	
	      <div class="row">
                <div class="col-md-12">
                    <div class="page-header clearfix">
                        <h2 class="pull-left">Parametros</h2>
                        <a href="agregarParam.php" class="btn btn-success pull-right">Agregar</a>
                    </div>
                    <?php
                    $conexion = db_connect(); 
    
                    $sql = "SELECT * FROM parametros";
                    $result = mysqli_query($conexion, $sql);
                    if($result){
                        if(mysqli_num_rows($result) > 0){
                            echo "<table class='table table-bordered table-striped'>";
                                echo "<thead>";
                                    echo "<tr>";
                                        echo "<th>IdParam</th>";
                                        echo "<th>SueldoBas</th>";
			     echo "<th>ValorHora</th>";
				 echo "<th>Acci&oacute;n</th>";
                                 echo "</tr>";
                                echo "</thead>";
                                echo "<tbody>";
                                while($row = mysqli_fetch_array($result)){
                                    echo "<tr>";
                                        echo "<td>" . $row['IdParam'] . "</td>";
                                        echo "<td>" . $row['SueldoBas'] . "</td>";
										echo "<td>" . $row['ValorHora'] . "</td>";
			     
                                        echo "<td>";
                                            
                                        
										  echo "<a href='actualizarParam.php?id=". $row['IdParam'] ."' title='Actualizar' data-toggle='tooltip'><i class='fa fa-edit'></i></a>";
                                            
                                        echo "</td>";
                                    
                                    echo "</tr>";
                                }
                                echo "</tbody>";   
                                                    
                            echo "</table>";
                            
                           
                            mysqli_free_result($result);
                        } else{
                            Mensaje("No hay registros de parametros para mostrar", "no");
                        }
                    } else{
                        Mensaje("Hay un problema para recuperar los datos de parametros", "no");
                    }
                    mysqli_close($conexion);
                    ?>
                </div>
         </div>
		 
<?php	
	
}

function FormularioEdicion ($id,$suelba,$valorhs)
{
?>	
<div class="container border">

<form action="modParametros.php" method="post">
<fieldset>
  <legend>Informaci&oacute;n Parametros</legend>
  
  <div class="form-group row">
<label for="txtSueldoBas" class="col-2 col-form-label">SueldoBas</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtSueldoBas" name="txtSueldoBas" placeholder="Escriba el sueldo" type="text" class="form-control" required="required" value=<?php echo $suelba; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <label for="txtvalorhs" class="col-2 col-form-label">ValorHs</label> 
    <div class="col-8">
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">
            <i class="fa fa-edit"></i>
          </div>
        </div> 
        <input id="txtvalorhs" name="txtValorHora" placeholder="Escriba el valor" type="text" required="required" class="form-control" value=<?php echo $valorhs; ?>> 
        <div class="input-group-append">
          <div class="input-group-text">
            <i class="fa fa-angle-right"></i>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <input id="id" name="IdParam" type="hidden" value=<?php echo $id; ?>>
  
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

function FormularioLiquidacion()
{
?>
<div class="container border">
	
<form action="lis.php" method="post">
<fieldset>
	<legend> Liquidar Mes de </legend>
	
	<div class="form-group row">
	   <label font="txtmes" class="col-2 col-form-label">Mes</label>
	   <div class="col-8">
	     <div class="input-group">
	      <div class="input-group-prepend">
	       <div class="input-group-text">
	         <i class="fa fa-edit"></i>
		   </div>
          </div>

        <select name="mes">
            <option value="1">Enero</option>
			<option value="2">Febrero</option>
			<option value="3">Marzo</option>
			<option value="4">Abril</option>
			<option value="5">Mayo</option>
			<option value="6">Junio</option>
			<option value="7">Julio</option>
			<option value="8">Agosto</option>
			<option value="9">Septiembre</option>
			<option value="10">Octubre</option>
			<option value="11">Noviembre</option>
			<option value="12">Diciembre</option>
		</select>
        <div class="input-group-append">
	</div>

    <div class="form-group row">
      <div class="offset-4 col-8">
      <button name="submit" type="submit" class="btn btn-primary">Liquidar Sueldo</button>

	</div>
</div>
</fieldset>
</form>
</div>

<?php
}	
        		

function ListadoGeneral($mes)
{
	?>
	  <div class="row">
	     <div class="col-md-12">
		 <div class="page-header clearfix">
		    <h2 class="pull-left">Liquidacion de Sueldos de Empleados - Mes <?php echo nombremes($mes); ?> </h2>
		</div>
        <?php
		
        $conexion = db_connect();
		$sql = "SELECT * FROM parametros";
		$result = mysqli_query($conexion, $sql);
		if ($result)
	{
                       $datos = mysqli_fetch_array($result);
		

		$suelba=$datos['SueldoBas'];
		$valorhs=$datos['ValorHora'];
		$idpar=$datos['IdParam'];
		
		$sql = "SELECT * FROM empleados";
		$result = mysqli_query($conexion, $sql);
		
		echo "<table class='table table-bordered table-striped'>";
					echo "<thead>";
				         echo "<tr>";
							echo "<th>Nombre y Apellido</th>";
							echo "<th>Cant Horas</th>";
							echo "<th>Total a Cobrar</th>";
						echo "</tr>";
					echo "</thead>";
					echo "<tbody>";
					
					while($row=mysqli_fetch_array($result))
	                {
						$idempleado=$row['IdEmp'];					
					    $nombre=$row['NombreAp'];

					$sql="SELECT SUM(CantHs) FROM hstrabajadas where IdEmp='$idempleado' AND Mes='$mes'";
					$resulths = mysqli_query($conexion, $sql);
						if($rowhs=mysqli_fetch_array($resulths))	
						{
							echo "<tr>";
							echo "<td>" . $nombre . "</td>";
							echo "<td>" . $rowhs[0] . "</td>";
							
							$totalsueldo=$rowhs[0]*$valorhs + $suelba;
							echo "<td>" . strval($totalsueldo) . "</td>";
							
							echo "</tr>";
						}
					}
					echo "</tbody>";
				echo "</table>";
		
		
	}
	else
		$mensaje="No se pudo liquidar sueldo";                
		
		mysqli_close($conexion);
        ?>
       </div>
    </div>
		 
<?php	
	
}
				
function nombremes($mes)
{
	
	if ($mes == 1)
		return "Enero";
	
	if ($mes == 2)
		return "Febrero";
	
	if ($mes == 3)
		return "Marzo";
	
	if ($mes == 4)
		return "Abril";
	
	if ($mes == 5)
		return "Mayo";
	
	if ($mes == 6)
		return "Junio";
	
	if ($mes == 7)
		return "Julio";
	
	if ($mes == 8)
		return "Agosto";
	
	if ($mes == 9)
		return "Septiembre";
	
	if ($mes == 10)
		return "Octubre";
	if ($mes == 11)
		return "Noviembre";
	
	if ($mes == 12)
		return "Diciembre";
	
	
}

?>