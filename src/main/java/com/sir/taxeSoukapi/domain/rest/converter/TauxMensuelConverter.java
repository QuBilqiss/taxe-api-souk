/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.rest.converter;

import com.sir.taxeSoukapi.common.util.NumberUtil;
import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import com.sir.taxeSoukapi.domain.rest.vo.TauxMensuelVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class TauxMensuelConverter extends AbstractConverter<TauxMensuel, TauxMensuelVo>{

    @Override
    public TauxMensuel toItem(TauxMensuelVo vo) {
          if (vo != null) {
            TauxMensuel item = new TauxMensuel();
            if(vo.getId()!=null){
                item.setId(vo.getId());
            }
          
             if(vo.getCategorieVo()!=null){
                item.setCategorie(new CategorieConverter().toItem(vo.getCategorieVo()));
            }
//            if (vo.getDateDebut()!= null) {
//                item.setReference(vo.getReference());
//            }
//            if (vo.getDateFin()!= null) {
//                item.setReference(vo.getReference());
//            }
            if (vo.getPourcentage()!= null) {
                item.setPourcentage(NumberUtil.toDouble(vo.getPourcentage()));
            }
              if (vo.getMajoration()!= null) {
                item.setMajoration(NumberUtil.toDouble(vo.getMajoration()));
            }
               if (vo.getPenalite()!= null) {
                item.setPenalite(NumberUtil.toDouble(vo.getPenalite()));
            }
            return item;  
        }
        return null;
    
    }

    @Override
    public TauxMensuelVo toVo(TauxMensuel item) {
           if (item != null) {
            TauxMensuelVo vo = new TauxMensuelVo();
            if(item.getId()!=null){
                vo.setId(item.getId());
            }
          
             if(item.getCategorie()!=null){
                vo.setCategorieVo(new CategorieConverter().toVo(item.getCategorie()));
            }
//            if (vo.getDateDebut()!= null) {
//                item.setReference(vo.getReference());
//            }
//            if (vo.getDateFin()!= null) {
//                item.setReference(vo.getReference());
//            }
            if (item.getPourcentage()!= null) {
                vo.setPourcentage(NumberUtil.doubleToString(item.getPourcentage()));
            }
              if (item.getMajoration()!= null) {
                vo.setMajoration(NumberUtil.doubleToString(item.getMajoration()));
            }
               if (item.getPenalite()!= null) {
                vo.setPenalite(NumberUtil.doubleToString(item.getPenalite()));
            }
            return vo;  
        }
        return null;
    }
    
}
