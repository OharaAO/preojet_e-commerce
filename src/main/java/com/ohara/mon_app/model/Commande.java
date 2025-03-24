package com.ohara.mon_app.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.ohara.mon_app.view.AffichageCommande;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageCommande.class)
    protected Integer id;

    @Column(nullable = false)
    @NotNull
    @JsonView(AffichageCommande.class)
    protected LocalDateTime date;

    @OneToMany(mappedBy = "commande")
    @JsonView(AffichageCommande.class)
    protected List<LigneCommande> lignes = new ArrayList<>();


}
