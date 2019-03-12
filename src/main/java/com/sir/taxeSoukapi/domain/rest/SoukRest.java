/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest;

import com.sir.taxeSoukapi.domain.bean.Souk;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import com.sir.taxeSoukapi.domain.model.service.SoukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author user
 */
@RestController
@RequestMapping({"/taxe-api-souk/souk"})
public class SoukRest {
   
    @Autowired
    SoukService soukService;

    @PostMapping("/")
    public Souk save(@RequestBody Souk souk) {
        return soukService.save(souk);
    }
    @GetMapping("reference/{reference}")
    public Souk findByReference(@PathVariable String refCategorie) {
        return soukService.findByReference(refCategorie);
    }
    

    public SoukService getSoukService() {
        return soukService;
    }

    public void setSoukService(SoukService soukService) {
        this.soukService = soukService;
    }

    
}
