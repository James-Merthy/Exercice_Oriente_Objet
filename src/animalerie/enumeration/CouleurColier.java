package animalerie.enumeration;

public enum CouleurColier {

    ROUGE, VERT, JAUNE, ORANGE, BLEU, BRUN, NOIR, BLANC, VIOLET, ROSE;

    public static CouleurColier convert(String color) {

        switch (color) {


            case "rouge":


                return CouleurColier.ROUGE;

            case "vert":
                return CouleurColier.VERT;

            case "jaune":
                return CouleurColier.JAUNE;


            case "orange":
                return CouleurColier.ORANGE;


            case "bleu":
                return CouleurColier.BLEU;


            case "brun":
                return CouleurColier.BRUN;


            case "noir":
                return CouleurColier.NOIR;



            case "blanc":
                return CouleurColier.BLANC;



            case "violet":
                return CouleurColier.VIOLET;




            default:

                return CouleurColier.ROSE;


        }
    }
}
