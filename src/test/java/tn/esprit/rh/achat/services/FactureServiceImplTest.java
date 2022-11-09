package tn.esprit.rh.achat.services;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Facture;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class FactureServiceImplTest {

    @Autowired
    IFactureService factureService;

    @Test
    @Order(0)
    void addFacture() {
        Facture facture = factureService.addFacture(Facture.builder()
                .dateCreationFacture(new Date())
                .archivee(false)
                .build()
        );
        Assertions.assertNotNull(facture);
    }

    @Test
    void retrieveAllFactures() {
    }



    @Test
    void cancelFacture() {
    }

    @Test
    void retrieveFacture() {
    }

    @Test
    void getFacturesByFournisseur() {
    }

    @Test
    void assignOperateurToFacture() {
    }

    @Test
    void pourcentageRecouvrement() {
    }
}