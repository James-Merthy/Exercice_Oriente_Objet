package animalerie.model;

import animalerie.enumeration.Couleuroiseaux;
import animalerie.enumeration.Sexe;

import java.time.LocalDate;
import java.util.Random;

public class Oiseaux extends Animale{

    private Couleuroiseaux couleuroiseaux ;

    private boolean vieVolierre ;

    private boolean vie_dans_une_cage ;

    private boolean dead = false ;

    public Oiseaux(String nom, int poids, int taille, int age,
                   int age_humain, Sexe sexe, LocalDate date_d_arriver,
                   Couleuroiseaux couleuroiseaux, boolean vieVolierre,
                   boolean vie_dans_une_cage) {
        super(nom, poids, taille, age, age_humain, sexe, date_d_arriver);
        this.couleuroiseaux = couleuroiseaux;
        this.vieVolierre = vieVolierre;
        this.vie_dans_une_cage = vie_dans_une_cage;
    }

    public Couleuroiseaux getCouleuroiseaux() {
        return couleuroiseaux;
    }

    public void setCouleuroiseaux(Couleuroiseaux couleuroiseaux) {
        this.couleuroiseaux = couleuroiseaux;
    }

    public boolean isVieVolierre() {
        return vieVolierre;
    }

    public void setVieVolierre(boolean vieVolierre) {
        this.vieVolierre = vieVolierre;
    }

    public boolean isVie_dans_une_cage() {
        return vie_dans_une_cage;
    }

    public void setVie_dans_une_cage(boolean vie_dans_une_cage) {
        this.vie_dans_une_cage = vie_dans_une_cage;
    }

    public boolean isDead() {
        if (getProbabilite_de_mourir() <= 15){

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
