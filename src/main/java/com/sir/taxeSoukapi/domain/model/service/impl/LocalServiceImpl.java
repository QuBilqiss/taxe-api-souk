/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.Local;
import com.sir.taxeSoukapi.domain.model.dao.LocalDao;
import com.sir.taxeSoukapi.domain.model.service.LocalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class LocalServiceImpl implements LocalService{
  
    @Autowired
    private LocalDao localDao;
  
    @Override
    public List<Local> findByRefRedevable(String reference) {
        return localDao.findByRefRedevable(reference);
    }

    @Override
    public Local findByReference(String reference) {
        return localDao.findByReference(reference);
    }

//    @Override
//    public Object[] creer(Local local) {
//        Redevable r= local.getRedevable();
//         Redevable p= local.getProprietaire();
//        Rue rue=local.getRue();
////        Categorie c= local.getCategorie();
//        if(redevableService.existsById(r.getId())==false){
//            return  new Object[]{-1,null};
//        }else if(redevableService.existsById(p.getId())==false){
//            return  new Object[]{-2,null};
//        }
//        else if(rueService.existsById(rue.getId())==false){
//            return  new Object[]{-3,null};
//        }
////        else if(categorieService.existsById(c.getId())==false){
////            return -4;
////        }
//        else {
//            local.setDernierAnneePaye(BigDecimal.ZERO);
//            local.setDernierTrimestrePaye(BigDecimal.ZERO);
//              localDao.save(local);
//        return  new Object[]{1,local};
//        }
//      
//    }
    @Override
    public Local creer(Local local) {
        Local l = findByReference(local.getReference());
        if (l != null) {
            return null;
        } else {
            local.setDernierAnneePaye(0D);
            local.setDernierTrimestrePaye(0D);
            localDao.save(local);
            return local;
        }
    }

    @Override
    public List<Local> findAll() {
        return localDao.findAll();
    }

    public LocalDao getLocalDao() {
        return localDao;
    }

    public void setLocalDao(LocalDao localDao) {
        this.localDao = localDao;
    }

}
