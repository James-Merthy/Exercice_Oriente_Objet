package chevalier.model;

import java.util.HashMap;

public class Cavalier {

    private String nom;

    private String nom_de_famille ;

    private HashMap <String , Cheval > chevaux ;

    public Cavalier(String nom, String nom_de_famille) {
        this.nom = nom;
        this.nom_de_famille = nom_de_famille;

        this.chevaux = new HashMap<>();
    }

    public Cavalier(String nom, String nom_de_famille, HashMap<String, Cheval> chevaux) {
        this.nom = nom;
        this.nom_de_famille = nom_de_famille;
        this.chevaux = chevaux;
    }

    public String getNom() {
        return nom;
    }

    public String getNom_de_famille() {
        return nom_de_famille;
    }

    public HashMap<String, Cheval> getChevaux() {
        return chevaux;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNom_de_famille(String nom_de_famille) {
        this.nom_de_famille = nom_de_famille;
    }

    public void add_cheval(Cheval cheval_A_ajouter) {
        this.chevaux.put(cheval_A_ajouter.getNom(),cheval_A_ajouter);
    }
}
