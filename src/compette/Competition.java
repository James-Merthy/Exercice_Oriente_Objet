package compette;

import compette.exception.EtatCompetitionException;
import compette.exception.LimitePlaceException;

import java.util.*;
import java.util.stream.Collectors;

public class Competition {

    private  final int limiteDeparticipant ;

    private final Map<Sportif , Integer> participent = new HashMap<>() ;

    private boolean terminée ;

    private List<Sportif> classement ;

    public Competition() {

        limiteDeparticipant = 0 ;


    }

    public Competition(int limiteDeparticipant) {

        if (limiteDeparticipant < 0)

            throw new IllegalArgumentException("la limite de ");

        this.limiteDeparticipant = limiteDeparticipant;
    }

    public void lancer(){

        if (terminée)
            throw new EtatCompetitionException(terminée , false);

        if (participent.size() <= 3)

            throw new IllegalStateException("La compet n'a pas assez de participants");



        for (Sportif sportif:participent.keySet()
             ) {

            participent.put(sportif, sportif.performer());

        }

        // participent.replaceAll((s, v) -> s.performer());

        terminée = true ;

    }

    public void inscrire(Sportif sportif){

        // n'est pas terminé
        if (estTerminer())
           throw new EtatCompetitionException(terminée , false) ;
        // il y a de la place ?
        if (limiteDeparticipant != 0 && participent.size() >= limiteDeparticipant)
            throw new LimitePlaceException(limiteDeparticipant) ;
        // doit etre non inscrit
        if (participent.containsKey(sportif))
            throw new IllegalArgumentException("sportif déjà inscrit");

        participent.put(sportif , null);

    }

    public void désinscrire(Sportif sportif){
        //déjà términer

        if(terminée)
            throw new EtatCompetitionException(terminée , false) ;

        //n'éxiste pas
        if (!participent.containsKey(sportif))
            throw new IllegalArgumentException("sportif non inscrit");


        participent.remove(sportif);

    }

    public Set<Sportif> estGagnants(){

        if(!terminée)

            throw new EtatCompetitionException(terminée , true);



            int maxPerf = participent.values().stream().mapToInt(i -> i).max().getAsInt() ;


        Set<Sportif> gagnants = participent.entrySet().stream().filter(e -> e.getValue() == maxPerf)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        /*

 int maxPerf = 0 ;

        for (Integer value: participent.values())

            if(value > maxPerf)
                maxPerf = value ;

        Set<Sportif>sportifs = new HashSet<>();

        for (Map.Entry<Sportif , Integer> entry : participent.entrySet())

         */



        return gagnants ;
    }

    public boolean estTerminer (){

        return classement != null;
    }

    public int getLimiteDeparticipant() {
        return limiteDeparticipant;
    }

    private List<Sportif> genererClassement (){

        List <Sportif> classement = new ArrayList<>();

        for (Sportif sportif :participent.keySet()) {

            boolean placer = false ;

            for (int i = 0 ; i < classement.size() ; i++){

                Sportif currentSportif = classement.get(i);
                int currentPer = participent.get(currentSportif);

                int perfSportAplacer = participent.get(sportif);

                if (perfSportAplacer > currentPer){

                    classement.add(i, sportif);
                }

                if (perfSportAplacer > currentPer){

                    classement.add(i,sportif);

                    placer = true ;

                }

            }

        }

        return classement ;
    }

    public List<Sportif> getClassement() {
        return new ArrayList<>(classement) ;
    }
}

/*
    public boolean equals(Object obj){


    }

    private List <Sportif> liste_de_sportif = new ArrayList<>() ;

    private List <Integer>  tableau_des_scores = new ArrayList<>();

 */
