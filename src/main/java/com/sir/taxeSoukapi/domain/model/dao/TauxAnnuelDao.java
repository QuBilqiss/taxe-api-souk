/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.dao;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface TauxAnnuelDao extends JpaRepository<TauxAnnuel, Long>{
    public TauxAnnuel findByCategorieReference(String refCategorie);
    public TauxAnnuel save(TauxAnnuel tauxAnnuel);
    
}
