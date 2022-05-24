package animalerie.enumeration;

public enum RaceChien {

    AMERICAIN_STAFF, AKITA_INU, BARBET, BERGER_ALLEMAND, BICHON, LABRADORE, BILLY, DOBERMANN;

    public static RaceChien convert(int n) {




        switch (n) {


            case 1:
                return RaceChien.AMERICAIN_STAFF;
            case 2:
                return RaceChien.AKITA_INU;

            case 3:
                return RaceChien.BERGER_ALLEMAND;
            case 4:
                return RaceChien.BARBET;
            case 5:
                return RaceChien.BICHON;
            case 6:
                return RaceChien.LABRADORE;
            case 7:
                return RaceChien.BILLY;
            default:
                return RaceChien.DOBERMANN;


        }


    }
}
