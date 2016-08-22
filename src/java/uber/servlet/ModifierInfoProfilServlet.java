/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uber.entity.Utilisateur;
import uber.service.UtilisateurService;

/**
 *
 * @author eraykorz
 */
@WebServlet(name = "ModifierInfoProfilServlet", urlPatterns = {"/modifier"})
public class ModifierInfoProfilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("profil.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        UtilisateurService service = new UtilisateurService();
        
        // va chercher les data de l'appel ajax
        String inputInfo = req.getParameter("inputInfo").trim();
        String nameInfo = req.getParameter("nameInfo").trim();
        Utilisateur util = (Utilisateur) req.getSession().getAttribute("utilConnecte");
        
        // modifie l'info en fonction de l'attribut envoyé par le fichier ajax contenu dans la var nameInfo
        switch(nameInfo) {
            case "login": util.setLogin(inputInfo);
                service.verifLoginDuplicata(inputInfo);
                break;
            case "nom": util.setNom(inputInfo);
                break;
            case "prenom": util.setPrenom(inputInfo);
                break;
            case "dateDeNaissance": util.setDateDeNaissance(inputInfo);
                break;
            case "adresse": util.setAdresse(inputInfo);
                break;
            case "email": util.setEmail(inputInfo);
                break;
            case "password": util.setPassword(inputInfo);
                break;
        }
        
        // merge la modification
        service.modifierInfoProfil(util);
        
        resp.sendRedirect("profil");
    }
}
