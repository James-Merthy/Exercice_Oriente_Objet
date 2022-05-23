package course_de_voiture.model.model;

import java.util.List;

public class Circuit {

    private String nom_du_circuit ;

    private int distance  ;


    public Circuit(String nom_du_circuit, int distance) {
        this.nom_du_circuit = nom_du_circuit;
        this.distance = distance;
    }

    public String getNom_du_circuit() {
        return nom_du_circuit;
    }

    public void setNom_du_circuit(String nom_du_circuit) {
        this.nom_du_circuit = nom_du_circuit;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
