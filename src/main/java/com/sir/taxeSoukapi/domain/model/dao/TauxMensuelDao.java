/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.dao;

import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface TauxMensuelDao extends JpaRepository<TauxMensuel, Long>{
    
    public List<TauxMensuel>  findByCategorieReference(String refCategorie);//dozi 3la dao o 7yedi dik By By o diri And And ok
    public TauxMensuel findByCategorieReferenceAndDateDebutAndDateFin(String refCategorie,Date dateDebut,Date dateFin);

}
