package com.ohara.mon_app.controller;

import com.ohara.mon_app.dao.ProduitDao;
import com.ohara.mon_app.model.Produit;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
public class ProduitController {
    // @Autowired
    // protected ProduitDao produitDao;

    protected ProduitDao produitDao;

    @Autowired
    public ProduitController(ProduitDao produitDao) {
        this.produitDao = produitDao;
    }

    @GetMapping("/Product/{id}")
    public ResponseEntity<Produit> get(@PathVariable int id) {
        Optional<Produit> optionalProduit = produitDao.findById(id);

        if (optionalProduit.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(optionalProduit.get(), HttpStatus.OK);
    }

    @GetMapping("/Products")
    public List<Produit> getAll() {
        return produitDao.findAll();
    }

    @PostMapping("/CreateProduct")
    public ResponseEntity<Produit> save(@RequestBody @Valid Produit produit) {
        produitDao.save(produit);

        return new ResponseEntity<>(produit, HttpStatus.CREATED);
    }

    @DeleteMapping("/Product/{id}")
    public ResponseEntity<Produit> delete(@PathVariable int id) {

        Optional<Produit> optionalProduit = produitDao.findById(id);

        if (optionalProduit.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        produitDao.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PutMapping("/produit/{id}")
    public ResponseEntity<Produit> update(
            @PathVariable int id,
            @RequestBody @Valid Produit produit) {

        Optional<Produit> optionalProduit = produitDao.findById(id);

        if (optionalProduit.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        produit.setId(id);

        produitDao.save(produit);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
