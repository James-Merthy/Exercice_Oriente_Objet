package course_de_voiture.model.model;

import course_de_voiture.model.enumération.Couleur_voiture;
import course_de_voiture.model.enumération.Model_véhicule;

import java.util.Random;

public class Voiture {

    private Model_véhicule modelVoiture ;

    private Couleur_voiture couleur_vehicule ;

    private int vitesse_minimale ;

    private int vitesse_maximale ;

    public Voiture(Model_véhicule modelVoiture, Couleur_voiture couleur_vehicule, int vitesse_minimale, int vitesse_maximale) {

        this.modelVoiture = modelVoiture;
        this.couleur_vehicule = couleur_vehicule;
        this.vitesse_minimale = vitesse_minimale;
        this.vitesse_maximale = vitesse_maximale;
    }

    public  int getdistance () {

        Random random = new Random() ;

        return random.nextInt(vitesse_minimale,vitesse_maximale);
    }

    public int getVitesse_minimale() {
        return vitesse_minimale;
    }

    public void setVitesse_minimale(int vitesse_minimale) {
        this.vitesse_minimale = vitesse_minimale;
    }

    public int getVitesse_maximale() {
        return vitesse_maximale;
    }

    public void setVitesse_maximale(int vitesse_maximale) {
        this.vitesse_maximale = vitesse_maximale;
    }

    public Model_véhicule getModelVoiture() {
        return modelVoiture;
    }

    public void setModelVoiture(Model_véhicule modelVoiture) {
        this.modelVoiture = modelVoiture;
    }

    public Couleur_voiture getCouleur_vehicule() {
        return couleur_vehicule;
    }

    public void setCouleur_vehicule(Couleur_voiture couleur_vehicule) {
        this.couleur_vehicule = couleur_vehicule;
    }


}
