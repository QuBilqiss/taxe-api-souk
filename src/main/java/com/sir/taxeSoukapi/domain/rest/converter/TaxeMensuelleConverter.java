/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.taxeSoukapi.common.util.DateUtil;
import com.sir.taxeSoukapi.common.util.NumberUtil;
import com.sir.taxeSoukapi.domain.bean.TaxeMensuelle;
import com.sir.taxeSoukapi.domain.rest.vo.TaxeMensuelleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class TaxeMensuelleConverter extends AbstractConverter<TaxeMensuelle, TaxeMensuelleVo>{
    
     @Autowired              
     DateUtil dateUtil;

    @Override
    public TaxeMensuelle toItem(TaxeMensuelleVo vo) {
   if (vo != null) {
            TaxeMensuelle item = new TaxeMensuelle();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
          
             if(vo.getLocalVo()!=null){
                item.setLocal(new LocalConverter().toItem(vo.getLocalVo()));
            }
            if (vo.getDatePaiment()!= null) {
                item.setDatePaiment(dateUtil.parseCommandeStyle( vo.getDatePaiment()));
            }
             if (vo.getDatePresentation()!= null) {
                item.setDatePresentation(dateUtil.parseCommandeStyle( vo.getDatePresentation()));
            }
            if (vo.getMontantDeBase()!= null) {
                item.setMontantDeBase(NumberUtil.toDouble(vo.getMontantDeBase()));
            }
           if (vo.getMontantMajoration()!= null) {
                item.setMontantMajoration(NumberUtil.toDouble(vo.getMontantMajoration()));
            }
           if (vo.getMontantPenalité()!= null) {
                item.setMontantPenalité(NumberUtil.toDouble(vo.getMontantPenalité()));
            }
           if (vo.getMontantTaxe()!= null) {
                item.setMontantTaxe(NumberUtil.toDouble(vo.getMontantTaxe()));
            }
        
            return item;  
        }
        return null;
    }

    @Override
    public TaxeMensuelleVo toVo(TaxeMensuelle item) {
        if (item != null) {
            TaxeMensuelleVo vo = new TaxeMensuelleVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
          
             if(item.getLocal()!=null){
                vo.setLocalVo(new LocalConverter().toVo(item.getLocal()));
            }
          if (item.getDatePaiment()!= null) {
               
                vo.setDatePaiment(dateUtil.formatCommandeStyle(item.getDatePaiment()));
            }
            if (item.getDatePresentation()!= null) {
               
                vo.setDatePresentation(dateUtil.formatCommandeStyle(item.getDatePresentation()));
            }
     
            if (item.getMontantDeBase()!= null) {
                vo.setMontantDeBase(NumberUtil.doubleToString(item.getMontantDeBase()));
            }
           if (item.getMontantMajoration()!= null) {
                vo.setMontantMajoration(NumberUtil.doubleToString(item.getMontantMajoration()));
            }
           if (item.getMontantPenalité()!= null) {
                vo.setMontantPenalité(NumberUtil.doubleToString(item.getMontantPenalité()));
            }
           if (item.getMontantTaxe()!= null) {
                vo.setMontantTaxe(NumberUtil.doubleToString(item.getMontantTaxe()));
            }
            return vo;  
        }
        return null;
    }
    
}
