/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.adresseapi.domain.rest.converter.AbstractConverter;
import com.sir.taxeSoukapi.domain.bean.Local;
import com.sir.taxeSoukapi.domain.bean.TaxeAnnuelle;
import com.sir.taxeSoukapi.domain.rest.vo.TaxeAnnuelleVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class TaxeAnnuelleConverter extends AbstractConverter<TaxeAnnuelle, TaxeAnnuelleVo>{

    @Override
    public TaxeAnnuelle toItem(TaxeAnnuelleVo vo) {
         if (vo != null) {
            TaxeAnnuelle item = new TaxeAnnuelle();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
          
             if(vo.getLocal()!=null){
                item.setLocal(new LocalConverter().toItem(vo.getLocal()));
            }
//            if (vo.getDatePaiment()!= null) {
//                item.setReference(vo.getReference());
//            }
          
            if (vo.getRefRedevable()!= null) {
                item.setRefRedevable(vo.getRefRedevable());
            }
             
            return item;  
        }
        return null;
    }

    @Override
    public TaxeAnnuelleVo toVo(TaxeAnnuelle item) {
  if (item != null) {
            TaxeAnnuelleVo vo = new TaxeAnnuelleVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
          
             if(item.getLocal()!=null){
                vo.setLocal(new LocalConverter().toVo(item.getLocal()));
            }
//            if (vo.getDatePaiment()!= null) {
//                item.set(vo.getReference());
//            }
            if (item.getRefRedevable()!= null) {
                vo.setRefRedevable(item.getRefRedevable());
            }
             
            return vo;  
        }
        return null;
    }
    
}
