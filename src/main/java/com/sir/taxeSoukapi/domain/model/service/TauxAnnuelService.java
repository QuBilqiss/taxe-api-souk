/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;

/**
 *
 * @author user
 */
public interface TauxAnnuelService {
    public int save(TauxAnnuel tauxAnnuel);
    public TauxAnnuel findByRefCategorie(String refCategorie);
}
