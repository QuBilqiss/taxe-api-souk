/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service.impl;

import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import java.util.Date;
import com.sir.taxeSoukapi.common.util.DateUtil;
import com.sir.taxeSoukapi.domain.bean.Categorie;
import com.sir.taxeSoukapi.domain.bean.Local;
import com.sir.taxeSoukapi.domain.model.service.LocalService;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sir.taxeSoukapi.domain.model.service.TaxeMensuelleService;
import com.sir.taxeSoukapi.domain.model.dao.TaxeMensuelleDao;
import com.sir.taxeSoukapi.domain.model.service.TauxMensuelService;

/**
 *
 * @author user
 */
@Service
public class TaxeMensuelleserviceImpl implements TaxeMensuelleService {

    @Autowired
    TaxeMensuelleDao taxeTrimesrielleDao;

    @Autowired
    TauxMensuelService tauxTrimestrielService;
    @Autowired
    LocalService localService;
    
    @Override
    public Date calculerDatePaiment() {
        Date date =  new Date();
        int y =date.getYear()+1900;
        Date datePaiment = null;
        if(date.getMonth()>= 0 && date.getMonth()<=2){
            datePaiment.setYear(y);
            datePaiment.setMonth(2);
            datePaiment.setDate(31);
            return datePaiment;
        }
        else if(date.getMonth()>= 3 && date.getMonth()<=5){
             datePaiment.setYear(y);
            datePaiment.setMonth(5);
            datePaiment.setDate(30);
            return datePaiment;
        }
        else if(date.getMonth()>= 6 && date.getMonth()<=8){
             datePaiment.setYear(y);
            datePaiment.setMonth(8);
            datePaiment.setDate(30);
            return datePaiment;
        }
        else{
            datePaiment.setYear(y);
            datePaiment.setMonth(11);
            datePaiment.setDate(31);
            return datePaiment;
        }
    }

  
    
//    @Override
//    public TaxeTrimestrielle save(TaxeTrimestrielle taxe) {
//        TaxeTrimestrielle t = findByLocalReferenceAndDatePaiment(taxe.getLocal().getReference(), taxe.getDatePaiment());
//        if (t != null) {
//            return null;
//        } else {
//            //chercher local et categorie
//            Local local = localService.findByReference(taxe.getLocal().getReference());
//            Categorie cat = local.getCategorie();
//            // chercher le pourcentage du tauxtrimestriel
//            TauxTrimestriel tauxTri=tauxTrimestrielService.findByCategorieReferenceAndDate(cat.getReference(), taxe.getDatePaiment());
//            double pourcentage=tauxTri.getPourcentage();
//            //chercher la surface
//            double surface=taxe.getLocal().getSurface();
//            //calculer montant de base
//            taxe.setMontantDeBase(calculerMontantDeBase(pourcentage,surface));
//            // nsiti update dernier paiement f local a bneti mais save c'est payer 
//            taxeTrimesrielleDao.save(taxe); 
//            return taxe;
//        }
//    }
    @Override
    public TaxeMensuelle save(TaxeMensuelle taxe) {
        TaxeMensuelle t = findByLocalReferenceAndDatePaiment(taxe.getLocal().getReference(), taxe.getDatePaiment());
        if (t != null) {
            return null;
        } else {
            //chercher local et categorie
            Local local = localService.findByReference(taxe.getLocal().getReference());
            Categorie cat = local.getCategorie();
              //chercher la surface
            double surface=local.getSurface();
             //calculer date paiment
           // taxe.setDatePaiment(calculerDatePaiment());
            // chercher le pourcentage du tauxtrimestriel
            TauxMensuel tauxTri=tauxTrimestrielService.findByCategorieReferenceAndDate(cat.getReference(), taxe.getDatePaiment());
            double pourcentage=tauxTri.getPourcentage();
            double penalite= tauxTri.getPenalite();
            double majoration=tauxTri.getMajoration();
            // calculer le nb de mois de retard
            //int nbMois=DateUtil.calculerNbMoisDeRetard(taxe.getDatePaiment());
            //calculer montant de base
            taxe.setMontantDeBase(calculerMontantDeBase(pourcentage,surface));
             //calculer le montant de la taxe
            // montant = calculerMontantTaxe(penalite, taxe.getMontantDeBase(),majoration , nbMois);
            // save taxe
            //taxe.setMontantTaxe(montant);
            taxe.setDatePresentation(new Date());
            taxeTrimesrielleDao.save(taxe); 
            return taxe;
        }
    }

    
    @Override
    public TaxeMensuelle findByRefLocal(String refLocal) {
        return taxeTrimesrielleDao.findByLocalReference(refLocal);
    }

    @Override
    public double calculerMontantDeBase(double pourcentage, double surface) {
        return surface * (1 + pourcentage);
    }

    @Override
    public double calculerMontantTaxe(double penalite, double montantBase, double majoration, int nbMois) {
        if (nbMois < 0) {
            return -1;
        } 
        else if(nbMois == 0) {
            return montantBase;
        }
        else if (nbMois == 1) {
            return montantBase + majoration;
        } else   {
            return montantBase + majoration + (nbMois - 1) * penalite;
        } 
    }

//    @Override
//    public TaxeTrimestrielle payer(TaxeTrimestrielle taxeTrimestrielle) {
////        verifier si la taxe est déja payée
//        if(taxeTrimestrielle.getDatePresentation()!=null){
//            return null;
//        }
////       "taxetrimestrielle.getDatePresentation==null" => la taxe est non payee
//        else{
////            calculer le nb de mois de retard
//            int nbMois=DateUtil.calculerNbMoisDeRetard(taxeTrimestrielle.getDatePaiment());
//
//            // chercher le pourcentage du tauxtrimestriel
//            Categorie cat=taxeTrimestrielle.getLocal().getCategorie();
//            TauxTrimestriel tauxTri=tauxTrimestrielService.findByCategorieReferenceAndDate(cat.getReference(), taxeTrimestrielle.getDatePaiment());
//            double penalite= tauxTri.getPenalite();
//            double majoration=tauxTri.getMajoration();
//           //calculer le montant de la taxe
//            double montant = calculerMontantTaxe(penalite, taxeTrimestrielle.getMontantDeBase(),majoration , nbMois);
//            // save taxe
//            taxeTrimestrielle.setMontantTaxe(montant);
//            taxeTrimestrielle.setDatePresentation(new Date());
//            taxeTrimesrielleDao.save(taxeTrimestrielle);
//            return taxeTrimestrielle;
//        }
//            
//    }

   

    
    @Override
    public TaxeMensuelle findByLocalReferenceAndDatePaiment(String reference, Date date) {
        return taxeTrimesrielleDao.findByLocalReferenceAndDatePaiment(reference, date);
    }

    public TaxeMensuelleDao getTaxeTrimesrielleDao() {
        return taxeTrimesrielleDao;
    }

    public void setTaxeTrimesrielleDao(TaxeMensuelleDao taxeTrimesrielleDao) {
        this.taxeTrimesrielleDao = taxeTrimesrielleDao;
    }

    public TauxMensuelService getTauxTrimestrielService() {
        return tauxTrimestrielService;
    }

    public void setTauxTrimestrielService(TauxMensuelService tauxTrimestrielService) {
        this.tauxTrimestrielService = tauxTrimestrielService;
    }

 

}
