/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uber.entity.Commentaire;
import uber.entity.HistoriqueCourse;
import uber.entity.Note;
import uber.entity.Utilisateur;
import uber.service.CommentaireService;
import uber.service.HistoriqueCourseService;
import uber.service.NoteService;
import uber.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "NotationConducteurServlet", urlPatterns = {"/noterTaxi"})
public class NotationConducteurServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("map.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // import et déclaration des entités
        Note note = new Note();
        Commentaire commentaire = new Commentaire();
        HistoriqueCourse histo = new HistoriqueCourse();
        
        // import import et déclaration des services
        NoteService noteService = new NoteService();
        CommentaireService commentaireService = new CommentaireService();
        HistoriqueCourseService historiqueService = new HistoriqueCourseService();
       
        // va chercher la note et le commentaire laissé par le passagé après la course
        byte noteTaxi = Byte.parseByte( req.getParameter("note") );
        String commentaireP = req.getParameter("commentaire");
        
        // va chercher les deux utilisateurs, passagé et conducteur concerné
        Utilisateur passager = (Utilisateur) req.getSession().getAttribute("utilConnecte");
        Utilisateur conducteur = (Utilisateur) req.getSession().getAttribute("taxiDemande");
        
        Date date = new Date();
        
        // création d'un Historique de la course
        histo.setDateCourse(date);
        histo.setCommentairePassenger(commentaireP);
        histo.setLoginCommenteurDriver(conducteur.getLogin());
        histo.setLoginCommenteurPassager(passager.getLogin());
        histo.setNotePassager(noteTaxi);
        histo.setIdDriver(conducteur.getId());
        histo.setIdPassager(passager.getId());
        
        historiqueService.ajoutHistoriqueCourse(histo);
        
        // création du commentaire
        commentaire.setCommentaire(commentaireP);
        commentaire.setCommenteur_id(passager.getId());
        commentaire.setUtilisateur(conducteur);
        commentaire.setDateCommentaire(date);
        conducteur.getCommentaires().add(commentaire);
        
        commentaireService.ajoutCommentaire(commentaire);

        // ajout de la note du passager pour le driver
        note.setNote(noteTaxi);
        note.setNoteur_id(passager.getId());
        note.setUtilisateur(conducteur);
        conducteur.getNotes().add(note);

        noteService.ajoutNote(note);
        
        // destruction de la session crée précedemment pour le conducteur
        req.getSession().removeAttribute("taxiDemande");
        
        resp.sendRedirect("map");
    }
}
