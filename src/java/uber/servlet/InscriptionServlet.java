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
import uber.entity.Utilisateur.TypeUtil;
import uber.service.UtilisateurService;

/**
 *
 * @author coolsnip
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UtilisateurService service = new UtilisateurService();
        Utilisateur util = new Utilisateur();

        util.setLogin(req.getParameter("login"));
        util.setNom(req.getParameter("nom"));
        util.setPrenom(req.getParameter("prenom"));
        util.setDateDeNaissance(req.getParameter("dateNaissance"));
        util.setEmail(req.getParameter("email"));
        util.setAdresse(req.getParameter("adresse"));
        util.setPhone(Integer.parseInt(req.getParameter("tel")));

        String password = req.getParameter("pwd");
        String passwordtwo = req.getParameter("pwd_deux");

        if (!password.equals(passwordtwo)) {

            throw new RuntimeException("Les mots de passe ne sont pas identique");
        } else if (password.equals(passwordtwo)) {

            util.setPassword(password);

        }

        String statut = req.getParameter("statut");

        util.setTypeUtil(TypeUtil.valueOf(statut));

        service.inscription(util);

        req.getSession().setAttribute("utilConnecte", util);

        resp.sendRedirect("map");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }

}
