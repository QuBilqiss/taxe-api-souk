/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;
      //com.sir.taxeSoukapi.domain.model.service.TaxeTrimestrielleService  
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
       
import java.util.Date;

/**
 *
 * @author user
 */
public interface TaxeMensuelleService {
    
    public TaxeMensuelle findByRefLocal(String refLocal);
    public TaxeMensuelle save(TaxeMensuelle taxeTrimestrielle);
    public double calculerMontantDeBase(double pourcentage, double surface);
    public double calculerMontantTaxe(double penalite, double montantBase, double majoration, int nbMois);
    //public TaxeTrimestrielle payer(TaxeTrimestrielle taxeTrimestrielle) ;
    public TaxeMensuelle findByLocalReferenceAndDatePaiment(String reference, Date date); 
    public Date calculerDatePaiment();
    
}
