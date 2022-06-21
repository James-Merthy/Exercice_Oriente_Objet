package compette.exception;

public class EtatCompetitionException extends IllegalStateException{

    private final boolean etatCourant ;
    private final  boolean etatAttendu ;

    public EtatCompetitionException (boolean etatCourant , boolean etatAttendu){

        super("La compet est " + (etatCourant ? "" : " non ") + "terminée. Pour faire cette action"
         + " elle devrait être " + (etatAttendu ? "" : " non " ) + "términée.");

        this.etatAttendu = etatAttendu ;

        this.etatCourant = etatCourant ;
    }

}
