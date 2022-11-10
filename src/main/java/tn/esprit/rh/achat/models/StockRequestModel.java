package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.Produit;
import java.util.Set;

@Data
public class StockRequestModel {
    private Long idStock;
    private String libelleStock;
    private Integer qte;
    private Integer qteMin;
    private Set<Produit> produits;
}
