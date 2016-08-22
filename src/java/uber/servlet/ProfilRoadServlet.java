/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uber.entity.Commentaire;
import uber.entity.HistoriqueCourse;
import uber.entity.Utilisateur;
import uber.service.CommentaireService;
import uber.service.HistoriqueCourseService;

/**
 *
 * @author eraykorz
 */
@WebServlet(name = "ProfilRoadServlet", urlPatterns = {"/profil"})
public class ProfilRoadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HistoriqueCourseService histoService = new HistoriqueCourseService();

        // va chercher l'utilisateur connecte pour pouvoir afficher ses commentaire sur la page de profil
        Utilisateur util_connecte = (Utilisateur) req.getSession().getAttribute("utilConnecte");
        
        List<HistoriqueCourse> histo = histoService.lisetHistoriqueParUserId(util_connecte.getId());
        
        req.setAttribute("historiques", histo);
        
        req.getRequestDispatcher("profil.jsp").forward(req, resp);
    }
}
