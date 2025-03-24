INSERT INTO etat (nom)
VALUES ("neuf"),
       ("occasion"),
       ("bon");

INSERT INTO etiquette (nom)
VALUES ("saint valentin"),
       ("promo"),
       ("fête des mères"),
       ("nouvel-an");


INSERT INTO produit (nom, code, description, prix, etat_id)
VALUES ('coca', 'coc', 'Une bouteille de 1L de coca', 2.5, 1),
       ('orangina', 'org', 'Une bouteille de 1L d\'orangina', 2.1, 2);


INSERT INTO etiquette_produit (produit_id, etiquette_id)
VALUES (1, 1),
       (1, 4),
       (2, 3);


INSERT INTO commande (date)
VALUES (NOW());

INSERT INTO ligne_commande (commande_id, quantite, prix_vente, produit_id)
VALUES (1, 2, 1500, 2);
