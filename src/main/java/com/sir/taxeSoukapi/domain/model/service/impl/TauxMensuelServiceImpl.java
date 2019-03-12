/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sir.taxeSoukapi.domain.model.dao.TauxMensuelDao;
import com.sir.taxeSoukapi.domain.model.service.TauxMensuelService;

/**
 *
 * @author user
 */
@Service
public class TauxMensuelServiceImpl implements TauxMensuelService{

    @Autowired 
    TauxMensuelDao tauxTrimestrielDao;
    
    @Override
    public List<TauxMensuel>  findByCategorieReference(String refCategorie) {
        return tauxTrimestrielDao.findByCategorieReference(refCategorie);
    }

    @Override
    public TauxMensuel findByCategorieReferenceByDate(String refCategorie, Date date) {
               //        String query ="select t from TauxTrimestriel t where t.categorie.reference='"+refCategorie+"'and t.dateDebut.compareTo('"+date+"')<=0 and t.dateFint.compareTo('"+date+"')>=0";
//        return getSingleResult(query);
        List<TauxMensuel> tauxTrimestriels=findByCategorieReference(refCategorie);
        if(tauxTrimestriels==null || tauxTrimestriels.isEmpty()){
            return null;
        }else{
            for (TauxMensuel tauxTrimestriel : tauxTrimestriels) {
                if(tauxTrimestriel.getDateDebut().compareTo(date)<=0 && tauxTrimestriel.getDateFin().compareTo(date)>=0){
                    return tauxTrimestriel;
                }
            }
            return null;
        }    
    }

    @Override
    public TauxMensuel findByCategorieReferenceByDateDebutByDateFin(String refCategorie, Date dateDebut, Date dateFin) {
        return tauxTrimestrielDao.findByCategorieReferenceAndDateDebutAndDateFin(refCategorie, dateDebut, dateFin);
    }

    @Override
    public TauxMensuel save(TauxMensuel tauxTrimestriel) {
        if(findByCategorieReferenceByDateDebutByDateFin(tauxTrimestriel.getCategorie().getReference(),tauxTrimestriel.getDateDebut(),tauxTrimestriel.getDateFin())!=null){
            return null;
        }else{
            tauxTrimestrielDao.save(tauxTrimestriel);
            return tauxTrimestriel;
        }
    }
  
    @Override
    public TauxMensuel findByCategorieReferenceAndDate(String reference, Date date) {
        List<TauxMensuel>  tauxTrimestriels=findByCategorieReference(reference);
        if(tauxTrimestriels==null || tauxTrimestriels.isEmpty()){
            return null;
        }else{
             for (TauxMensuel tauxTrimestriel : tauxTrimestriels) {
                if(tauxTrimestriel.getDateDebut().compareTo(date)<=0 && tauxTrimestriel.getDateFin().compareTo(date)>=0){
                    return tauxTrimestriel;
                }
            }
             return null;
        }
    }

   
    public TauxMensuelDao getTauxTrimestrielDao() {
        return tauxTrimestrielDao;
    }

    public void setTauxTrimestrielDao(TauxMensuelDao tauxTrimestrielDao) {
        this.tauxTrimestrielDao = tauxTrimestrielDao;
    }

}
