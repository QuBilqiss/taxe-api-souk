/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public interface TauxAnnuelService {
    public List<TauxAnnuel> findByCategorieReference(String refCategorie);
    public TauxAnnuel findByCategorieReferenceByDate(String refCategorie, Date date);
    public TauxAnnuel findByCategorieReferenceByDateDebutByDateFin(String refCategorie,Date dateDebut,Date dateFin);
    public TauxAnnuel save(TauxAnnuel tauxAnnuel);
}
