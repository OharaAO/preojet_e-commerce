package com.ohara.mon_app.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.ohara.mon_app.view.AffichageCommande;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageCommande.class)
    protected Integer id;

    @Column(nullable = false)
    @NotBlank
    @JsonView(AffichageCommande.class)
    protected String nom;

    @Column(length = 10, nullable = false, unique = true)
    @Length(max = 10, min = 3)  // contrainte : vérifie que l'information envoyée est valide
    @NotBlank
    @JsonView(AffichageCommande.class)
    protected String code;


    @Column(columnDefinition = "TEXT")
    @JsonView(AffichageCommande.class)
    protected String description;

    @DecimalMin(value = "0.1")
    
    protected float prix;

    @ManyToOne

    protected Etat etat;

    @ManyToMany

    @JoinTable(
            name = "etiquette_produit", // definir le nom de la table de jointure
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "etiquette_id") // pour renomer le nom du champ de la table de jointure

    )
    protected List<Etiquette> etiquette = new ArrayList<>();


}
