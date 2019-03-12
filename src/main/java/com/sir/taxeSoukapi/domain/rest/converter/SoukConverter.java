/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.taxeSoukapi.domain.bean.Souk;
import com.sir.taxeSoukapi.domain.rest.vo.SoukVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class SoukConverter extends AbstractConverter<Souk, SoukVo>{

    @Override
    public Souk toItem(SoukVo vo) {
        if (vo != null) {
            Souk item = new Souk();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference() != null) {
                item.setReference(vo.getReference());
            }
             if(item.getRefRue()!=null){
                vo.setRefRue(item.getRefRue());
            }
           
            return item;  
        }
        return null;
    }

    @Override
    public SoukVo toVo(Souk item) {
        if (item != null) {
             SoukVo vo = new SoukVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getReference() != null) {
                vo.setReference(item.getReference());
            }
            if(item.getRefRue()!=null){
                vo.setRefRue(item.getRefRue());
            }
            
           return vo;
        }
        return null;
    }
    
}
