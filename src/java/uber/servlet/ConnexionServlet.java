/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.servlet;

import java.io.IOException;
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
 * @author coolsnip
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/login"})
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UtilisateurService service = new UtilisateurService();

        String login = req.getParameter("login");
        String password = req.getParameter("pwd");

        List<Utilisateur> user = service.verifEtat(login, password);

        if (user.size() == 0) {
            resp.sendRedirect("index");
        } else {
            req.getSession().setAttribute("utilConnecte", user.get(0));

            resp.sendRedirect("map");
        }
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    
        
}


