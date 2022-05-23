package course_de_voiture.model.model;

import java.util.List;

public class Pilote {

    private String nom_pilote;

    private Voiture voiture_pilote;

    private List<Integer> list_temp;

    public Pilote(String nom_pilote, Voiture voiture_pilote, List<Integer> list_temp) {
        this.nom_pilote = nom_pilote;
        this.voiture_pilote = voiture_pilote;
        this.list_temp = list_temp;
    }

    public Pilote(String nom_pilote, Voiture voiture_pilote) {


        this.nom_pilote = nom_pilote;
        this.voiture_pilote = voiture_pilote;

    }

    public int faire_un_tour() {


        return voiture_pilote.getdistance();
    }

    public void addTourListe(int tour) {

        this.list_temp.add(tour);
    }

    public List<Integer> getList_temp() {
        return list_temp;
    }

    public String getNom_pilote() {
        return nom_pilote;
    }

    public void setNom_pilote(String nom_pilote) {
        this.nom_pilote = nom_pilote;
    }

    public Voiture getVoiture_pilote() {
        return voiture_pilote;
    }

    public void setVoiture_pilote(Voiture voiture_pilote) {
        this.voiture_pilote = voiture_pilote;
    }

    public void setList_temp(List<Integer> list_temp) {
        this.list_temp = list_temp;
    }

    public void afficherList() {


        System.out.print(getNom_pilote() + " : ");


        int lastIdx = getList_temp().size() - 1;
        System.out.print(" | " + getList_temp().get(lastIdx) + " : km/h | ");




    }

    public int Tour_total() {

        int tour_total = 0;

        for (int i = 0; i < getList_temp().size(); i++) {

            tour_total = tour_total + getList_temp().get(i);
        }
        return tour_total;
    }

    @Override
    public String toString() {
        return "Pilote : " + this.nom_pilote;


    }


}
