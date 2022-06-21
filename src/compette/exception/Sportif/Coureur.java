package compette.exception.Sportif;

import java.time.LocalDate;
import java.util.Random;

public class Coureur extends Sportif{

    private int vitesseMoyenne ;

    private int poid ;
    public Coureur(String nom, String prenom, LocalDate dateness , int poid) {
        super(nom, prenom, dateness);

        if(poid < 50 || poid > 140)

            throw new IllegalStateException(" poid invalide !!!!");
        this.poid = poid ;

        Random rdm = new Random();

       vitesseMoyenne = rdm.nextInt(8,13) ;
    }

    public int performer (){

        Random rdm = new Random();

        return  vitesseMoyenne / poid  * rdm.nextInt(110,130)   ;


    }


}
