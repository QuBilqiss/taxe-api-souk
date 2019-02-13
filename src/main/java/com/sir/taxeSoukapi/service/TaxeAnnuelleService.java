/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.service;

import com.sir.taxeSoukapi.bean.TaxeAnnuelle;

/**
 *
 * @author user
 */
public interface TaxeAnnuelleService {
    public int save(TaxeAnnuelle taxeAnnuelle);
    public TaxeAnnuelle findByRefLocal(String refLocal);
}
