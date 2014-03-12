<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cr&eacute;er evaluation </title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet"> -->

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
	<link rel="stylesheet" type="text/css" media="screen"
     href="css/datepicker.min.css">
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
  </head>

  <body>

    <div id="wrapper">

      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	  <div id="charte-ubo"><img src="img/charte-ubo.png"/></div>
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
       
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav side-nav">
           <li class="active"><a href="index.html"><i class="fa fa-file"></i> Accueil</a></li>
		  <li><a href="#"><i class="fa fa-table"></i> Liste des &eacute;valuation</a></li>
		  <li><a href="#"><i class="fa fa-pencil"></i> Cr&eacute;er &eacute;valuation</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </nav>

      <div id="page-wrapper">

        <div class="row">
   <span style="float:right;">  <a href="#" class="dropdown-toggle" data-toggle="dropdown" align="right"><i class="fa fa-user"></i> Pilippe Saliou<b class="caret"></b></a></span>
            <h2>Cr&eacute;er &eacute;valuation</h2>
        
  </div>
		<div class="row">
		 <div class="col-lg-2">
		 <span>Formation</span><br><br><br>
		 <span>Promotion</span><br><br>
		 <span>Etat</span><br><br><br>
		 <span>Periode de cours</span>
		 </div>
		 <div class="col-lg-2">
		    <span><select id="formation" class="form-control">
                     <option>Test</option>
                </select>
			</span><br>
		    <span><select id="formation" class="form-control">
                    <option>Test</option>
                  </select>
			</span><br>
		    <span><select id="formation" class="form-control">
                    <option>Test</option>
                  </select>
		    </span><br>
		    <span><input type="text" id="Periode"></span>
		 </div>
		  <div class="col-lg-2">
		 <span>Evaluation</span><br><br><br>
		 <span>Unit&eacute; d'enseignement</span><br><br>
		 <span>Disponibilit&eacute; de l'&eacute;valuation</span><br><br>
		 <span>Designation</span>
		 </div>
		 <div class="col-lg-2">
		 <span><input type="text" id="Evaluation"></span><br><br>
		  <span><select id="UE" class="form-control">
                    <option>Test</option>
                  </select>
		    </span>
		 <span>Du<div id="datetimepicker" class="input-append date">
      <input type="text"></input>
      <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
    </div>
</span><br>
		 <span><input type="text" id="Designation"></span>
		 </div>
		 <div class="col-lg-2">
		 <br>
		 <span>Responsable</span><br>
		 <span><input type="text" id="responsable"></span><br><br>
		 <span>Au<div id="datetimepicker" class="input-append date">
      <input type="text"></input>
      <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
    </div>
</span>
		
		 </div>
        </div><!-- /.row -->
		   
           
		<hr>
		
		  <p> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Ajouter Rubriques</button></p>
		  <div class="row">
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title">Liste des Rubriques</h4>
      </div>
      <div class="modal-body">
     <table width='300' align='center'><tr><td>Cours</td> <td> <input type="checkbox" value="" ></td></tr>
	  <tr><td>travaux pratiques</td><td> <input type="checkbox" value=""></td></tr></table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Annuler</button>
        <button type="button" class="btn btn-primary">Ok</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
		</div><!-- /.row -->
		
		
		<div class="row">
            <div class="panel panel-primary">
              <div class="panel-heading">
			  <span style="float:right;"> <button type="button" class="btn btn-default">Ajouter Question</button></span>
                <h3 class="panel-title"><i class="fa fa-trash-o fa-lg"></i> Cours</h3>
				  
              </div>
              <div class="panel-body">
                 <div class="table-responsive">
                  <table class="table table-bordered table-hover table-striped tablesorter">
                    <thead>
                      <tr>
                        <th>Question</th>
                        <th>Qualificatif min</th>
                        <th>Qualificatif max</th>
                        <th>enlever</th>
						<th>Ordonner</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
						<td></td>
                      </tr>
					    </tbody>
                  </table>
                </div>
				</div>
				 <div class="panel panel-primary">
              <div class="panel-heading" >
			   <span style="float:right;"> <button type="button" class="btn btn-default">Ajouter Question</button></span>
                <h3 class="panel-title"><i class="fa fa-trash-o fa-lg"></i>Travaux Diriges </h3>
				
              </div>
              <div class="panel-body">
                 <div class="table-responsive">
                  <table class="table table-bordered table-hover table-striped tablesorter">
                    <thead>
                      <tr>
                        <th>Question</th>
                        <th>Qualificatif min</th>
                        <th>Qualificatif max</th>
                        <th>enlever</th>
						<th>Ordonner</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
						<td></td>
                      </tr>
					    </tbody>
                  </table>
                </div>
				</div>
             
         
             </div>
			<center> <button  type="button" class="btn btn-primary">Valider</button>
			 <button  type="button" class="btn btn-primary">Annuler</button></center>
			 
			 	</div><!-- /.row -->

       

      </div><!-- /#page-wrapper -->

    </div><!-- /#wrapper -->

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>
	<script type="text/javascript"
     src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
    </script>
	<script type="text/javascript">
      $('#datetimepicker').datetimepicker({
        format: 'dd/MM/yyyy',
        language: 'fr-FR'
      });
    </script>
	
    <!-- Page Specific Plugins -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
    <script src="js/morris/chart-data-morris.js"></script>
    <script src="js/tablesorter/jquery.tablesorter.js"></script>
    <script src="js/tablesorter/tables.js"></script>

  </body>
</html>
