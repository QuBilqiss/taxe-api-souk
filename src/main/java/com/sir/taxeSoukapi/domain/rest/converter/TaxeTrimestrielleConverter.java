/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.adresseapi.domain.rest.converter.AbstractConverter;
import com.sir.taxeSoukapi.common.util.NumberUtil;
import com.sir.taxeSoukapi.domain.bean.TaxeTrimestrielle;
import com.sir.taxeSoukapi.domain.rest.vo.TaxeTrimestrielleVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class TaxeTrimestrielleConverter extends AbstractConverter<TaxeTrimestrielle, TaxeTrimestrielleVo>{

    @Override
    public TaxeTrimestrielle toItem(TaxeTrimestrielleVo vo) {
   if (vo != null) {
            TaxeTrimestrielle item = new TaxeTrimestrielle();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
          
             if(vo.getLocalVo()!=null){
                item.setLocal(new LocalConverter().toItem(vo.getLocalVo()));
            }
//            if (vo.getDatePaiment()!= null) {
//                item.setReference(vo.getReference());
//            }
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
    public TaxeTrimestrielleVo toVo(TaxeTrimestrielle item) {
        if (item != null) {
            TaxeTrimestrielleVo vo = new TaxeTrimestrielleVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
          
             if(item.getLocal()!=null){
                vo.setLocal(new LocalConverter().toVo(item.getLocal()));
            }
//            if (vo.getDatePaiment()!= null) {
//                item.set(vo.getReference());
//            }if(datepresentation)
            if (item.getRefRedevable()!= null) {
                vo.setRefRedevable(item.getRefRedevable());
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
