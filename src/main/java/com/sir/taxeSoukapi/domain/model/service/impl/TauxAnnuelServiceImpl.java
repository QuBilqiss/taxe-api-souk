/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;
import com.sir.taxeSoukapi.domain.model.dao.TauxAnnuelDao;
import com.sir.taxeSoukapi.domain.model.service.TauxAnnuelService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TauxAnnuelServiceImpl implements TauxAnnuelService{
    @Autowired
    TauxAnnuelDao tauxAnnuelDao;

    @Override
    public List<TauxAnnuel> findByCategorieReference(String refCategorie) {
        return tauxAnnuelDao.findByCategorieReference(refCategorie);
    }
    @Override
    public TauxAnnuel findByCategorieReferenceByDate(String refCategorie, Date date){
        //        String query ="select t from TauxAnnuel t where t.categorie.reference='"+refCategorie+"'and t.dateDebut.compareTo('"+date+"')<=0 and t.dateFint.compareTo('"+date+"')>=0";
//        return getSingleResult(query);
        List<TauxAnnuel> tauxAnnuels=findByCategorieReference(refCategorie);
        if(tauxAnnuels==null || tauxAnnuels.isEmpty()){
            return null;
        }else{
            for (TauxAnnuel tauxAnnuel : tauxAnnuels) {
                if(tauxAnnuel.getDateDebut().compareTo(date)<=0 && tauxAnnuel.getDateFin().compareTo(date)>=0){
                    return tauxAnnuel;
                }
            }
            return null;
        }    
    } 
    
    @Override
    public TauxAnnuel findByCategorieReferenceByDateDebutByDateFin(String refCategorie, Date dateDebut, Date dateFin) {
        return tauxAnnuelDao.findByCategorieReferenceAndDateDebutAndDateFin(refCategorie, dateDebut, dateFin);
    }
    
    @Override
    public TauxAnnuel save(TauxAnnuel tauxAnnuel) {
        if(findByCategorieReferenceByDateDebutByDateFin(tauxAnnuel.getCategorie().getReference(),tauxAnnuel.getDateDebut(),tauxAnnuel.getDateFin())!=null){
            return null;
        }else{
            tauxAnnuelDao.save(tauxAnnuel);
            return tauxAnnuel;
        }
    }

    public TauxAnnuelDao getTauxAnnuelDao() {
        return tauxAnnuelDao;
    }

    public void setTauxAnnuelDao(TauxAnnuelDao tauxAnnuelDao) {
        this.tauxAnnuelDao = tauxAnnuelDao;
    }

    
}
