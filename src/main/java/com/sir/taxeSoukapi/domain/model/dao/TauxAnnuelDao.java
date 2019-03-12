/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeSoukapi.domain.model.dao;

import com.sir.taxeSoukapi.domain.bean.TauxAnnuel;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface TauxAnnuelDao extends JpaRepository<TauxAnnuel, Long>{
    public List<TauxAnnuel> findByCategorieReference(String refCategorie);
    // wikkk wikkk tanghwet f 9ures vite et j ai pas fiat attention ok :pc parce que  javaiss fait cela tissem b7al ila tandwi m3a dela7 nn monsi
    public TauxAnnuel findByCategorieReferenceAndDateDebutAndDateFin(String refCategorie,Date dateDebut,Date dateFin);
}
