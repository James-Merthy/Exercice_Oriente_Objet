package combat_de_créature.model.model;

import java.util.Random;

public class Master {

    private String nom;

    private Monstre monstre;

    private int coup_critique = 2;

    public Master(String nom, Monstre monstre) {
        this.nom = nom;
        this.monstre = monstre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Monstre getMonstre() {
        return monstre;
    }

    public void setMonstre(Monstre monstre) {
        this.monstre = monstre;
    }

    public int chance_coup_critique() {

        Random random = new Random();

        return random.nextInt(0, 100);
    }

    public void attaque(Monstre m1, Monstre m2) {

        Random random = new Random();

        int damage_monstre1 = random.nextInt(m1.getDamage(), 10);

        int pvm2 = m2.getHeal_point();

        int chanche_cc = chance_coup_critique();

        if(m2.getArmor() > 0){

            if (chanche_cc <= 5){

                System.out.println("coup critique!");


                damage_monstre1 = damage_monstre1 * coup_critique;

                System.out.println("damage : " + m2.getNom_du_monstre() + " - " + damage_monstre1 + " ! ");

                m2.subir_attaque_armor(damage_monstre1);

                damage_monstre1 = damage_monstre1 - m2.getArmor() ;

                m2.subir_attaque(damage_monstre1);




            }else {

                System.out.println("damage : " + m2.getNom_du_monstre() + " - " + damage_monstre1 + " ! ");

                m2.subir_attaque_armor(damage_monstre1);

                damage_monstre1 = damage_monstre1 - m2.getArmor() ;

                m2.subir_attaque(damage_monstre1);


            }


        }else{

            if (chanche_cc <= 5) {

                System.out.println("coup critique!");


                damage_monstre1 = damage_monstre1 * coup_critique;

                System.out.println("damage : " + m2.getNom_du_monstre() + " - " + damage_monstre1 + " ! ");

                m2.subir_attaque(damage_monstre1);

            } else {

                System.out.println("damage : " + m2.getNom_du_monstre() + " - " + damage_monstre1 + " ! ");

                m2.subir_attaque(damage_monstre1);


            }


        }





    }

    public int restoration() {

        Random random = new Random();

        return random.nextInt(0, 10);

    }

    public void restaurer_armor(Monstre monstre) {

        monstre.armor_restorer(restoration());
    }

    public boolean reduire_damage (Monstre monstre){

        boolean etat_reduction_armor = false ;

        return etat_reduction_armor ;


    }
}
