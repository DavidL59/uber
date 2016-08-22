/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.service;

import java.util.List;
import uber.dao.CommentaireDAO;
import uber.entity.Commentaire;

/**
 *
 * @author admin
 */
public class CommentaireService {
    
    public void ajoutCommentaire(Commentaire commentaire) {

        CommentaireDAO dao = new CommentaireDAO();

        dao.ajouterPersiste(commentaire);
    }
    
    public List<Commentaire> listCommentaireParUserId(Long userId) {
        
        return new CommentaireDAO().rechercheCommentaireParUserId(userId);
    }
    
    public void deleteCommentaire(Long idUser) {
        
        new CommentaireDAO().deleteCommentaireById(idUser);
    }
}
