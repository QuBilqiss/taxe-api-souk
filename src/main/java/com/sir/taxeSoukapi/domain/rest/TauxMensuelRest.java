/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest;

import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sir.taxeSoukapi.domain.model.service.TauxMensuelService;



/**
 *
 * @author user
 */
@RestController
@RequestMapping({"/taxe-api-souk/tauxtri"})
public class TauxMensuelRest {
   
    @Autowired
    TauxMensuelService tauxTrimestrielService;

 
    @GetMapping("reference/{reference}")
    public List<TauxMensuel> findByCategorieReference(@PathVariable String refCategorie) {
        return tauxTrimestrielService.findByCategorieReference(refCategorie);
    }

    @PostMapping("/")
    public TauxMensuel save(@RequestBody TauxMensuel tauxTrimestriel) {
        return tauxTrimestrielService.save(tauxTrimestriel);
    }

   
    public TauxMensuelService getTauxTrimestrielService() {
        return tauxTrimestrielService;
    }

    public void setTauxTrimestrielService(TauxMensuelService tauxTrimestrielService) {
        this.tauxTrimestrielService = tauxTrimestrielService;
    }
   
 
}
