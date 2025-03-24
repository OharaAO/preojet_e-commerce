package com.ohara.mon_app.dao;

import com.ohara.mon_app.model.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeDao extends JpaRepository<LigneCommande, Integer> {

}
