$(document).ready(function () {
    $("#login").click(function () {
        var login = $("#login").val();
        var motDePasse = $("#motDePasse").val();
// verifie si tous les champs sont complets
        if (login == '' || motDePasse == '') {
            $('input[type="text"],input[type="password"]').css("border", "2px solid red");
            $('input[type="text"],input[type="password"]').css("box-shadow", "0 0 3px red");
            alert(" Veuillez indiquer tous les champs ");
        } else {
            $.post("connexionServlet.java", {login1: login, password1: motDePasse},
                    function (data) {
                        if (data == ' Email Invalide.......') {
                            $('input[type="text"]').css({"border": "2px solid red", "box-shadow": "0 0 3px red"});
                            $('input[type="password"]').css({"border": "2px solid #00F5FF", "box-shadow": "0 0 5px #00F5FF"});
                            alert(data);
                        } else if (data == 'Email ou Mot de passe éronés') {
                            $('input[type="text"],input[type="password"]').css({"border": "2px solid red", "box-shadow": "0 0 3px red"});
                            alert(data);
                        } else if (data == 'connecté') {
                            $("form")[0].reset();
                            $('input[type="text"],input[type="password"]').css({"border": "2px solid #00F5FF", "box-shadow": "0 0 5px #00F5FF"});
                            alert(data);
                        } else {
                            alert(data);
                        }
                    });
        }
    });
});