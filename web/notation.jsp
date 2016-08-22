<%-- 
    Document   : notation
    Created on : 10 août 2016, 12:32:15
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Note du Conducteur</title>
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
    
    <body >  
        
        <div class="header">
            <c:import url="_HEADER.jsp" />
        </div>
        
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>

        
        <div class="container">
         <!--<div class="contenu">-->

            <div>
                <div class="driver_note"><img src="img/taxi_profile.png" alt="driver_profile_image" /></div>
                <h2>${taxiDemande.login}</h2>
                <div class="etoile"><img src="img/note.JPG" alt="note-conducteur" /></div>
            </div>
                    
            <div>
                <form method="POST" action="noterTaxi">

                    note
                    <br />
                    <select name="note">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    <br />
                    <br />

                    Commenter ${taxiDemande.login} :
                    <br />
                    <br />
                    <textarea name="commentaire" cols="50" rows="10"></textarea>
                    <br />
                    <br />

                    <input type="submit" value="Valider">
                    <br />
                    <br />
                    
                </form>
            </div>
                
        </div>
                    
        <script src="jquery/jquery-2.2.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script> 

    </body>
</html>