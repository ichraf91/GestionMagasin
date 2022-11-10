package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.entities.DetailFacture;
import tn.esprit.rh.achat.entities.Stock;

import java.util.Date;
import java.util.Set;

@Data
public class ProduitRequestModel {
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    private Date dateCreation;
    private Date dateDerniereModification;
    private Stock stock;
    private Set<DetailFacture> detailFacture;
    private CategorieProduit categorieProduit;
}
