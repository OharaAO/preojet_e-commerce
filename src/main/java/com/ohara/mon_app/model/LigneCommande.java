package com.ohara.mon_app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.ohara.mon_app.view.AffichageCommande;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @DecimalMin(value = "0.1")
    @JsonView(AffichageCommande.class)
    protected float prixVente;

    @Min(value = 1)
    @JsonView(AffichageCommande.class)
    protected int quantite;

    @ManyToOne
    @JoinColumn
    @JsonView(AffichageCommande.class)
    protected Produit produit;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore // pour gérer le problème de du json ifini
    protected Commande commande;


}
