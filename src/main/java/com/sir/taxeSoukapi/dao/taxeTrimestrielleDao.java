/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.dao;

import com.sir.taxeSoukapi.bean.TaxeTrimestrielle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface taxeTrimestrielleDao extends JpaRepository<TaxeTrimestrielle, Long>{
    public TaxeTrimestrielle findByRefLocal(String refLocal);
}
