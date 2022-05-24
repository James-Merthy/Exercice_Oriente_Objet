package chevalier.model;

import java.util.HashMap;

public class Cavalier {
    private String nom;
    private String nomFamille;
    private HashMap<String, Monture> montures;

    // Constructeur


    public Cavalier(String nom, String nomFamille) {
        this.nom = nom;
        this.nomFamille = nomFamille;
        this.montures = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public HashMap<String, Monture> getMontures() {
        return montures;
    }

    public void addMonture(Monture monture) {
        this.montures.put(monture.getNom(), monture);
    }
}
