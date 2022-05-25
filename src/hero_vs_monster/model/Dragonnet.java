package hero_vs_monster.model;

import hero_vs_monster.interfase.Cuivre;
import hero_vs_monster.interfase.Or;
import hero_vs_monster.type_personnage.Monstre;

import java.util.Random;

public class Dragonnet extends Monstre implements Cuivre , Or {

    private int or ;

    private int cuire ;

    public Dragonnet(String nom) {
        super(nom);
        this.setEndurence(this.getEndurence()+1);
    }

    public int getOr(){

        Random random = new Random();

        return or = random.nextInt(2, 8);

    }

    public int getCuivre() {

        Random random = new Random();

        return cuire = random.nextInt(2, 8);


    }
}
