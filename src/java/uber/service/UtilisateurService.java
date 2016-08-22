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

    public void verifLoginDuplicata(String login) {

    UtilisateurDAO dao = new UtilisateurDAO();
    
    List<Utilisateur> listeUtilAvecCeLogin = dao.rechercherParLogin(login);
                
        if ( listeUtilAvecCeLogin.size() > 0 ) {
            
            throw new RuntimeException("ce login existe deja");
        }
    }
    

     public void inscription(Utilisateur util) {

    UtilisateurDAO dao = new UtilisateurDAO();

    List<Utilisateur> listeUtilAvecCeLogin = dao.rechercherParLogin(util.getLogin());
                
        if ( listeUtilAvecCeLogin.size() > 0 ) {
            
            throw new RuntimeException("ce login existe deja");
        }
        
        dao.ajouterUtilisateur(util);
    }
     
     public void modifierInfoProfil(Utilisateur util) {

        new UtilisateurDAO().updateUtilisateur(util);
    }
    
    public List<Utilisateur> listerDriver() {
        
        return (List<Utilisateur>) new UtilisateurDAO().listAllUtilisateurDriver();
    }
     
     
     
         public List<Utilisateur> verifEtat(String login, String password) {
        UtilisateurDAO dao = new UtilisateurDAO();
        
        return dao.verifEtatUtil(login, password);
    }
         
         
          public Utilisateur rechercheUtil(String nameInfo) {
        
        return (Utilisateur) new UtilisateurDAO().rechercheProfilParLogin(nameInfo);
    }
    
    public Utilisateur rechercheUtilParId(Long taxiId) {
        
        return (Utilisateur) new UtilisateurDAO().rechercheTaxiParId(taxiId);
    }
    
    public void deleteProfil(Long idUser) {
        
        new UtilisateurDAO().deleteProfilById(idUser);
    }
}
