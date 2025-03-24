package com.ohara.mon_app.dao;

import com.ohara.mon_app.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {

}
