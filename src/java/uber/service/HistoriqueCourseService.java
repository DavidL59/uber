/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.service;

import java.util.List;
import uber.dao.HistoriqueCourseDAO;
import uber.entity.HistoriqueCourse;

/**
 *
 * @author admin
 */
public class HistoriqueCourseService {
    
    public List<HistoriqueCourse> lisetHistoriqueParUserId(Long userId) {
        
        return new HistoriqueCourseDAO().rechercheHistoriqueParUserId(userId);
    }
    
    public void ajoutHistoriqueCourse(HistoriqueCourse historiqueCourse) {

        HistoriqueCourseDAO dao = new HistoriqueCourseDAO();

        dao.ajouterPersisteHistorique(historiqueCourse);
    }
}
