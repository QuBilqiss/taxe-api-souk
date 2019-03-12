/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class TaxeAnnuelle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Local local;
    private Categorie categorie;
    private String refRedevable;
    private Double datePaiment;
    @OneToMany(mappedBy = "taxeAnnuelle")
    private List<TaxeMensuelle> taxeTrimestrielles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public Double getDatePaiment() {
        return datePaiment;
    }

    public void setDatePaiment(Double datePaiment) {
        this.datePaiment = datePaiment;
    }

    public List<TaxeMensuelle> getTaxeTrimestrielles() {
        return taxeTrimestrielles;
    }

    public void setTaxeTrimestrielles(List<TaxeMensuelle> taxeTrimestrielles) {
        this.taxeTrimestrielles = taxeTrimestrielles;
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
        if (!(object instanceof TaxeAnnuelle)) {
            return false;
        }
        TaxeAnnuelle other = (TaxeAnnuelle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeSoukapi.bean.TaxeAnnuelle[ id=" + id + " ]";
    }
    
}
