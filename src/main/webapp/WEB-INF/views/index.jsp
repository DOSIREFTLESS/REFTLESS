<%@page import="com.scrum.evae.metier.model.Enseignant" 
		import="java.util.ArrayList"
		import="java.util.Iterator"
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--     <meta charset="utf-8"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Gestion evaluation -Accueil</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
  </head>
  	
  <body>
	<form action="<%=request.getContextPath()%>/listEvaluation.html" method="post">
    <div id="wrapper">

      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	  <div id="charte-ubo"><img src="<%=request.getContextPath()%>/img/charte-ubo.png"/></div>
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
       
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav side-nav">
           <li class="active"><a href="#"><i class="fa fa-file"></i> Accueil</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </nav>

      <div id="page-wrapper">

        <div class="row">
          <div class="col-lg-12">
            <h1>Liste des enseignants </h1>
            <ol class="breadcrumb">             
            </ol>
            <div class="alert alert-success alert-dismissable">
          <select name="listEnseigant" class="form-control">
          	
          	<%
    		ArrayList<Enseignant> listEnseignant = new ArrayList<Enseignant>();
        	listEnseignant = (ArrayList<Enseignant>) request.getAttribute("listEnseignant");

   		    for(Iterator<Enseignant> it = listEnseignant.iterator(); it.hasNext();){
   			    Enseignant ens = it.next();
       		 	out.println("<option value="+ ens.getNoEnseignant() +">"+ ens.getNom() +" "+ens.getPrenom() +"</option>");
    		
   		    }      
			%>          	                   
                  </select>
            </div>
		  <button type="submit" class="btn btn-primary">OK</button>
          </div>
        </div><!-- /.row -->

       

      </div><!-- /#page-wrapper -->

    </div><!-- /#wrapper -->
	</form>
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
