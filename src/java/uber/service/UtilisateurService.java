/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.service;

import java.util.List;
import uber.DAO.UtilisateurDAO;
import uber.entity.Utilisateur;

/**
 *
 * @author coolsnip
 */
public class UtilisateurService {
    
    public Utilisateur verifierLoginMdp(String log, String mdp) throws RuntimeException {
        
        return new UtilisateurDAO().verifierLoginMdp(log, mdp);
    }
    
    public void ajouterUtilisateur (Utilisateur u) throws RuntimeException {
        
        UtilisateurDAO  dao = new UtilisateurDAO();
        
        List<Utilisateur> listLogExist = dao.rechercherLogin(u.getLogin());
        
        if (listLogExist.size()>0){
            throw new RuntimeException ("Ce login existe déjà");
        }
        
        dao.ajouterUtilisateur(u);
    }

 
}
