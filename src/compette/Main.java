package compette;

import compette.exception.EtatCompetitionException;
import compette.exception.Sportif.Coureur;
import compette.exception.Sportif.Judoka;
import compette.exception.Sportif.LanceureJavlo;
import compette.exception.Sportif.Sportif;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1990, 4, 12);
        LocalDate date2 = LocalDate.of(1995, 9, 15);
        LocalDate date3 = LocalDate.of(1998, 4, 22);
        LocalDate date4 = LocalDate.of(1998, 9, 23);
        LocalDate date5 = LocalDate.of(1999, 3, 29);


        Judoka ju1 = new Judoka ("Jhon" , "Wick" , date1);

        Judoka ju2 = new Judoka ("James" , "Merthy" , date2);

        Judoka ju3 = new Judoka ("William" , "Lownson" , date3);

        Judoka ju4 = new Judoka ("Harry" , "Potter" , date4);

        Judoka ju5 = new Judoka ("Tom" , "Jeduzor" , date5);

        Coureur coureur1 = new Coureur ("Jack" , "Sparrow" , date1 , 70);

        Coureur coureur2= new Coureur ("Willie" , "Woncka" , date2, 60);

        Coureur coureur3 = new Coureur ("Flash" , "Mc Queen" , date3 , 50);

        Coureur coureur4 = new Coureur ("Kid" , "FlashYellow" , date4 , 55);

        Coureur coureur5 = new Coureur ("Super" , "Man" , date5 , 80);

        LanceureJavlo lanceureJavlo1 = new LanceureJavlo ("Bruss banner" , "Hulk" , date1 , 15);

        LanceureJavlo lanceureJavlo2 = new LanceureJavlo ("Thanos" , "Destructeur" , date2 , 18);

        LanceureJavlo lanceureJavlo3 = new LanceureJavlo ("Maitre" , "Yoda" , date3 , 20);

        LanceureJavlo lanceureJavlo4 = new LanceureJavlo ("Spiderman" , "Peter" , date4 , 10);

        LanceureJavlo lanceureJavlo5 = new LanceureJavlo ("Jimmy" , "Neutron" , date5 , 5);



        Competition<Coureur> c1 = new Competition<>(3 ) ;

        c1.inscrire(coureur1);
        c1.inscrire(coureur4);
        c1.inscrire(coureur3);



        c1.lancer();




    }
}
