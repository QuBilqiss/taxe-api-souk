/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class TaxeMensuelle implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Local local;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiment;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentation;
    private Double montantDeBase;
    private Double montantMajoration;
    private Double montantPenalité;
    private Double montantTaxe;
    private int nbMoisRetard;
    @ManyToOne
    private TaxeAnnuelle taxeAnnuelle;




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

    public Date getDatePaiment() {
        return datePaiment;
    }

    public void setDatePaiment(Date datePaiment) {
        this.datePaiment = datePaiment;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public Double getMontantDeBase() {
        return montantDeBase;
    }

    public void setMontantDeBase(Double montantDeBase) {
        this.montantDeBase = montantDeBase;
    }

    public Double getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(Double montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public Double getMontantPenalité() {
        return montantPenalité;
    }

    public void setMontantPenalité(Double montantPenalité) {
        this.montantPenalité = montantPenalité;
    }

    public Double getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(Double montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public int getNbMoisRetard() {
        return nbMoisRetard;
    }

    public void setNbMoisRetard(int nbMoisRetard) {
        this.nbMoisRetard = nbMoisRetard;
    }

    public TaxeAnnuelle getTaxeAnnuelle() {
        return taxeAnnuelle;
    }

    public void setTaxeAnnuelle(TaxeAnnuelle taxeAnnuelle) {
        this.taxeAnnuelle = taxeAnnuelle;
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
        if (!(object instanceof TaxeMensuelle)) {
            return false;
        }
        TaxeMensuelle other = (TaxeMensuelle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeSoukapi.bean.TaxeTrimestriel[ id=" + id + " ]";
    }
    
}
