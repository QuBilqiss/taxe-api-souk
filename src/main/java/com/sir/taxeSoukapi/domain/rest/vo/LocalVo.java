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
public class LocalVo implements Serializable {
    private Long id;
    private String reference;
    private String surface;
    private String refRedevable;
    private String refproprietaire;
    private SoukVo soukVo;
    private String dernierMontantPaye ;
    private String dernierTrimestrePaye ;
    private String dernierAnneePaye ;
    private CategorieVo categorieVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public String getRefproprietaire() {
        return refproprietaire;
    }

    public void setRefproprietaire(String refproprietaire) {
        this.refproprietaire = refproprietaire;
    }

    public SoukVo getSoukVo() {
        return soukVo;
    }

    public void setSoukVo(SoukVo soukVo) {
        this.soukVo = soukVo;
    }

    public String getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(String dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public String getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(String dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public String getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(String dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
    }

    public CategorieVo getCategorieVo() {
        return categorieVo;
    }

    public void setCategorieVo(CategorieVo categorieVo) {
        this.categorieVo = categorieVo;
    }

}
