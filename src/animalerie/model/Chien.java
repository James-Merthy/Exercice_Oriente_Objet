package animalerie.model;

import animalerie.enumeration.CouleurColier;
import animalerie.enumeration.RaceChien;
import animalerie.enumeration.Sexe;

import java.time.LocalDate;
import java.util.Random;

public class Chien extends Animale{

    private CouleurColier couleurcolier ;

    private boolean estDresser ;

    private RaceChien raceChien ;

    private boolean dead = false ;

    public Chien(String nom, int poids, int taille, int age, int age_humain,
                 Sexe sexe, LocalDate date_d_arriver, CouleurColier couleurcolier,
                 boolean estDresser, RaceChien raceChien) {
        super(nom, poids, taille, age, age_humain, sexe, date_d_arriver);
        this.couleurcolier = couleurcolier;
        this.estDresser = estDresser;
        this.raceChien = raceChien;
        this.dead = dead;
    }

    public CouleurColier getCouleurcolier() {
        return couleurcolier;
    }

    public void setCouleurcolier(CouleurColier couleurcolier) {
        this.couleurcolier = couleurcolier;
    }

    public boolean isEstDresser() {
        return estDresser;
    }

    public void setEstDresser(boolean estDresser) {
        this.estDresser = estDresser;
    }

    public RaceChien getRaceChien() {
        return raceChien;
    }

    public void setRaceChien(RaceChien raceChien) {
        this.raceChien = raceChien;
    }

    public boolean isDead() {
        if (getProbabilite_de_mourir() <= 10){

            dead = true ;
        }
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getProbabilite_de_mourir() {
        Random random = new Random( );

        int probabilite_de_mourir ;

        probabilite_de_mourir = random.nextInt(0,100) ;


        return probabilite_de_mourir;
    }
}
