/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import com.sir.taxeSoukapi.domain.model.service.TauxAnnuelService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping({"/taxe-api-souk/tauxann"})
public class TauxAnnuelRest {
   
    @Autowired
    TauxAnnuelService tauxAnnuelService;

    @GetMapping("reference/{reference}")
    public List<TauxAnnuel> findByCategorieReference(String refCategorie) {
        return tauxAnnuelService.findByCategorieReference(refCategorie);
    }


    @PostMapping("/")
    public TauxAnnuel save(@RequestBody TauxAnnuel tauxAnnuel) {
        return tauxAnnuelService.save(tauxAnnuel);
    }


    public TauxAnnuelService getTauxAnnuelService() {
        return tauxAnnuelService;
    }

    public void setTauxAnnuelService(TauxAnnuelService tauxAnnuelService) {
        this.tauxAnnuelService = tauxAnnuelService;
    }
   

    
}
