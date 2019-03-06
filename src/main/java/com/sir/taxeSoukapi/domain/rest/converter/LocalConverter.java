
import com.sir.adresseapi.domain.rest.converter.AbstractConverter;
import com.sir.taxeSoukapi.common.util.NumberUtil;
import com.sir.taxeSoukapi.domain.bean.Categorie;
import com.sir.taxeSoukapi.domain.bean.Local;
import com.sir.taxeSoukapi.domain.rest.converter.CategorieConverter;
import com.sir.taxeSoukapi.domain.rest.converter.SoukConverter;
import com.sir.taxeSoukapi.domain.rest.vo.LocalVo;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
@Component
public class LocalConverter extends AbstractConverter<Local, LocalVo>{

    @Override
    public Local toItem(LocalVo vo) {
          if (vo != null) {
            Local item = new Local();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
           
            if (vo.getDernierMontantPaye()!= null) {
                item.setDernierMontantPaye(NumberUtil.toDouble(vo.getDernierMontantPaye()));
            }
            if (vo.getDernierAnneePaye()!= null) {
                item.setDernierAnneePaye(NumberUtil.toDouble(vo.getDernierAnneePaye()));
            } 
            if (vo.getDernierTrimestrePaye()!= null) {
                item.setDernierTrimestrePaye(NumberUtil.toDouble(vo.getDernierTrimestrePaye()));
            }
            if(vo.getCategorieVo()!= null){
                item.setCategorie(new CategorieConverter().toItem(vo.getCategorieVo()));
            }      
            if(vo.getSurface()!= null){
                item.setSurface(NumberUtil.toDouble(vo.getSurface()));
            }
               if (vo.getSoukVo()!= null) {
                item.setSouk(new SoukConverter().toItem(vo.getSoukVo()));
            }
            return item;
        }
        return null;
    }

    @Override
    public LocalVo toVo(Local item) {
         if (item != null) {
            LocalVo vo = new LocalVo();
             
              if(item.getId()!=null){
                vo.setId(vo.getId());
            }
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
           
            if (item.getDernierMontantPaye()!= null) {
                vo.setDernierMontantPaye(NumberUtil.doubleToString(item.getDernierMontantPaye()));
            }
            if (item.getDernierAnneePaye()!= null) {
                vo.setDernierAnneePaye(NumberUtil.doubleToString(item.getDernierAnneePaye()));
            } 
            if (item.getDernierTrimestrePaye()!= null) {
                vo.setDernierTrimestrePaye(NumberUtil.doubleToString(item.getDernierTrimestrePaye()));
            }
            if(item.getCategorie()!= null){
                vo.setCategorieVo(new CategorieConverter().toVo(item.getCategorie()));
            }      
            if(item.getSurface()!= null){
                vo.setSurface(NumberUtil.doubleToString(item.getSurface()));
            }
               if (item.getSouk()!= null) {
                vo.setSoukVo(new SoukConverter().toVo(item.getSouk()));
            }
            return vo;
        }
        return null;
    }


}
