package compette.exception.Sportif;

import java.time.LocalDate;
import java.util.Random;

public abstract class Sportif  {

    private String nom ;

    private String prenom ;

    private LocalDate dateness ;

    public Sportif(String nom, String prenom, LocalDate dateness) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateness = dateness;
    }

    public int performer (){

        Random rdm = new Random();

        return rdm.nextInt(1,101);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateness() {
        return dateness;
    }

    public void setDateness(LocalDate dateness) {
        this.dateness = dateness;
    }
}
