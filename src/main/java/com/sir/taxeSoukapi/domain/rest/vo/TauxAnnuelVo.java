/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.vo;

import com.sir.taxeSoukapi.domain.bean.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
public class TauxAnnuelVo implements Serializable {
    private Long id;
    private String refCategorie;
    private String dateDebut;
    private String dateFin;
    private String pourcentage;
    private String penalite;
    private String majoration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(String pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getPenalite() {
        return penalite;
    }

    public void setPenalite(String penalite) {
        this.penalite = penalite;
    }

    public String getMajoration() {
        return majoration;
    }

    public void setMajoration(String majoration) {
        this.majoration = majoration;
    }


   
    
}
