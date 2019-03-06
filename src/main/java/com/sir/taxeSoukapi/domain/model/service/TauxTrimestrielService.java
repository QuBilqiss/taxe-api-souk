/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TauxTrimestriel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public interface TauxTrimestrielService {
    public List<TauxTrimestriel>  findByCategorieReference(String refCategorie);
    public TauxTrimestriel findByCategorieReferenceByDate(String refCategorie, Date date);
    public TauxTrimestriel findByCategorieReferenceByDateDebutByDateFin(String refCategorie,Date dateDebut,Date dateFin);
    public TauxTrimestriel save(TauxTrimestriel tauxTrimestriel);
    
}
