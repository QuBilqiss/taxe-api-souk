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
public class TaxeMensuelleVo implements Serializable {
    private Long id;
    private LocalVo localVo;
    private String datePaiment;
    private String datePresentation;
    private String montantDeBase;
    private String montantMajoration;
    private String montantPenalité;
    private String montantTaxe;
    private String nbMoisRetard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalVo getLocalVo() {
        return localVo;
    }

    public void setLocalVo(LocalVo localVo) {
        this.localVo = localVo;
    }

    public String getDatePaiment() {
        return datePaiment;
    }

    public void setDatePaiment(String datePaiment) {
        this.datePaiment = datePaiment;
    }

    public String getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(String datePresentation) {
        this.datePresentation = datePresentation;
    }

    public String getMontantDeBase() {
        return montantDeBase;
    }

    public void setMontantDeBase(String montantDeBase) {
        this.montantDeBase = montantDeBase;
    }

    public String getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(String montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public String getMontantPenalité() {
        return montantPenalité;
    }

    public void setMontantPenalité(String montantPenalité) {
        this.montantPenalité = montantPenalité;
    }

    public String getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(String montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public String getNbMoisRetard() {
        return nbMoisRetard;
    }

    public void setNbMoisRetard(String nbMoisRetard) {
        this.nbMoisRetard = nbMoisRetard;
    }


}
