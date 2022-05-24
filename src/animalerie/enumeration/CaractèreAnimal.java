package animalerie.enumeration;

public enum CaractèreAnimal {

    ENERGIQUE , FAROUCHE , CALIN , AGRESSIF , DEPRESSIF ,FIDELE ;

    public static CaractèreAnimal convert (int n){

        switch (n){

            case 1 :

                return CaractèreAnimal.ENERGIQUE ;
            case 2 :

                return CaractèreAnimal.FAROUCHE ;
            case 3 :

                return CaractèreAnimal.CALIN ;
            case 4 :

                return CaractèreAnimal.AGRESSIF ;
            case 5 :

                return CaractèreAnimal.DEPRESSIF ;

            default:
                return CaractèreAnimal.FIDELE ;
        }


    }
}
