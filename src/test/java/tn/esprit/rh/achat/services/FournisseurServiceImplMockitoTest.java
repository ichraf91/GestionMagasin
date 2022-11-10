package tn.esprit.rh.achat.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.repositories.FournisseurRepository;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = {FournisseurRepository.class})
@SpringBootTest
@Slf4j

class FournisseurServiceImplMockitoTest {

    @Mock
    FournisseurRepository fRepository;

    @InjectMocks
    FournisseurServiceImpl fService;
    Fournisseur f =(Fournisseur.builder()
            .code("33265")
            .libelle("AVC").build());


    @Test
    void TestRetrieveFournisseur() {
        Mockito.when(fRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(f));
        Fournisseur f = fService.retrieveFournisseur(2L);
        Mockito.verify(fRepository).findById(Mockito.anyLong());
        assertNotNull(f);
        log.info(f.toString());

    }


    @Test
    void TestRetrieveAllFournisseurs() {
        List<Fournisseur> fList = new ArrayList<Fournisseur>() {
            private static final long serialVersionUID = 1L;
            {
                add(Fournisseur.builder()
                        .code("33265")
                        .libelle("AVC").build());
                add(Fournisseur.builder()
                        .code("33267")
                        .libelle("AVG").build());
            }
        };
        //ArrayList<Facture> factureList = new ArrayList<>();
        Mockito.when(fRepository.findAll()).thenReturn(fList);
        List<Fournisseur> actualRetrieveAllFacturesResult = fService.retrieveAllFournisseurs();
        assertSame(fList , actualRetrieveAllFacturesResult );
        Mockito.verify(fRepository).findAll();
        log.info("Retrieved : "+actualRetrieveAllFacturesResult.toString());
        log.info("Actual : "+fList.toString());

    }
}