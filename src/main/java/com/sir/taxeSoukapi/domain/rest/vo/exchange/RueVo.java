/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.vo.exchange;

import java.io.Serializable;


/**
 *
 * @author user
 */

public class RueVo implements Serializable{
     private static final long serialVersionUID = 1L;
     
    private String reference;
    private QuartierVo quartierVo;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public QuartierVo getQuartierVo() {
        return quartierVo;
    }

    public void setQuartierVo(QuartierVo quartierVo) {
        this.quartierVo = quartierVo;
    }

}
