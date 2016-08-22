/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import uber.entity.Commentaire;

/**
 *
 * @author admin
 */
public class CommentaireDAO {
    
    public void ajouterPersiste(Commentaire commentaire) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(commentaire);
        
        em.getTransaction().commit();
    }
    
    public List<Commentaire> rechercheCommentaireParUserId(Long userId) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        return em.createQuery("SELECT c FROM Commentaire c WHERE c.utilisateur.id=:idUser").setParameter("idUser", userId).getResultList();
    }

    public void deleteCommentaireById(Long idUser) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        Query query = em.createQuery("DELETE FROM Commentaire c WHERE c.utilisateur.id=:id");
        query.setParameter("id", idUser);
        query.executeUpdate();
        
        em.getTransaction().commit();
    }
}
