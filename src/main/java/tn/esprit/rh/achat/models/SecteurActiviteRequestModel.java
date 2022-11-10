package tn.esprit.rh.achat.models;

import lombok.Data;
import tn.esprit.rh.achat.entities.Fournisseur;
import java.util.Set;

@Data
public class SecteurActiviteRequestModel {

    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    private Set<Fournisseur> fournisseurs;
}
