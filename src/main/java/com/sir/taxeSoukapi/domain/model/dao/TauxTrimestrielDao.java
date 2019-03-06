/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.dao;

import com.sir.taxeSoukapi.domain.bean.TauxTrimestriel;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface TauxTrimestrielDao extends JpaRepository<TauxTrimestriel, Long>{
    public List<TauxTrimestriel>  findByCategorieReference(String refCategorie);
    public TauxTrimestriel findByCategorieReferenceByDateDebutByDateFin(String refCategorie,Date dateDebut,Date dateFin);

}
