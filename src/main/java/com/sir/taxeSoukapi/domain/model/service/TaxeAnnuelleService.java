/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TaxeAnnuelle;

/**
 *
 * @author user
 */
public interface TaxeAnnuelleService {
   public TaxeAnnuelle findByRefLocal(String refLocal);
    public TaxeAnnuelle save(TaxeAnnuelle taxeAnnuelle);
}
