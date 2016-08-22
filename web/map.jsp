<%-- 
    Document   : map
    Created on : Jul 18, 2016, 4:51:43 PM
    Author     : eraykorz
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Map</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
        
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!--link rel="stylesheet" type="text/css" href="css/style.css" hao-->

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->


    </head> 
      
    <body onload="initialize();">
        <div class="header">
            <c:import url="_HEADER.jsp" />
        </div>
        
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        
        <div class="container">
        <!--<div class="contenu">-->
            
        <div id="destinationForm">
            <form action="" method="get" name="direction" id="direction">
                <label class="desti">Destination :</label>
                <input type="text" name="destination" id="destination">
                <input type="button" value="Calculer l'itinéraire" onclick="initCalcul();">
            </form>

        </div>

        <div id="map" style="height:580px; border: 1px solid black;"></div>

        <div id="panel"></div>
        
        <div>page resultat</div>
        <div id="infoposition"></div>

        <div id="driver_list">

            <c:forEach items="${drivers}" var="driver">
                <div id="driver">
                    <div class="img_driver"><img src="img/taxi_profile.png" /></div>
                    <div class="driver_info">
                        <h4>${driver.login}</h4>
                    </div>
                    <a href="trajet?idTaxi=${driver.id}"><button>demander</button></a>
                </div>
            </c:forEach>
        </div>

        </div>
        
        <script src="jquery/jquery-2.2.4.min.js"></script>
        <script src="http://maps.google.com/maps/api/js?key=AIzaSyB3MSv8tYtAx1A6gODi0h0jvTcYA7A9PfU&signed_in=true&libraries=places&callback=initMap"></script>
        <script src="js/geolocate.js"></script>
        <script src="js/bootstrap.min.js"></script> 

    </body>
</html>