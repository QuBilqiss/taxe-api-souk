/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TaxeAnnuelle;
import com.sir.taxeSoukapi.domain.model.dao.TaxeAnnuelleDao;
import com.sir.taxeSoukapi.domain.model.service.TaxeAnnuelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TaxeAnnuelleServiceImpl implements TaxeAnnuelleService{
    @Autowired
    TaxeAnnuelleDao taxeAnnuelleDao;  

    @Override
    public TaxeAnnuelle findByRefLocal(String refLocal) {
        return taxeAnnuelleDao.findByRefLocal(refLocal);
    }

    @Override
    public TaxeAnnuelle save(TaxeAnnuelle taxeAnnuelle) {
       
    }

    public TaxeAnnuelleDao getTaxeAnnuelleDao() {
        return taxeAnnuelleDao;
    }

    public void setTaxeAnnuelleDao(TaxeAnnuelleDao taxeAnnuelleDao) {
        this.taxeAnnuelleDao = taxeAnnuelleDao;
    }

  
}
