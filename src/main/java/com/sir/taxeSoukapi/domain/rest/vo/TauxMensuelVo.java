/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.vo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class TauxMensuelVo implements Serializable {
    private Long id;
    private CategorieVo categorieVo;
    private String dateFin;
    private String dateDebut;
    private String pourcentage;
    private String penalite;
    private String majoration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategorieVo getCategorieVo() {
        return categorieVo;
    }

    public void setCategorieVo(CategorieVo categorieVo) {
        this.categorieVo = categorieVo;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
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
