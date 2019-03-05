/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.vo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public class TaxeAnnuelleVo implements Serializable {
    private Long id;
    private String refLocal;
    private String refRedevable;
    private String datePaiment;
    private List<TaxeTrimestrielleVo> taxeTrimestrielleVos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefLocal() {
        return refLocal;
    }

    public void setRefLocal(String refLocal) {
        this.refLocal = refLocal;
    }

    public String getRefRedevable() {
        return refRedevable;
    }

    public void setRefRedevable(String refRedevable) {
        this.refRedevable = refRedevable;
    }

    public String getDatePaiment() {
        return datePaiment;
    }

    public void setDatePaiment(String datePaiment) {
        this.datePaiment = datePaiment;
    }

    public List<TaxeTrimestrielleVo> getTaxeTrimestrielleVos() {
        return taxeTrimestrielleVos;
    }

    public void setTaxeTrimestrielleVos(List<TaxeTrimestrielleVo> taxeTrimestrielleVos) {
        this.taxeTrimestrielleVos = taxeTrimestrielleVos;
    }

 
    
}
