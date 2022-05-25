package hero_vs_monster.model;

import hero_vs_monster.type_personnage.Hero;

public class Nain extends Hero {


    public Nain(String nom) {
        super(nom);


        this.setEndurence(this.getEndurence()+2);


    }
}
