package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.CategorieFournisseur;
import tn.esprit.rh.achat.entities.DetailFournisseur;
import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.SecteurActivite;
import java.util.Set;

@Data
public class FournisseurRequestModel {

    private Long idFournisseur;
    private String code;
    private String libelle;
    private CategorieFournisseur categorieFournisseur;
    private Set<Facture> factures;
    private Set<SecteurActivite> secteurActivites;
    private DetailFournisseur detailFournisseur;

}