/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TauxTrimestriel;
import com.sir.taxeSoukapi.domain.model.dao.TauxTrimestrielDao;
import com.sir.taxeSoukapi.domain.model.service.TauxTrimestrielService;
import java.util.Date;
import java.util.List;
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
    public List<TauxTrimestriel>  findByCategorieReference(String refCategorie) {
        return tauxTrimestrielDao.findByCategorieReference(refCategorie);
    }

    @Override
    public TauxTrimestriel findByCategorieReferenceByDate(String refCategorie, Date date) {
               //        String query ="select t from TauxTrimestriel t where t.categorie.reference='"+refCategorie+"'and t.dateDebut.compareTo('"+date+"')<=0 and t.dateFint.compareTo('"+date+"')>=0";
//        return getSingleResult(query);
        List<TauxTrimestriel> tauxTrimestriels=findByCategorieReference(refCategorie);
        if(tauxTrimestriels==null || tauxTrimestriels.isEmpty()){
            return null;
        }else{
            for (TauxTrimestriel tauxTrimestriel : tauxTrimestriels) {
                if(tauxTrimestriel.getDateDebut().compareTo(date)<=0 && tauxTrimestriel.getDateFin().compareTo(date)>=0){
                    return tauxTrimestriel;
                }
            }
            return null;
        }    
    }

    @Override
    public TauxTrimestriel findByCategorieReferenceByDateDebutByDateFin(String refCategorie, Date dateDebut, Date dateFin) {
        return tauxTrimestrielDao.findByCategorieReferenceByDateDebutByDateFin(refCategorie, dateDebut, dateFin);
    }

    @Override
    public TauxTrimestriel save(TauxTrimestriel tauxTrimestriel) {
        if(findByCategorieReferenceByDateDebutByDateFin(tauxTrimestriel.getCategorie().getReference(),tauxTrimestriel.getDateDebut(),tauxTrimestriel.getDateFin())!=null){
            return null;
        }else{
            tauxTrimestrielDao.save(tauxTrimestriel);
            return tauxTrimestriel;
        }
    }
  
   
    public TauxTrimestrielDao getTauxTrimestrielDao() {
        return tauxTrimestrielDao;
    }

    public void setTauxTrimestrielDao(TauxTrimestrielDao tauxTrimestrielDao) {
        this.tauxTrimestrielDao = tauxTrimestrielDao;
    }

}
