/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TauxTrimestriel;
import com.sir.taxeSoukapi.domain.model.dao.TauxTrimestrielDao;
import com.sir.taxeSoukapi.domain.model.service.TauxTrimestrielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TauxTrimestrielServiceImpl implements TauxTrimestrielService{

    @Autowired 
    TauxTrimestrielDao tauxTrimestrielDao;
    
    @Override
    public int save(TauxTrimestriel tauxTrimestriel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TauxTrimestriel findByCategorieReference(String refCategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TauxTrimestrielDao getTauxTrimestrielDao() {
        return tauxTrimestrielDao;
    }

    public void setTauxTrimestrielDao(TauxTrimestrielDao tauxTrimestrielDao) {
        this.tauxTrimestrielDao = tauxTrimestrielDao;
    }
  
}
