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
import uber.entity.HistoriqueCourse;
import uber.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class HistoriqueCourseDAO {
    
    public List<HistoriqueCourse> rechercheHistoriqueParUserId(Long userId) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        return em.createQuery("SELECT h FROM HistoriqueCourse h WHERE h.idDriver=:idUser").setParameter("idUser", userId).getResultList();
    }
    
    public void ajouterPersisteHistorique(HistoriqueCourse historiqueCourse) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(historiqueCourse);
        
        em.getTransaction().commit();
    }
}
