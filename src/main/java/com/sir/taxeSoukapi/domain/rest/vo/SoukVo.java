/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.vo;

/**
 *
 * @author user
 */
public class SoukVo {
     private Long id;
    private String reference;
    private String refRue;

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

    public String getRefRue() {
        return refRue;
    }

    public void setRefRue(String refRue) {
        this.refRue = refRue;
    }
    
}
