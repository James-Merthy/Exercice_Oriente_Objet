package course_de_voiture.model.model;

import java.util.List;

public class Course {

    private int nombre_tour = 1;

    private Circuit circuit;

    private List<Pilote> list_pilote;

    public Course(Circuit circuit, List<Pilote> list_pilote) {

        this.circuit = circuit;
        this.list_pilote = list_pilote;
    }

    public Course(List<Pilote> list_pilote) {
        this.list_pilote = list_pilote;
    }

    public Course() {
    }

    public int getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(int nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public List<Pilote> getList_pilote() {
        return list_pilote;
    }

    public void setList_pilote(List<Pilote> list_pilote) {
        this.list_pilote = list_pilote;
    }

    public void add_pitlote(Pilote p) {

        getList_pilote().add(p);

    }

    public void Classement() {

        int i = 1;

        for (Pilote p : getList_pilote()) {

            System.out.println(i + "| " + p.toString() + " : " + p.getVoiture_pilote().getModelVoiture()
                    + " " + p.getVoiture_pilote().getCouleur_vehicule());

            System.out.println("===========");

            i++;
        }

    }


    public void faire_la_course(List<Pilote> pilotes) {

        boolean vainqueur = false;



        while (vainqueur == false) {


            System.out.println("___________________________");

            for (int i = 0; i < pilotes.size(); i++) {

                int tour = 0;

                System.out.println("___________________________");


                tour = pilotes.get(i).faire_un_tour();

                pilotes.get(i).addTourListe(tour);

                System.out.print("Tour : " + nombre_tour + " | ");

                pilotes.get(i).afficherList();

                System.out.println("Total : " + pilotes.get(i).Tour_total());

                System.out.println("___________________________");

                if (pilotes.get(i).Tour_total() > this.circuit.getDistance()) {

                    System.out.println("*************************");

                    System.out.println("Le vainqueur est : " + pilotes.get(i) + " | " + pilotes.get(i).getVoiture_pilote().getModelVoiture() + " " + pilotes.get(i).getVoiture_pilote().getCouleur_vehicule());


                    System.out.println("___________________________");

                    pilotes.get(i).afficherList();

                    System.out.println();

                    System.out.println("___________________________");

                    System.out.println("Total : " + pilotes.get(i).Tour_total());

                    System.out.println("___________________________");


                    System.out.println("*************************");

                    vainqueur = true;

                    break;


                }


            }

            nombre_tour ++ ;


            System.out.println("___________________________");

        }


    }


}
