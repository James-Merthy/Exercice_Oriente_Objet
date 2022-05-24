package chevalier.model;

public class Dragon extends Monture {



    public Dragon(String nom, int vitesse_minimum, int getVitesse_maximum) {
        super(nom, vitesse_minimum, getVitesse_maximum );

    }

    @Override
    public void crier() {
        System.out.println("Graoou");
    }

    public void voler() {
        System.out.println("Le dragon s'envole");
    }


}
