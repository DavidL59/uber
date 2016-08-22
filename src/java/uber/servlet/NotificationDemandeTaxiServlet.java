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
 * @author admin
 */
@WebServlet(name = "NotificationDemandeTaxiServlet", urlPatterns = {"/trajet"})
public class NotificationDemandeTaxiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        UtilisateurService service = new UtilisateurService();
        
        // va chercher l'id du taxi qui a été passé en paramètre url
        Long id_taxi = Long.parseLong( req.getParameter("idTaxi") );

        // recherche le taxi choisis par le passager grâce à idTaxi
        Utilisateur taxiUtil = service.rechercheUtilParId(id_taxi);
        
        // met le taxi choisis en session
        req.getSession().setAttribute("taxiDemande", taxiUtil);
        
        req.getRequestDispatcher("trajet.jsp").forward(req, resp);
    }
}
