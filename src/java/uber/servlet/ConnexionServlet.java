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
 * @author coolsnip
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/login"})
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String log = req.getParameter("login");
            String mdp = req.getParameter("motDePasse");
            Utilisateur u = new UtilisateurService().verifierLoginMdp(log, mdp);

            req.getSession().setAttribute("UtilConnecte", u);

            resp.sendRedirect("liste_trajet");
        } catch (RuntimeException e) {

            resp.sendRedirect("inscription");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("connexion.jsp").forward(req, resp);
    }

}
