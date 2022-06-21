package compette;

import compette.exception.EtatCompetitionException;
import compette.exception.LimitePlaceException;
import compette.exception.Sportif.Coureur;
import compette.exception.Sportif.Judoka;
import compette.exception.Sportif.LanceureJavlo;
import compette.exception.Sportif.Sportif;

import java.util.*;
import java.util.stream.Collectors;

public class Competition <T extends Sportif>  {

    private  final int limiteDeparticipant ;

    private final Map<T , Integer> participent = new HashMap<>() ;

    private boolean terminée ;

    private List<T> classement ;

    private  T sportif ;

    public Competition() {

        limiteDeparticipant = 0 ;

    }


    public Competition(int limiteDeparticipant ) {

        if (limiteDeparticipant < 0)

            throw new IllegalArgumentException("la limite de ");

        this.limiteDeparticipant = limiteDeparticipant;


    }

    public T getSportif() {
        return sportif;
    }

    public void setSportif(T sportif) {
        this.sportif = sportif;
    }

    public void lancer(){


        // n'est pas terminé
        if( estTerminer()  )
            throw new EtatCompetitionException(estTerminer(), false);

        // Pas de participants
        if( participent.size() < 3 )
            throw new IllegalStateException("La compet n'a pas assez de participants");

        participent.put(sportif, (sportif).performer());

        classement = genererClassement();


    }

    public void inscrire(T sportiff){

        // n'est pas terminé
        if (estTerminer())
           throw new EtatCompetitionException(terminée , false) ;
        // il y a de la place ?
        if (limiteDeparticipant != 0 && participent.size() >= limiteDeparticipant)
            throw new LimitePlaceException(limiteDeparticipant) ;
        // doit etre non inscrit
        if (participent.containsKey(sportif))
            throw new IllegalArgumentException("sportif déjà inscrit");
        // doit être du même type

        participent.put(sportiff , null);

    }

    public void désinscrire(T sportiff){
        //déjà términer

        if(terminée)
            throw new EtatCompetitionException(terminée , false) ;

        //n'éxiste pas
        if (!participent.containsKey(sportif))
            throw new IllegalArgumentException("sportif non inscrit");

        participent.remove(sportiff);

    }

    public Set<T> estGagnants(){

        if(!terminée)

            throw new EtatCompetitionException(terminée , true);

            int maxPerf = participent.values().stream().mapToInt(i -> i).max().getAsInt() ;


        Set<T> gagnants = participent.entrySet().stream().filter(e -> e.getValue() == maxPerf)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        /*

        Collection<Integer> values = participants.values();
        int maxPerf = 0;
        for (Integer value : values) {
            if( value > maxPerf )
                maxPerf = value;
        }

        Set<Sportif> gagnants = new HashSet<>();
        for (Map.Entry<Sportif, Integer> entry : participants.entrySet()) {
            if( entry.getValue() == maxPerf )
                gagnants.add(entry.getKey() );
        }

         */


        return gagnants ;
    }

    public boolean estTerminer (){

        return classement != null;
    }

    public int getLimiteDeparticipant() {
        return limiteDeparticipant;
    }

    private List<T> genererClassement (){

        List<T> classement = new ArrayList<>();

        for (T sportif : participent.keySet()) {

            boolean place = false;
            for (int i = 0; i < classement.size() && ! place ; i++) {

                Sportif currentSportif = classement.get(i);
                int currentPerf = participent.get(currentSportif);

                int perfSportAPlacer = participent.get(sportif);

                if( perfSportAPlacer > currentPerf ){
                    classement.add(i, sportif);
                    place = true;
                }
            }

            if( !place )
                classement.add(sportif);

        }

        return classement;
    }

    public List<T> getClassement() {
        return new ArrayList<>(classement) ;
    }
}

/*
    public boolean equals(Object obj){


    }

    private List <Sportif> liste_de_sportif = new ArrayList<>() ;

    private List <Integer>  tableau_des_scores = new ArrayList<>();

 */
