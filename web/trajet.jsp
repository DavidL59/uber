<%-- 
    Document   : trajet
    Created on : 10 août 2016, 10:15:30
    Author     : admin
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
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
        
        <link rel="stylesheet" type="text/css" href="css/style.css"> 
        <!--<link rel="stylesheet" type="text/css" href="css/style.css" hao-->
        

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
  
    </head>
    <body>
        
        <div class="header">
            <c:import url="_HEADER.jsp" />
        </div>
        
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        
        <div class="container">
        <!--<div class="contenu">-->
            
             <table class="trajet_table">
                <thead>
                    <th><img src="img/taxi_profile.png" alt="driver_image_profil" /></th>
                    <th></th>
                    <th><img src="img/noimage.jpg" alt="passenger_image_profil" /></th>
                </thead>
                <tbody>
                    <tr>
                        <td><p>${taxiDemande.login}</p></td>
                        <td><p>${taxiDemande.login} Transporte ${utilConnecte.login}</p></td>
                        <td><p>${utilConnecte.login}</p></td>
                    </tr>
                    <tr>
                        <td colspan=3><a href="notation"><button>Fin Trajet</button></a></td>
                    </tr>
                </tbody>
            </table>
                    
        </div>
                    
        <script src="jquery/jquery-2.2.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>