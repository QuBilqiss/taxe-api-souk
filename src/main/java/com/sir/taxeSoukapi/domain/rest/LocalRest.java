/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest;

import com.sir.taxeSoukapi.domain.bean.Local;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import com.sir.taxeSoukapi.domain.model.service.LocalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping({"/taxe-api-souk/local"})
public class LocalRest {
   
    @Autowired
    LocalService localService;

    @GetMapping("cin/{cin}")
    public List<Local> findByRefRedevable(@PathVariable String cin) {
        return localService.findByRefRedevable(cin);
    }

    @GetMapping("reference/{reference}")
    public Local findByReference(@PathVariable String reference) {
        return localService.findByReference(reference);
    }
    @GetMapping("all/{all}")
    public List<Local> findAll() {
        return localService.findAll();
    }

    @PostMapping("/")
    public Local creer(@RequestBody Local local) {
        return localService.creer(local);
    }

    
    public LocalService getLocalService() {
        return localService;
    }

    public void setLocalService(LocalService localService) {
        this.localService = localService;
    }

  
    
}
