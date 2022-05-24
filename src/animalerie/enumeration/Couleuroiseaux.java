package animalerie.enumeration;

public enum Couleuroiseaux {

    BLEU, JAUNE_CANARI, BRUN, BLANC, NOIR, VIOLET, ROUGE, VERT;

    public static Couleuroiseaux convert(String color) {

        switch (color) {


            case "rouge":


                return Couleuroiseaux.ROUGE;

            case "vert":
                return Couleuroiseaux.VERT;

            case "jaune":
                return Couleuroiseaux.JAUNE_CANARI;


            case "bleu":
                return Couleuroiseaux.BLEU;


            case "brun":
                return Couleuroiseaux.BRUN;


            case "noir":
                return Couleuroiseaux.NOIR;


            case "blanc":
                return Couleuroiseaux.BLANC;


            default:
                return Couleuroiseaux.VIOLET;


        }
    }

}
