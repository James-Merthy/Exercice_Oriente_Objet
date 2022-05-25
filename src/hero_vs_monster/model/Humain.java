package hero_vs_monster.model;

import hero_vs_monster.type_personnage.Hero;

public class Humain extends Hero {

    public Humain(String nom) {
        super(nom);

        this.setEndurence(getEndurence()+1);
    }

    @Override
    public int getForce() {
        return super.getForce() + 1;
    }
}
