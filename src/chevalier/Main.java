package chevalier;

import chevalier.model.Cavalier;
import chevalier.model.Cheval;

public class Main {

    public static void main(String[] args) {

        Cheval petitponey = new Cheval("mpunda" , 60 , 70);

        petitponey.setNom("mpunda");

        petitponey.setVitesse_minimum(60);

        petitponey.setGetVitesse_maximum(70);

        Cheval.henirv();

        Cheval ch2 = new Cheval("mpundaada" , 40 , 80);

        Cavalier cavalier = new Cavalier("jule" , "César");

        cavalier.add_cheval(petitponey);

        System.out.println(cavalier.getChevaux().get(petitponey.getNom()).courir());



    }
}
