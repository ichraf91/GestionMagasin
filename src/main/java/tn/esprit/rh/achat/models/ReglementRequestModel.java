package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.Facture;

import java.util.Date;

@Data
public class ReglementRequestModel {

    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    private Boolean payee;
    private Date dateReglement;
    private Facture facture;
}
