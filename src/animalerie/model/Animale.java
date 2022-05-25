package animalerie.model;


import animalerie.enumeration.Sexe;

import java.time.LocalDate;

public abstract class Animale {

    private String nom ;

    private int poids ;

    private int taille ;

    private int age ;

    private int age_humain ;

    private Sexe sexe ;

    private LocalDate date_d_arriver ;

    public Animale(String nom, int poids, int taille, int age,
                   int age_humain, Sexe sexe, LocalDate date_d_arriver) {
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.age_humain = age_humain;
        this.sexe = sexe;
        this.date_d_arriver = date_d_arriver;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge_humain() {
        return age_humain;
    }

    public void setAge_humain(int age_humain) {
        this.age_humain = age_humain;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public LocalDate getDate_d_arriver() {
        return date_d_arriver;
    }

    public void setDate_d_arriver(LocalDate date_d_arriver) {
        this.date_d_arriver = date_d_arriver;
    }

    public void crier(){

        System.out.println("uuuu!");
    }
}
