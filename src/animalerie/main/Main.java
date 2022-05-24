package animalerie.main;

import animalerie.enumeration.*;
import animalerie.model.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2022, 4, 12);
        LocalDate date2 = LocalDate.of(2020, 9, 15);
        LocalDate date3 = LocalDate.of(2021, 4, 22);
        LocalDate date4 = LocalDate.of(2019, 9, 23);
        LocalDate date5 = LocalDate.of(2018, 3, 29);
        Chat chat1 = new Chat("chacha", 6, 28, 1, 18, Sexe.MALE, date1,
                true, false, CaractèreAnimal.CALIN);

        Chien chien1 = new Chien("rex", 15, 50, 3, 20, Sexe.FEMALE,
                date2, CouleurColier.ORANGE, false, RaceChien.BERGER_ALLEMAND);

        Oiseaux oiseaux1 = new Oiseaux("piou-piou", 2, 10, 2, 25
                , Sexe.MALE, date3, Couleuroiseaux.JAUNE_CANARI, false, true);

        Animale chat2 = new Chat("chatonn", 6, 28, 1, 18, Sexe.FEMALE, date4,
                true, false, CaractèreAnimal.CALIN);

        Animale chien2 = new Chien("whoophy", 50, 150, 5, 20, Sexe.MALE,
                date5, CouleurColier.ORANGE, false, RaceChien.DOBERMANN);


        Animale oiseaux2 = new Oiseaux("pioutte ", 2, 10, 2, 25
                , Sexe.MALE, date1, Couleuroiseaux.ROUGE, true, false);


        Animalerie animalerie = new Animalerie();


        //animalerie.addAnimau(chat1);

        animalerie.addAnimau(chat2);


        animalerie.addAnimau(chien1);


        animalerie.addAnimau(chien2);


        animalerie.addAnimau(oiseaux1);

        animalerie.addAnimau(oiseaux2);

        animalerie.display_nb_chat();

        animalerie.display_nb_chien();

        animalerie.display_nb_Oiseaux();

        animalerie.afficherList(animalerie.getNombre_d_animeau());

        //animalerie.on_passer_la_nuit();

        animalerie.display_caracteristique_animal(chat1);


    }


}
/*

        animalerie.addAnimau(chat2);


        animalerie.addAnimau(chien1);


        animalerie.addAnimau(chien2);


        animalerie.addAnimau(oiseaux1);

        animalerie.addAnimau(oiseaux2);

        animalerie.display_nb_chat();

        animalerie.display_nb_chien();

        animalerie.display_nb_Oiseaux();

        animalerie.afficherList(animalerie.getNombre_d_animeau());
 */
