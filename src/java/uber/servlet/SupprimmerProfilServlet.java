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
import uber.service.CommentaireService;
import uber.service.NoteService;
import uber.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "SupprimmerProfilServlet", urlPatterns = {"/delete_profil"})
public class SupprimmerProfilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        UtilisateurService utilService = new UtilisateurService();
        CommentaireService comService = new CommentaireService();
        NoteService noteService = new NoteService();
        
        Long idUser = Long.parseLong(req.getParameter("idUtilisateur"));
        
        comService.deleteCommentaire(idUser);
        
        noteService.deleteNote(idUser);
        
        utilService.deleteProfil(idUser);
        
        req.getSession().removeAttribute("utilConnecte");
        
        resp.sendRedirect("index");
    }
}
