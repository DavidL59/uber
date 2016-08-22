/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
@Entity
public class HistoriqueCourse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCourse;
    
    private Long idPassager;
    
    private Long idDriver;
    
    private String commentairePassenger;
    
    private String commentaireDriver;
    
    private byte notePassager;
    
    private byte noteDriver;

    private String loginCommenteurPassager;
    
    private String loginCommenteurDriver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCourse() {
        return dateCourse;
    }

    public void setDateCourse(Date dateCourse) {
        this.dateCourse = dateCourse;
    }

    public String getCommentairePassenger() {
        return commentairePassenger;
    }

    public void setCommentairePassenger(String commentairePassenger) {
        this.commentairePassenger = commentairePassenger;
    }

    public String getCommentaireDriver() {
        return commentaireDriver;
    }

    public void setCommentaireDriver(String commentaireDriver) {
        this.commentaireDriver = commentaireDriver;
    }

    public byte getNotePassager() {
        return notePassager;
    }

    public void setNotePassager(byte notePassager) {
        this.notePassager = notePassager;
    }

    public byte getNoteDriver() {
        return noteDriver;
    }

    public void setNoteDriver(byte noteDriver) {
        this.noteDriver = noteDriver;
    }

    public String getLoginCommenteurPassager() {
        return loginCommenteurPassager;
    }

    public void setLoginCommenteurPassager(String loginCommenteurPassager) {
        this.loginCommenteurPassager = loginCommenteurPassager;
    }

    public String getLoginCommenteurDriver() {
        return loginCommenteurDriver;
    }

    public void setLoginCommenteurDriver(String loginCommenteurDriver) {
        this.loginCommenteurDriver = loginCommenteurDriver;
    }

    public Long getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(Long idPassager) {
        this.idPassager = idPassager;
    }

    public Long getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Long idDriver) {
        this.idDriver = idDriver;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriqueCourse)) {
            return false;
        }
        HistoriqueCourse other = (HistoriqueCourse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uber.entity.HistoriqueCourse[ id=" + id + " ]";
    }
    
}
