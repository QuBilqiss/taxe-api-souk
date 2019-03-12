/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Local implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Double surface;
    private String refRedevable;
    private String refProprietaire;
    @ManyToOne
    private Souk souk;
    private Double dernierMontantPaye ;
    private Double dernierTrimestrePaye ;
    private Double dernierAnneePaye ;
    @ManyToOne
    private Categorie categorie;

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

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public String getRefProprietaire() {
        return refProprietaire;
    }

    public void setRefProprietaire(String refProprietaire) {
        this.refProprietaire = refProprietaire;
    }

    public Souk getSouk() {
        return souk;
    }

    public void setSouk(Souk souk) {
        this.souk = souk;
    }

    public Double getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(Double dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public Double getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(Double dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public Double getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(Double dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
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
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeSoukapi.bean.Local[ id=" + id + " ]";
    }
    
}
