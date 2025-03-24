package com.ohara.mon_app.dao;

import com.ohara.mon_app.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Integer> {

}
