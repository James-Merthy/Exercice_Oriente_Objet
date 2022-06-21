package compette.exception.Sportif;

import java.time.LocalDate;
import java.util.Random;

public class Judoka extends Sportif{

    private int puissanceProjection ;
    public Judoka(String nom, String prenom, LocalDate dateness) {
        super(nom, prenom, dateness);

        Random rdm = new Random();

        puissanceProjection = rdm.nextInt(40,80) ;
    }

    public int performer (){

        Random rdm = new Random();

        return rdm.nextInt(-20,20) + puissanceProjection ;


    }
}
