package combat_de_créature.model.model;

import java.util.Random;

public class Monstre {

    private String nom_du_monstre ;

    private int damage ;

    private int armor ;

    private int vitesse ;

    private int heal_point ;

    private int point_de_statistiqueMax = 42 ;

    public Monstre(String nom_du_monstre) {

        this.nom_du_monstre = nom_du_monstre;

    }

    public Monstre(String nom_du_monstre, int damage, int armor, int heal_point) {
        if(damage+armor+heal_point > point_de_statistiqueMax){
            System.out.println("monstre pas valide !");
            throw new IllegalArgumentException();
        }

        this.nom_du_monstre = nom_du_monstre;
        this.damage = damage;
        this.armor = armor;

        this.heal_point = heal_point;
    }

    public String getNom_du_monstre() {
        return nom_du_monstre;
    }

    public void setNom_du_monstre(String nom_du_monstre) {
        this.nom_du_monstre = nom_du_monstre;
    }

    public int getDamage() {



        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {



        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getVitesse() {
        Random random = new Random( );

        vitesse = random.nextInt(1 ,10) ;
        return vitesse;
    }

    public void setVitesse(int vitesse) {

        this.vitesse = vitesse;
    }

    public int getHeal_point() {

        return heal_point;
    }

    public void setHeal_point(int heal_point) {
        this.heal_point = heal_point;
    }

    public void subir_attaque(int attack){

       heal_point = getHeal_point() - attack ;
    }

    public void subir_attaque_armor(int attack){

        armor = getArmor() - attack ;
    }

    public void armor_restorer (int restoration){

        armor = armor + restoration ;

    }

    public void subir_moiter_attaque (int attack){

        heal_point = getHeal_point() - (attack/2) ;
    }

    public void bonus_esquive (String esquiver){

        if (esquiver.equals("esquiver")){

            vitesse = vitesse + 50 ;
        }else {

            System.out.println("esquive mal ecrite , action annuler ");
        }
    }


}
