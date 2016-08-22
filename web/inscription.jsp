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
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
        
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
     <!--<div class="contenu">-->


            <h1>Inscription à Uber-fake !</h1>

    <form class="form-horizontal" role="form" method="post" action="inscription" >
                    <div class="form-group">
                        <label for="name" class="col-sm-2 control-label">login</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="name" name="login" placeholder="Ex : login">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="col-sm-2 control-label">Nom</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email" name="nom" placeholder="Ex : Dupond">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="col-sm-2 control-label">Prénom</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email" name="prenom" placeholder="Ex : David" >
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="dateNaissance" class="col-sm-2 control-label">Date de naissance</label>
                        <div class="col-sm-10">
                            <div class="input-group">
                                 <div class="input-group-addon">
                                    <i class="fa fa-calendar"></i>
                            </div>                       
                            <input class="form-control" id="date" name="DateDeNaissance" placeholder="Ex : 01/05/2001"  type="text">
                            </div>
                        </div>
                    </div>

                     <div class="form-group">
                        <label for="email" class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="email" name="email" placeholder="Ex : example@domain.com" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="adresse" class="col-sm-2 control-label">Adresse</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="email" name="adresse" placeholder=" Ex : 1 rue de uber" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="tel" class="col-sm-2 control-label">Telephone</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="email" name="tel" placeholder="Ex : 0613408888" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="pdw" class="col-sm-2 control-label">Mot de passe</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="email" name="pwd" placeholder="" >
                        </div>
                    </div>  

                     <div class="form-group">
                        <label for="pdw2" class="col-sm-2 control-label">Retapez votre mot de passe</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="email" name="pwd_deux" placeholder="" >
                        </div>
                    </div>  
   
                    <div class="form-group">
                        <label for="profil" class="col-sm-2 control-label">Choisissez votre profil</label>
                        <div class="col-sm-10">
                            <select class="form-control" >
                                <option value="PASSENGER">Passager</option>
                                <option value="DRIVER">Conducteur</option>
                            </select>
                        </div>
                    </div>
      
                    <div class="form-group">
                        <div class="col-sm-10 col-sm-offset-2">
                            <input id="submit" name="submit" type="submit" value="Envoyer" class="btn btn-primary">
                        </div>
                    </div>
                    
                </form> 

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
    


<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Include Date Range Picker -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="js/datepicker-fr.js"></script>

<script src="js/bootstrap.min.js"></script> 

<script>

$(document).ready(function(){
     $.fn.datepicker.defaults.language = 'fr';
});
    $(document).ready(function(){
        var date_input=$('input[name="DateDeNaissance"]'); //appel du name dans le formulaire date de naissance
        var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";

           date_input.datepicker({

           
            container: container,
            todayHighlight: true,
            autoclose: true,
     
    
        })
    })
</script>
    </body>
</html>
