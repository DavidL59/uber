<%-- 
    Document   : historiqueUtilisateur
    Created on : 12 août 2016, 10:46:48
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historique de ${utilConnecte.login}</title>
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
                <h1>Historique de ${utilConnecte.login}</h1>
            </div>
            
            <div class="commentaire">
                <c:forEach items="${historiques}" var="historique">
                    <div class="comment_div">
                        <p class="inline_block">Passager : </p> <h2 class="inline_block">${historique.loginCommenteurPassager}</h2> <strong> | </strong>
                        <p class="inline_block">Conducteur : </p> <h2 class="inline_block">${historique.loginCommenteurDriver}</h2>
                        
                        <p><strong>Commentaire du passager ${historique.loginCommenteurPassager}</strong> : ${historique.commentairePassenger}</p>
                        <p><strong>Commentaire du conducteur ${historique.loginCommenteurDriver}</strong> : ${historique.commentaireDriver}</p>

                        <p><strong>Note donné par ${historique.loginCommenteurPassager}</strong> : ${historique.notePassager}</p>
                        <p><strong>Note donné par ${historique.loginCommenteurDriver}</strong> : ${historique.noteDriver}</p>

                        <p class="inline_block_droite">date de la course </p> <h4 class="inline_block_droite">${historique.dateCourse}</h4>
                    </div>
                </c:forEach>
            </div>
            
        </div>
                    
        <script src="jquery/jquery-2.2.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>