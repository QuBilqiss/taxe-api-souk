/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.TaxeTrimestrielle;

/**
 *
 * @author user
 */
public interface TaxeTrimestrielleService {
    public TaxeTrimestrielle findByRefLocal(String refLocal);
    public TaxeTrimestrielle save(TaxeTrimestrielle taxeTrimestrielle);
}
