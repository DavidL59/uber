/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.service;

import uber.dao.NoteDAO;
import uber.entity.Note;

/**
 *
 * @author admin
 */
public class NoteService {
    
    public void ajoutNote(Note note) {

        NoteDAO dao = new NoteDAO();

        dao.ajouterPersiste(note);
    }
    
    public void deleteNote(Long idUser) {
        
        new NoteDAO().deleteNoteById(idUser);
    }
}
