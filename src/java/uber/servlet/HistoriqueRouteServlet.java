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
import uber.entity.HistoriqueCourse;
import uber.entity.Utilisateur;
import uber.service.HistoriqueCourseService;

/**
 *
 * @author admin
 */
@WebServlet(name = "HistoriqueRouteServlet", urlPatterns = {"/historique"})
public class HistoriqueRouteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HistoriqueCourseService histo = new HistoriqueCourseService();
        
        Utilisateur idUtil = (Utilisateur) req.getSession().getAttribute("utilConnecte");
        
        Long idUtilCo = idUtil.getId();
        
        List<HistoriqueCourse> utilHistorique = histo.lisetHistoriqueParUserId(idUtilCo);
        
        req.setAttribute("historiques", utilHistorique);
        
        req.getRequestDispatcher("historiqueUtilisateur.jsp").forward(req, resp);
    }
}
