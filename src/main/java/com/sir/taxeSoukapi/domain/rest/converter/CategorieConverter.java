/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.taxeSoukapi.domain.bean.Categorie;
import com.sir.taxeSoukapi.domain.rest.vo.CategorieVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class CategorieConverter extends AbstractConverter<Categorie, CategorieVo>{

    @Override
    public Categorie toItem(CategorieVo vo) {
         if (vo != null) {
            Categorie item = new Categorie();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference() != null) {
                item.setReference(vo.getReference());
            }
           
            return item;  
        }
        return null;
    }

    @Override
    public CategorieVo toVo(Categorie item) {
        if (item != null) {
             CategorieVo vo = new CategorieVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
            if (item.getReference() != null) {
                vo.setReference(item.getReference());
            }
            
           return vo;
        }
        return null;
    }
    
}
