<%-- 
    Document   : index
    Created on : Jul 18, 2016, 3:50:08 PM
    Author     : eraykorz
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Accueil fake uber</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body >
        
        <div class="header">
            <c:import url="_HEADER.jsp" />
        </div>
        
<div class="container">
    

    <div class="omb_login">
        <h3 class="omb_authTitle">Identification ou <a href="inscription.jsp">Inscription</a></h3>
        <div class="row omb_row-sm-offset-3 omb_socialButtons">
            <div class="col-xs-4 col-sm-2">
                <a href="#" class="btn btn-lg btn-block omb_btn-facebook">
                    <i class="fa fa-facebook visible-xs"></i>
                    <span >Facebook</span>
                </a>
            </div>
            <div class="col-xs-4 col-sm-2">
                <a href="#" class="btn btn-lg btn-block omb_btn-twitter">
                    <i class="fa fa-twitter visible-xs"></i>
                    <span >Twitter</span>
                </a>
            </div>  
            <div class="col-xs-4 col-sm-2">
                <a href="#" class="btn btn-lg btn-block omb_btn-google">
                    <i class="fa fa-google-plus visible-xs"></i>
                    <span >Google+</span>
                </a>
            </div>  
        </div>

        <div class="row omb_row-sm-offset-3 omb_loginOr">
            <div class="col-xs-12 col-sm-6">
                <hr class="omb_hrOr">
                <span class="omb_spanOr">OU</span>
            </div>
        </div>

        <div class="row omb_row-sm-offset-3">
            <div class="col-xs-12 col-sm-6">   
                <form class="omb_loginForm" action="login" autocomplete="off" method="POST" role="form">
                    <div class="input-group">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                        <input type="text" class="form-control" id="name" name="login" placeholder="identifiant">
                    </div>
                    <span class="help-block"></span>
                                        
                    <div class="input-group">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                        <input type="password" class="form-control" id="name" name="pwd" placeholder="mot de passe">
                    </div>

                    <br>

                    <input id="submit" name="submit" type="submit" value="Valider" class="btn btn-primary">

                </form>
            </div>
        </div>
        
    </div>

</div>

    
        <div class="footer">
            <div class="container">
                <div class="row">

                    <div class="col-md-6 panel">
                        <div class="panel-body">
                            <p class="simplenav">
                                <a href="index.html">Accueil</a> | 
                                <a href="sitemap.html">Sitemap</a> 
                            </p>
                        </div>
                    </div>

                    <div class="col-md-6 panel">
                        <div class="panel-body">
                            <p class="text-right">
                                Copyright &copy; 2016. site by LI Jin Hao, Groux Baptiste, Lemeriel David 
                            </p>
                        </div>
                    </div>

                </div>
                <!-- /row of panels -->
            </div>
        </div>
    

        
            <script type='text/javascript' src='js/jquery.min.js'></script>

            <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
