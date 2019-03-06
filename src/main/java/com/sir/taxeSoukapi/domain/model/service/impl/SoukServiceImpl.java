/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.Souk;
import com.sir.taxeSoukapi.domain.model.dao.SoukDao;
import com.sir.taxeSoukapi.domain.model.service.SoukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class SoukServiceImpl implements SoukService{
    @Autowired
    SoukDao soukDao;

    @Override
    public Souk save(Souk souk) {
         if(findByReference(souk.getReference())!= null){
             return null;
         }else{
             soukDao.save(souk);
             return souk;
         }
    }

    @Override
    public Souk findByReference(String refCategorie) {
        return soukDao.findByReference(refCategorie);
    }

    public SoukDao getSoukDao() {
        return soukDao;
    }

    public void setSoukDao(SoukDao soukDao) {
        this.soukDao = soukDao;
    }
    
    
}
