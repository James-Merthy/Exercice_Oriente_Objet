package animalerie.model;

import animalerie.enumeration.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class  Animalerie {


    private List<Animale> nombre_d_animeau = new ArrayList<>();


    public Animalerie() {


    }


    public void afficherList(List<Animale> animales) {

        if (animales.size() == 0) {

            System.out.println("il n y a pas d'annimeau dans l'animalerie !");


        } else {

            System.out.println("=============================");
            System.out.println("========Liste Animeau========");
            System.out.println("=============================");

            for (Animale animale : nombre_d_animeau
            ) {


                System.out.println("| " + " : " + animale.getNom() + " : " + animale.getClass().getName().substring(17));


            }

            System.out.println("");

            System.out.println("=============================");

            System.out.println("_____________________________");

        }


    }

    public int compterChat() {

        int nombreChat = 0;

        for (Animale animale : nombre_d_animeau
        ) {

            if (animale instanceof Chat) {

                nombreChat++;
            }

        }

        return nombreChat;
    }

    public int compterChien() {

        int nombreChien = 0;

        for (Animale animale : nombre_d_animeau
        ) {

            if (animale instanceof Chien) {

                nombreChien++;
            }

        }

        return nombreChien;
    }

    public int compterOiseaux() {

        int nombreOiseaux = 0;

        for (Animale animale : nombre_d_animeau
        ) {

            if (animale instanceof Oiseaux) {

                nombreOiseaux++;
            }

        }

        return nombreOiseaux;
    }

    public void display_nb_chat() {

        System.out.println("Nombre de chat : " + compterChat());
    }

    public void display_nb_chien() {

        System.out.println("Nombre de chien : " + compterChien());
    }

    public void display_nb_Oiseaux() {

        System.out.println("Nombre d'oiseau : " + compterOiseaux());
    }

    public void addAnimau(Animale a) {


        getNombre_d_animeau().add(a);
    }

    public List<Animale> getNombre_d_animeau() {
        return nombre_d_animeau;
    }

    public void setNombre_d_animeau(List<Animale> nombre_d_animeau) {
        this.nombre_d_animeau = nombre_d_animeau;
    }

    public void a_passer_la_nuit(Animale a) {


        if (a instanceof Chien == true) {

            boolean estMort = ((Chien) a).isDead();

            if (estMort == true) {

                System.out.println("Le chien : " + a.getNom() + " est mort :/");
                nombre_d_animeau.remove(a);


            } else {
                System.out.println("Le chien : " + a.getNom() + " est vivant :)");

            }

        }
        if (a instanceof Chat == true) {

            boolean estMort = ((Chat) a).isDead();

            if (estMort == true) {

                System.out.println("Le chat : " + a.getNom() + " est mort :/");
                nombre_d_animeau.remove(a);
            } else {
                System.out.println("Le chat : " + a.getNom() + " est vivant :)");

            }

        }
        if (a instanceof Oiseaux == true) {

            boolean estMort = ((Oiseaux) a).isDead();

            if (estMort == true) {

                System.out.println("L'oiseaux : " + a.getNom() + " est mort :/");

                nombre_d_animeau.remove(a);
            } else {
                System.out.println("L'oiseaux : " + a.getNom() + " est vivant :)");

            }

        }

    }

    public void on_passer_la_nuit() {


        System.out.println("=============================");
        System.out.println("========Etat des animeaux====");
        System.out.println("=============================");

        for (Animale a : nombre_d_animeau
        ) {

            a_passer_la_nuit(a);

        }
        System.out.println("_____________________________");

    }

    public void display_caracteristique_animal(Animale a) {

        if (a instanceof Oiseaux == true) {

            System.out.println("============================");
            System.out.println("======Caracteristique=======");
            System.out.println("----------------------------");
            System.out.println("Type d'animal : Oiseaux ");
            System.out.println("____________________________");
            System.out.println("Nom           :" + a.getNom());
            System.out.println("____________________________");
            System.out.println("Age           :" + a.getAge());
            System.out.println("____________________________");
            System.out.println("Couleur       :" + ((Oiseaux) a).getCouleuroiseaux());
            System.out.println("____________________________");
            System.out.println("Vie en cage ? :" + ((Oiseaux) a).isVie_dans_une_cage());
            System.out.println("____________________________");
            System.out.println("Age de humain :" + ((Oiseaux) a).getAge_humain());
            System.out.println("____________________________");
            System.out.println("Vie Volierre? :" + ((Oiseaux) a).isVieVolierre());
            System.out.println("____________________________");
            System.out.println("Sex           :" + ((Oiseaux) a).getSexe());
            System.out.println("____________________________");
            System.out.println("Poid          :" + ((Oiseaux) a).getPoids());
            System.out.println("____________________________");
            System.out.println("Taille        :" + ((Oiseaux) a).getTaille());
            System.out.println("____________________________");
            System.out.println("Date d'arrive :" + ((Oiseaux) a).getDate_d_arriver());
            System.out.println("----------------------------");
            System.out.println("============================");


        }

        if (a instanceof Chat == true) {

            System.out.println("============================");
            System.out.println("======Caracteristique=======");
            System.out.println("----------------------------");
            System.out.println("Type d'animal : Chat ");
            System.out.println("____________________________");
            System.out.println("Nom           :" + a.getNom());
            System.out.println("____________________________");
            System.out.println("Age           :" + a.getAge());
            System.out.println("____________________________");
            System.out.println("Caractere     :" + ((Chat) a).getCaractèreAnimal());
            System.out.println("____________________________");
            System.out.println("Long poile ?  :" + ((Chat) a).isChat_poil_long());
            System.out.println("____________________________");
            System.out.println("Age de humain :" + ((Chat) a).getAge_humain());
            System.out.println("____________________________");
            System.out.println("Griffe couper?:" + ((Chat) a).isGriffes_coupées());
            System.out.println("____________________________");
            System.out.println("Sex           :" + ((Chat) a).getSexe());
            System.out.println("____________________________");
            System.out.println("Poid          :" + ((Chat) a).getPoids());
            System.out.println("____________________________");
            System.out.println("Taille        :" + ((Chat) a).getTaille());
            System.out.println("____________________________");
            System.out.println("Date d'arrive :" + ((Chat) a).getDate_d_arriver());
            System.out.println("----------------------------");
            System.out.println("============================");


        }

        if (a instanceof Chien == true) {

            System.out.println("============================");
            System.out.println("======Caracteristique=======");
            System.out.println("----------------------------");
            System.out.println("Type d'animal : Chient ");
            System.out.println("____________________________");
            System.out.println("Nom           :" + a.getNom());
            System.out.println("____________________________");
            System.out.println("Age           :" + a.getAge());
            System.out.println("____________________________");
            System.out.println("Race          :" + ((Chien) a).getRaceChien());
            System.out.println("____________________________");
            System.out.println("Couleur colier:" + ((Chien) a).getCouleurcolier());
            System.out.println("____________________________");
            System.out.println("Age de humain :" + ((Chien) a).getAge_humain());

            System.out.println("____________________________");
            System.out.println("Sex           :" + ((Chien) a).getSexe());
            System.out.println("____________________________");
            System.out.println("Poid          :" + ((Chien) a).getPoids());
            System.out.println("____________________________");
            System.out.println("Taille        :" + ((Chien) a).getTaille());
            System.out.println("____________________________");
            System.out.println("Date d'arrive :" + ((Chien) a).getDate_d_arriver());
            System.out.println("----------------------------");
            System.out.println("============================");


        }
    }

    public void encoderAnimal() {

        System.out.println("=========================");
        System.out.println("========Encodage=========");
        System.out.println("=========================");

        Scanner scanner = new Scanner(System.in);

        Animale animale;

        System.out.print("Choissisez les types ==> chat/chien/oiseau: ");

        String Animale = scanner.next();


        System.out.println("------------------");


        System.out.print("Choissisez un nom: ");

        String nom = scanner.next();

        System.out.println("------------------");


        System.out.print("age: ");

        int age = scanner.nextInt();

        System.out.println("------------------");

        System.out.print("age humain: ");

        int agehumain = scanner.nextInt();

        System.out.println("------------------");

        System.out.print("sex: ");

        String choixsex = scanner.next();

        Sexe sexe = Sexe.convert(choixsex);

        System.out.println("------------------");

        System.out.print("poid: ");

        int poid = scanner.nextInt();

        System.out.println("------------------");

        System.out.print("taille: ");

        int taille = scanner.nextInt();

        System.out.println("------------------");

        System.out.println("date d'arriver: ");

        System.out.print("entrée l'annee : ");

        int anne = scanner.nextInt();

        System.out.print("entrée le mois en chiffre : ");

        int mois = scanner.nextInt();

        System.out.print("entrée le jour en chiffre : ");

        int jour = scanner.nextInt();

        LocalDate date = LocalDate.of(anne, mois, jour);

        System.out.println("------------------");

        switch (Animale) {

            case "chien":

                System.out.println("---------couleur colier-----------");
                System.out.println(" : rouge");
                System.out.println(" : vert");
                System.out.println(" : jaune");
                System.out.println(" : bleu");
                System.out.println(" : brun");
                System.out.println(" : noir");
                System.out.println(" : blanc");
                System.out.println(" : violet");
                System.out.println("other string : rose");
                System.out.println("----------------------------------");

                System.out.print("Couleur colier : ");

                String choixcolor = scanner.next();

                CouleurColier color = CouleurColier.convert(choixcolor);

                System.out.println("------------------");

                System.out.println("----------RACE--------------");
                System.out.println("1 : American_staff");
                System.out.println("2 : Akita");
                System.out.println("3 : Berger allemand");
                System.out.println("4 : Barret");
                System.out.println("5 : Bichon");
                System.out.println("6 : Labradore");
                System.out.println("7 : Billy");
                System.out.println("other number : American_staff");
                System.out.println("------------------------------");

                System.out.print("Race : ");

                int race = scanner.nextInt();

                RaceChien racechien = RaceChien.convert(race);

                System.out.println("------------------");

                System.out.print("est dresser ? y/n : ");

                String choixdressage = scanner.next();

                boolean estdresser;

                if (choixdressage.equals("y")) {
                    estdresser = true;
                } else {

                    estdresser = false;
                }

                System.out.println("------------------");

                animale = new Chien(nom, poid, taille, age, agehumain, sexe, date, color, estdresser, racechien);

                nombre_d_animeau.add(animale);

                System.out.println(" animale a ete ajouter a l'animalerie : ");

                System.out.println("-----------------------------------------");

                display_caracteristique_animal(animale);

                break;


            case "chat":


                System.out.println("---------Caractère-----------");
                System.out.println("1 : Energique");
                System.out.println("2 : Farouche");
                System.out.println("3 : Calin");
                System.out.println("4 : Agressif");
                System.out.println("5 : Depressif");
                System.out.println("other number : Fidel");
                System.out.println("-----------------------------");


                System.out.print("Caractère : ");

                int c = scanner.nextInt();

                CaractèreAnimal carac = CaractèreAnimal.convert(c);

                System.out.println("------------------");

                System.out.print("poil_long ? y/n : ");

                String choixpoile = scanner.next();

                boolean veutpoilelong;

                if (choixpoile.equals("y")) {
                    veutpoilelong = true;
                } else {

                    veutpoilelong = false;
                }

                System.out.println("------------------");

                System.out.print("griffecoupe ? y/n : ");

                String choixgriffe = scanner.next();

                boolean veutgriffecoupe;

                if (choixgriffe.equals("y")) {
                    veutgriffecoupe = true;
                } else {

                    veutgriffecoupe = false;
                }

                System.out.println("------------------");

                animale = new Chat(nom, poid, taille, age, agehumain, sexe, date,
                        veutgriffecoupe, veutpoilelong, carac);

                nombre_d_animeau.add(animale);

                System.out.println(" animale a ete ajouter a l'animalerie : ");

                System.out.println("-----------------------------------------");

                display_caracteristique_animal(animale);

                break;


            case "oiseau":

                System.out.println("---------couleur oiseau-----------");
                System.out.println(" : rouge");
                System.out.println(" : vert");
                System.out.println(" : jaune");
                System.out.println(" : bleu");
                System.out.println(" : brun");
                System.out.println(" : noir");
                System.out.println(" : blanc");
                System.out.println("other string : violet");
                System.out.println("----------------------------------");

                System.out.print("Couleur oiseau : ");

                String choixcouleuroiseau = scanner.next();

                Couleuroiseaux col = Couleuroiseaux.convert(choixcouleuroiseau);

                System.out.println("------------------");

                System.out.print("vie volière ? y/n : ");

                String choixvievo = scanner.next();

                boolean veutvievo;

                if (choixvievo.equals("y")) {
                    veutvievo = true;
                } else {

                    veutvievo = false;
                }

                System.out.println("------------------");

                System.out.print("vie volière ? y/n : ");

                String choixcage = scanner.next();

                boolean veutcage;

                if (choixvievo.equals("y")) {
                    veutcage = true;
                } else {

                    veutcage = false;
                }

                System.out.println("------------------");

                animale = new Oiseaux(nom, poid, taille, age, agehumain, sexe, date, col, veutvievo, veutcage);

                nombre_d_animeau.add(animale);

                System.out.println(" animale a ete ajouter a l'animalerie : ");

                System.out.println("-----------------------------------------");

                display_caracteristique_animal(animale);

                break;

            default:

                System.out.println("animal pas valide");
                break;
        }


        // Chien chien = new Chien();


    }

    public void askAction() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("--------------------");

        System.out.println("Bonjour utilisateur ");

        System.out.println("--------------------");

        System.out.println("Que voulez vous faire ? ");

        System.out.println("--------------------");

        System.out.println("encoder --> (e) / lister les caractèristique des animeau --> (l)");

        System.out.println("vérifier les annimaux qui on passer la nuit  --> (v) ou quitter (other letter) ");

        String choix = scanner.next();

        switch (choix) {

            case "e":

                encoderAnimal();

                break;

            case "l":


                System.out.println("");

                afficherList(nombre_d_animeau);

                System.out.println("choissisez la possition de l'animale  ");

                int pos = scanner.nextInt();


                display_caracteristique_animal(nombre_d_animeau.get(pos));

                break;

            case "v":

                on_passer_la_nuit();

                break;


            default:
                System.out.println("Au revoir ! ");
                break;


        }

    }


}


