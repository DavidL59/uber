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
import uber.entity.Utilisateur;
import uber.service.UtilisateurService;

/**
 *
 * @author eraykorz
 */
@WebServlet(name = "MapRoadServlet", urlPatterns = {"/map"})
public class MapRoadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        UtilisateurService service = new UtilisateurService();

        // va chercher la liste de tous les utilisateurs de type driver
        List<Utilisateur> listDriver = service.listerDriver();
        
        // les mets à disposition pour la page map.jsp
        req.setAttribute("drivers", listDriver);
        
        req.getRequestDispatcher("map.jsp").forward(req, resp);
    }
}
