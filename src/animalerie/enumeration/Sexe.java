package animalerie.enumeration;

public enum Sexe {

    MALE , FEMALE ;

    public static Sexe convert(String sexe) {
        if (sexe.equals("m")) {
            return Sexe.MALE;
        }
        else {
            return Sexe.FEMALE;
        }
    }
}
