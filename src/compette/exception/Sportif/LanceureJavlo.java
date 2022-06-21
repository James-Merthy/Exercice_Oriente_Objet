package compette.exception.Sportif;

import java.time.LocalDate;
import java.util.Random;

public class LanceureJavlo extends Sportif{

    private int force ;

    private int anneeExp ;

    public LanceureJavlo(String nom, String prenom, LocalDate dateness , int anneeExp) {
        super(nom, prenom, dateness);

        if (anneeExp > 20 || anneeExp < 0)

            throw new IllegalStateException("excperience invalid !! ");

        this.anneeExp = anneeExp ;

        Random rdm = new Random();

        force = rdm.nextInt(30,50) ;
    }

    public int performer(){

        Random rdm = new Random();

        return  force + anneeExp * rdm.nextInt(110,130)  ;


    }

}
