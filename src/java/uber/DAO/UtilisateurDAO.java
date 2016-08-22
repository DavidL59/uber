package uber.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import uber.entity.Utilisateur;

/**
 *
 * @author coolsnip
 */
public class UtilisateurDAO {
    
        public List<Utilisateur> rechercherParLogin(String login) throws RuntimeException {

        EntityManager em = Persistence.createEntityManagerFactory("uberPU").createEntityManager();

        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login").setParameter("login", login).getResultList();
    }
    
        public Utilisateur rechercheTaxiParId(Long taxiId) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        return (Utilisateur) em.createQuery("SELECT u FROM Utilisateur u WHERE u.id=:id").setParameter("id", taxiId).getSingleResult();
    }

 public Utilisateur rechercheProfilParLogin(String oldInfo) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        return (Utilisateur) em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login").setParameter("login", oldInfo).getSingleResult();
    }

    public void ajouterUtilisateur(Utilisateur util) throws RuntimeException {

        EntityManager em = Persistence.createEntityManagerFactory("uberPU").createEntityManager();

        em.getTransaction().begin();

        em.persist(util);

        em.getTransaction().commit();
    }
    
        public List<Utilisateur> verifEtatUtil(String login, String password) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login AND u.password=:pass");
        query.setParameter("login", login);
        query.setParameter("pass", password);
        
        return (List<Utilisateur>) query.getResultList();
    }
        
            public void updateUtilisateur(Utilisateur util) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.merge(util);
        
        em.getTransaction().commit();
        
    }
    
    public List<Utilisateur> listAllUtilisateurDriver() {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        Query query = em.createNativeQuery("SELECT * FROM Utilisateur u WHERE u.typeUtil='DRIVER'", Utilisateur.class);
        @SuppressWarnings("unchecked")
        List<Utilisateur> drivers = (List<Utilisateur>) query.getResultList();
        
        return drivers;
    }
    
    public void deleteProfilById(Long idUser) {
        
        EntityManager em = Persistence.createEntityManagerFactory("UberPU").createEntityManager();
        
        em.getTransaction().begin();
        
        Query query = em.createQuery("DELETE FROM Utilisateur u WHERE u.id=:id");
        query.setParameter("id", idUser);
        query.executeUpdate();
        
        em.getTransaction().commit();
    }

}
