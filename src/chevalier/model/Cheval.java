package chevalier.model;

import java.util.Random;

public class Cheval extends Monture {
    private Sexe sexe;
    public Cheval(String nom, int vitesseMin, int vitesseMax, Sexe sexe) {
        super(nom, vitesseMin, vitesseMax);
        this.sexe = sexe;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    @Override
    public void crier() {
        System.out.println("Brrrrr");
    }

    public int courir() {
        Random random = new Random();
        return random.nextInt(super.getVitesseMin(), vitesseMax);
    }

    @Override
    public String toString() {
        return "Bonjour";
    }
}

