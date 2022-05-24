package animalerie.model;

import animalerie.enumeration.CaractèreAnimal;
import animalerie.enumeration.Sexe;

import java.time.LocalDate;
import java.util.Random;

public class Chat extends Animale{

   private boolean griffes_coupées ;

   private boolean chat_poil_long ;

   private CaractèreAnimal caractèreAnimal;

   private boolean dead = false ;

   private int probabilite_de_mourir  ;



    public Chat(String nom, int poids, int taille, int age,
                int age_humain, Sexe sexe, LocalDate date_d_arriver,
                boolean griffes_coupées, boolean chat_poil_long,
                CaractèreAnimal caractèreAnimal) {
        super(nom, poids, taille, age, age_humain, sexe, date_d_arriver);
        this.griffes_coupées = griffes_coupées;
        this.chat_poil_long = chat_poil_long;
        this.caractèreAnimal = caractèreAnimal;
    }



    public boolean isGriffes_coupées() {
        return griffes_coupées;
    }

    public void setGriffes_coupées(boolean griffes_coupées) {
        this.griffes_coupées = griffes_coupées;
    }

    public boolean isChat_poil_long() {
        return chat_poil_long;
    }

    public void setChat_poil_long(boolean chat_poil_long) {
        this.chat_poil_long = chat_poil_long;
    }

    public CaractèreAnimal getCaractèreAnimal() {
        return caractèreAnimal;
    }

    public void setCaractèreAnimal(CaractèreAnimal caractèreAnimal) {
        this.caractèreAnimal = caractèreAnimal;
    }


    public boolean isDead() {

        if (getProbabilite_de_mourir() <= 5){

            dead = true ;
        }
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getProbabilite_de_mourir() {
        Random random = new Random( );

        probabilite_de_mourir = random.nextInt(0,100) ;


        return probabilite_de_mourir;
    }

    public void setProbabilite_de_mourir(int probabilite_de_mourir) {
        this.probabilite_de_mourir = probabilite_de_mourir;
    }


}
