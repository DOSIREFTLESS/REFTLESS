<%@page import="com.scrum.evae.metier.model.Evaluation" 
		import="java.util.ArrayList"
		import="java.util.Iterator"
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Gestion evaluation</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
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
          </ul>
        </div><!-- /.navbar-collapse -->
      </nav>

      <div id="page-wrapper">

        <div class="row">
   <span style="float:right;">  <a href="#" class="dropdown-toggle" data-toggle="dropdown" align="right"><i class="fa fa-user"></i> Pilippe Saliou<b class="caret"></b></a></span>
            <h2>Gestion des d'&eacute;valuation</h2>
          <br><br>
			  <span style="float:right;"> <button  type="button" class="btn btn-danger"><a href="creation-evaluation.html">Cr&eacute;er</a></button></span>
			 <br><br><br>
            <div class="table-responsive" >
              <table width="80%" align="center" class="table table-bordered table-hover tablesorter">
                <thead>
                  <tr>
				    <th width="15%">Formation <i class="fa fa-sort"></i></th>
                    <th width="15%">Promotion<i class="fa fa-sort"></i></th>
                    <th width="26%">Designation <i class=""></i></th>                
                    <th width="11%">Etat <i class=""></i></th>
					<th width="10%">Modifier <i class=""></i></th>
					<th width="10%">Supprimer<i class=""></i></th>
                  </tr>
                </thead>
                <tbody>
                  
                  <%
		    		ArrayList<Evaluation> evaluations = new ArrayList<Evaluation>();
		        	evaluations = (ArrayList<Evaluation>) request.getAttribute("listEvaluation");
		   		    for(Iterator<Evaluation> it = evaluations.iterator(); it.hasNext();){
		   			    Evaluation evae = it.next();
		       		 	
		    		     
				  %>   
				  <tr>
                    <% out.println(
                    "<td>"+ evae.getCodeFormation() +"</td>"
     				+"<td>"+ evae.getAnneePro()  +"</td>"
     				+"<td>"+ evae.getDesignation()  +"</td>"
     				+"<td>"+ evae.getEtat()  +"</td>"
                    );%>
					<td align="center"><a href="#"><i class="fa fa-edit"></i></a></td>
				    <td align="center"><a href="#"><i class="fa fa-trash-o fa-lg"></i></a></td>
					
                  </tr>
                  <%
                  	}
		   		  %>
                </tbody>
              </table>
          </div>
        </div>
        </div><!-- /.row -->

       

      </div><!-- /#page-wrapper -->

    </div><!-- /#wrapper -->

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>

    <!-- Page Specific Plugins -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
    <script src="js/morris/chart-data-morris.js"></script>
    <script src="js/tablesorter/jquery.tablesorter.js"></script>
    <script src="js/tablesorter/tables.js"></script>

  </body>
</html>
