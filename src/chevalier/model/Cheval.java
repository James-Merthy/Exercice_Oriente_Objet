package chevalier.model;

import java.util.Random;

public class Cheval {

    private String nom;

    private int vitesse_minimum;

    private int getVitesse_maximum;


    public Cheval(String nom, int vitesse_minimum, int getVitesse_maximum) {

        if (nom.equals("")){

            System.out.println("no name");
        }
        this.nom = nom;
        this.vitesse_minimum = vitesse_minimum;
        this.getVitesse_maximum = getVitesse_maximum;
    }

    public Cheval(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVitesse_minimum() {
        return vitesse_minimum;
    }

    public void setVitesse_minimum(int vitesse_minimum) {
        this.vitesse_minimum = vitesse_minimum;
    }

    public int getGetVitesse_maximum() {
        return getVitesse_maximum;
    }

    public void setGetVitesse_maximum(int getVitesse_maximum) {
        this.getVitesse_maximum = getVitesse_maximum;
    }

    public int courir (int bonus){

        Random random = new Random();

        return random.nextInt(vitesse_minimum, getVitesse_maximum + bonus);
    }

    public int courir (){

        Random random = new Random();

        return random.nextInt(vitesse_minimum, getVitesse_maximum );
    }

    public static void henirv(){

        System.out.println("brrrrrrrrrrrr");
    }




}
