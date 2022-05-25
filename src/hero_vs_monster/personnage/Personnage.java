package hero_vs_monster.personnage;

import java.util.*;

public abstract class Personnage {

    private String nom;

    private int endurence;

    private int force;

    private int point_de_vie;

    private int valeur_random;

    private boolean dead = false;


    public Personnage(String nom) {

        this.nom = nom;
        this.endurence = getEndurence();

        this.force = getForce();

        this.point_de_vie = endurence + modificateur(endurence);

    }


    public int getEndurence() {
        int val1 = getValeur_random();

        int val2 = getValeur_random();

        int val3 = getValeur_random();

        int val4 = getValeur_random();

        List<Integer> listval = new ArrayList<>();

        listval.add(val1);

        listval.add(val2);

        listval.add(val3);

        listval.add(val4);

        // afficherList(listval);

        //  System.out.println();


        Collections.sort(listval);


        //  afficherList(listval);

        //   System.out.println();

        listval.remove(0);

        // afficherList(listval);

        // System.out.println();

        int som = 0;

        for (int val : listval
        ) {

            som = som + val;

        }

        endurence = som;
        return endurence;
    }

    public void setEndurence(int endurence) {
        this.endurence = endurence;
    }

    public int getForce() {

        int val1 = getValeur_random();

        int val2 = getValeur_random();

        int val3 = getValeur_random();

        int val4 = getValeur_random();

        List<Integer> listval = new ArrayList<>();

        listval.add(val1);

        listval.add(val2);

        listval.add(val3);

        listval.add(val4);

        // afficherList(listval);

        //  System.out.println();


        Collections.sort(listval);


        //  afficherList(listval);

        //   System.out.println();

        listval.remove(0);

        // afficherList(listval);

        // System.out.println();

        int som = 0;

        for (int val : listval
        ) {

            som = som + val;

        }

        force = som;


        return force;
    }

    public void afficherList(List<Integer> l) {

        for (int val : l
        ) {

            System.out.print(" | " + val);

        }

    }


    public void setForce(int force) {
        this.force = force;
    }

    public int modificateur(int carac) {

        if (carac <= 5) {

            return -1;
        } else if (carac < 10) {

            return 0;

        } else if (carac < 15) {

            return 1;

        } else {


            return 2;
        }
    }

    public int getPoint_de_vie() {


        return point_de_vie;


    }

    public void setPoint_de_vie(int point_de_vie) {
        this.point_de_vie = point_de_vie;
    }

    public int getValeur_random() {

        Random random = new Random();

        valeur_random = random.nextInt(1, 6);
        return valeur_random;
    }

    public int getValeur_randomdmg() {

        Random random = new Random();

        valeur_random = random.nextInt(1, 4);
        return valeur_random;
    }

    public void setValeur_random(int valeur_random) {
        this.valeur_random = valeur_random;
    }

    public void displayCarac() {

        System.out.println("======== " + getNom() + " ========");


        System.out.println("Force : " + force);
        System.out.println("Endurence : " + endurence);
        System.out.println("Pv : " + point_de_vie);

        System.out.println("======== " + getNom() + " ========");


    }

    public int damage() {


        int damage = getValeur_randomdmg();


        return damage + modificateur(force);
    }

    public void attack(Personnage p1, Personnage p2) {


        int dmg = p1.damage();

        System.out.println("_________________");
        System.out.println(p1.getNom() + " frappe ---> " + p2.getNom());
        System.out.println(p2.getNom() + " pv : " + p2.getPoint_de_vie() + " - " + dmg);
        System.out.println("_________________");


        p2.point_de_vie = p2.point_de_vie - dmg;


    }

    public void regen (){
        int regen = point_de_vie ;
        point_de_vie = point_de_vie ;
    }

    public void duel(Personnage p1, Personnage p2) {

        boolean vainqueur = false;



        while (vainqueur == false) {

            if (p1.getPoint_de_vie() > 0) {

                p1.attack(p1, p2);

            } else {

                p1.dead = true;

                p1.isDead();

                System.out.println(p2.getNom() + " a tuer : " + p1.getNom());

                vainqueur = true;


            }

            if (!vainqueur ) {

                if (p2.getPoint_de_vie() > 0) {

                    p2.attack(p2, p1);
                } else {

                    p1.isDead();

                    p2.dead = true;

                    System.out.println(p1.getNom() + " a tuer : " + p2.getNom());


                    vainqueur = true;

                }
            }

        }


    }

    public Personnage estVainquer(Personnage p1, Personnage p2) {

        p1.duel(p1, p2);

        if (p1.getPoint_de_vie() > 0) {

            return p1;

        } else {

            return p2;
        }


    }

    public boolean isDead() {

        if (point_de_vie <= 0) {

            // System.out.println(getNom() + " est mort");

            return dead = true;
        } else {
            return dead;

        }

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public static void main(String[] args) {


    }
}
/*
ersonnage p = new Personnage("perso1");

        Personnage p2 = new Personnage("perso2");


        p.duel(p, p2);
 */