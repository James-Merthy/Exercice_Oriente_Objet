package course_de_voiture.model;

import course_de_voiture.model.enumération.Couleur_voiture;
import course_de_voiture.model.enumération.Model_véhicule;
import course_de_voiture.model.model.Circuit;
import course_de_voiture.model.model.Course;
import course_de_voiture.model.model.Pilote;
import course_de_voiture.model.model.Voiture;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circuit circuit1 = new Circuit(" Planette de vodka " , 2000);

        Voiture voiture1 = new Voiture(Model_véhicule.AUDI, Couleur_voiture.BLANCHE, 80, 200);

        Voiture voiture2 = new Voiture(Model_véhicule.BUGATTI, Couleur_voiture.NOIR, 50, 250);

        Voiture voiture3 = new Voiture(Model_véhicule.FERRARI, Couleur_voiture.ROUGE, 20, 300);


        List<Integer> liste_de_tour_pilote_1 = new ArrayList<>();

        List<Integer> liste_de_tour_pilote_2 = new ArrayList<>();

        List<Integer> liste_de_tour_pilote_3 = new ArrayList<>();

        Pilote pilote1 = new Pilote("James", voiture1, liste_de_tour_pilote_1);


        Pilote pilote2 = new Pilote("Merthy", voiture2, liste_de_tour_pilote_2);


        Pilote pilote3 = new Pilote("Japo", voiture3, liste_de_tour_pilote_3);

        List <Pilote> participant = new ArrayList<>();

        Course course1 = new Course(circuit1,participant);

        course1.add_pitlote(pilote1);

        course1.add_pitlote(pilote2);

        course1.add_pitlote(pilote3);

        course1.Classement();


        course1.faire_la_course(participant);




    }

}
