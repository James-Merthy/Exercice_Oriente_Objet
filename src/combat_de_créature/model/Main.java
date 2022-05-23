package combat_de_créature.model;

import combat_de_créature.model.model.Master;
import combat_de_créature.model.model.Monstre;

public class Main {

    public static void main(String[] args) {

        Monstre m1 = new Monstre("bulbizar",5,2,20);

        Monstre m2 = new Monstre("dragon",5,3,25);

        Master master1 = new Master("James" , m1);

        Master master2 = new Master("Merthy" , m2);

        System.out.println(m2.getHeal_point());

        master1.attaque(m1,m2);

        System.out.println(m2.getHeal_point());



    }
}
