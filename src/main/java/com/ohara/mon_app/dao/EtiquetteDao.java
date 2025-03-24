package com.ohara.mon_app.dao;

import com.ohara.mon_app.model.Etiquette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetteDao extends JpaRepository<Etiquette, Integer> {

}
