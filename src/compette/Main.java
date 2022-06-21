package compette;

import compette.exception.EtatCompetitionException;

public class Main {

    public static void main(String[] args) {

        Competition c1 = new Competition(5) ;

        c1.lancer();

        try {

            c1.inscrire(new Sportif("","",null));
        }catch (EtatCompetitionException ex){

            System.out.println(ex.getMessage());
        }


    }
}
