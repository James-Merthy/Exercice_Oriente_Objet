package hero_vs_monster.model;

import hero_vs_monster.interfase.Cuivre;
import hero_vs_monster.type_personnage.Monstre;

import java.util.Random;

public class Loup extends Monstre implements Cuivre {

    int cuire;

    public Loup(String nom) {
        super(nom);

    }

    public int getCuivre() {

        Random random = new Random();

        return cuire = random.nextInt(2, 8);


    }
}
