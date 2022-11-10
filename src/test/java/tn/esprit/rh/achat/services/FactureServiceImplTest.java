package tn.esprit.rh.achat.services;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Facture;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@Slf4j
class FactureServiceImplTest {

    @Autowired
    IFactureService factureService;

    @Test
    @Order(0)
    void TestAddFacture() {
//        Facture facture = factureService.addFacture(Facture.builder()
//                .dateCreationFacture(new Date())
//                .archivee(false)
//                .build()
//        );
//        Assertions.assertNotNull(facture);
    }

    @Test
    @Order(1)
    void TestRetrieveAllFactures() {
//        int sizeFactures = factureService.retrieveAllFactures().size();
//        factureService.addFacture(factureService.addFacture(Facture.builder().montantFacture(300F).dateCreationFacture(new Date()).build()));
//        log.info("Size:"+String.valueOf(sizeFactures));
//        Assertions.assertEquals(sizeFactures+1, factureService.retrieveAllFactures().size());
    }

}