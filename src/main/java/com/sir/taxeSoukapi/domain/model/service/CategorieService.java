/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.service;

import com.sir.taxeSoukapi.domain.bean.Categorie;
import java.util.List;

/**
 *
 * @author user
 */
public  interface CategorieService {
        public Categorie findByReference(String reference);
        public int creer(Categorie categorie);
         public List<Categorie> findAll();
         public boolean existsById(Long id);
}
