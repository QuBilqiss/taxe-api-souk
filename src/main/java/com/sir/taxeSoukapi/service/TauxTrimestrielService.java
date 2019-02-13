/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.service;

import com.sir.taxeSoukapi.bean.TauxTrimestriel;

/**
 *
 * @author user
 */
public interface TauxTrimestrielService {
    public int save(TauxTrimestriel tauxTrimestriel);
    public TauxTrimestriel findByCategorieReference(String refCategorie);
}
