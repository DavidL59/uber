<%-- 
    Document   : profil
    Created on : Jul 20, 2016, 9:43:29 AM
    Author     : eraykorz
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>page profil</title>
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
            <div class="type_profil">
                <c:choose>
                    <c:when test="${utilConnecte.typeUtil == 'PASSENGER'}">
                        <h1>Profil Passager</h1>
                    </c:when>
                    <c:otherwise>
                        <h1>Profil Conducteur</h1>
                    </c:otherwise>
                </c:choose>
            </div>

            <div><h3>Information Generale</h3></div>
            
            <div class="info_perso">
                <div class="info_profile">
                    <ul>
                        <li id="login"><p><strong>login</strong> : ${utilConnecte.login} <button type="button" onclick="modifier('login');">modifier</button></p></li>
                        <li id="nom"><p><strong>nom</strong> : ${utilConnecte.nom} <button type="button" onclick="modifier('nom');">modifier</button></p></li>
                        <li id="prenom"><p><strong>prenom</strong> : ${utilConnecte.prenom} <button type="button" onclick="modifier('prenom');">modifier</button></p></li>
                        <li id="dateDeNaissance"><p><strong>date de naissance</strong> : ${utilConnecte.dateDeNaissance} <button type="button" onclick="modifier('dateDeNaissance');">modifier</button></p></li>
                        <li id="adresse"><p><strong>adresse</strong> : ${utilConnecte.adresse} <button type="button" onclick="modifier('adresse');">modifier</button></p></li>
                        <li id="email"><p><strong>email</strong> : ${utilConnecte.email} <button type="button" onclick="modifier('email');">modifier</button></p></li>
                        <li id="phone"><p><strong>Telephone</strong> : ${utilConnecte.phone} <button type="button" onclick="modifier('phone');">modifier</button></p></li>
                        <li><button onclick="deleteProfil(${utilConnecte.id});">Supprimmer mon profil</button></li>
                    </ul>
                </div>
                
                <div class="note">
                    <h3>Note de ${utilConnecte.login}</h3>
                </div>
                <div class="note_vue">
                    <div class="note_image"><img src="img/noimage.jpg" /></div>
                    <div class="etoile"><img src="img/note.JPG" /></div>
                </div>
            </div>
               
            <div class="div_com">
                <h3>Commentaire</h3>
            </div>
                
            <div class="commentaire">
                <c:forEach items="${historiques}" var="comment">
                    <div class="comment_div">
                        <p class="inline_block">commentaire de</p> <h2 class="inline_block">${comment.loginCommenteurPassager}</h2>
                        <p>${comment.commentairePassenger}</p>
                        <p class="inline_block_droite">commenté le </p> <h4 class="inline_block_droite">${comment.dateCourse}</h4>
                    </div>
                </c:forEach>
            </div>
        </div>

  
        <script src="jquery/jquery-2.2.4.min.js"></script>
        <script src="js/modifier_profil.js"></script>
        <script src="js/suppression_profil.js"></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>