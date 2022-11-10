package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.Facture;
import java.util.Set;

@Data
public class OperateurRequestModel {

    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;
    private Set<Facture> factures;
}
