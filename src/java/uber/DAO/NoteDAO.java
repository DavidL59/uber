/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import uber.entity.Note;

/**
 *
 * @author admin
 */
public class NoteDAO {
    
    public void ajouterPersiste(Note note) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(note);
        
        em.getTransaction().commit();
    }
    
    public void deleteNoteById(Long idUser) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        Query query = em.createQuery("DELETE FROM Note n WHERE n.utilisateur.id=:id");
        query.setParameter("id", idUser);
        query.executeUpdate();
        
        em.getTransaction().commit();
    }
}
