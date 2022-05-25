package hero_vs_monster.main;

import hero_vs_monster.model.Dragonnet;
import hero_vs_monster.model.Humain;
import hero_vs_monster.model.Loup;
import hero_vs_monster.model.Orque;
import hero_vs_monster.personnage.Personnage;
import hero_vs_monster.type_personnage.Hero;
import hero_vs_monster.type_personnage.Monstre;

public class Main {

    public static void main(String[] args) {

        Humain homme = new Humain("Hector");

        Loup loup = new Loup("milimilou");

        Dragonnet dra = new Dragonnet("drake bb");

        Orque orque = new Orque("orki");

        homme.hero_tue_monstre(orque);

        homme.hero_tue_monstre(dra);

        homme.hero_tue_monstre(loup);

    }
}
