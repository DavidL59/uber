package uber.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import uber.entity.Utilisateur;

/**
 *
 * @author coolsnip
 */
public class UtilisateurDAO {

    public Utilisateur verifierLoginMdp(String log, String mdp) throws RuntimeException {

        EntityManager em = Persistence.createEntityManagerFactory("uberPU").createEntityManager();

        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monlog AND u.motDePasse=:monmdp");
        query.setParameter("monlog", log);
        query.setParameter("monmdp", mdp);

        return (Utilisateur) query.getSingleResult();

    }

    public void ajouterUtilisateur(Utilisateur u) throws RuntimeException {

        EntityManager em = Persistence.createEntityManagerFactory("uberPU").createEntityManager();
        em.getTransaction().begin();

        em.persist(u);

        em.getTransaction().commit();
    }

}
