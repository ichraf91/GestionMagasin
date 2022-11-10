package tn.esprit.rh.achat.services;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Fournisseur;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class FournisseurServiceImplTest {

    @Autowired
    IFournisseurService fService;

    @Test
    @Order(0)
    void addFournisseur() {
        Fournisseur f = fService.addFournisseur(Fournisseur.builder()
                .code("1111")
                .libelle("ABC")
                .build()
        );
        Assertions.assertNotNull(f);
    }

    @Test
    void retrieveAllFournisseurs() {
    }

    @Test
    void retrieveFournisseur() {
    }
}