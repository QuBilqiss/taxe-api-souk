/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest;

import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import com.sir.taxeSoukapi.domain.model.service.TaxeAnnuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sir.taxeSoukapi.domain.model.service.TaxeMensuelleService;



/**
 *
 * @author user
 */
@RestController
@RequestMapping({"/taxe-api-souk/taxeann"})
public class TaxeAnnuelleRest {
   
    @Autowired
    TaxeAnnuelleService taxeAnnuelleService;

   
    public TaxeAnnuelleService getTaxeAnnuelleService() {
        return taxeAnnuelleService;
    }

    public void setTaxeAnnuelleService(TaxeAnnuelleService taxeAnnuelleService) {
        this.taxeAnnuelleService = taxeAnnuelleService;
    }
}
