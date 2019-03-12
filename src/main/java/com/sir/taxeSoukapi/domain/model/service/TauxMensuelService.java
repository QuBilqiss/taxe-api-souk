/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TauxMensuel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public interface TauxMensuelService {
    public List<TauxMensuel>  findByCategorieReference(String refCategorie);
    public TauxMensuel findByCategorieReferenceByDate(String refCategorie, Date date);
    public TauxMensuel findByCategorieReferenceByDateDebutByDateFin(String refCategorie,Date dateDebut,Date dateFin);
    public TauxMensuel save(TauxMensuel tauxTrimestriel);
    public TauxMensuel findByCategorieReferenceAndDate(String reference, Date datePaiment);
    
}
