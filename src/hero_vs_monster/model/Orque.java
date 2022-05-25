package hero_vs_monster.model;

import hero_vs_monster.interfase.Or;
import hero_vs_monster.type_personnage.Monstre;

import java.util.Random;

public class Orque extends Monstre implements Or {

    private int or ;

    public Orque(String nom) {

        super(nom);

        this.setForce(this.getForce()+1);


    }

    public int getOr(){

        Random random = new Random();

        return or = random.nextInt(2, 8);

    }
}
