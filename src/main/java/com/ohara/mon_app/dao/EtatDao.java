package com.ohara.mon_app.dao;

import com.ohara.mon_app.model.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDao extends JpaRepository<Etat, Integer> {

}
