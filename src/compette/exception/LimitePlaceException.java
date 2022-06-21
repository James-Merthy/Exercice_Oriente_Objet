package compette.exception;

public class LimitePlaceException extends  RuntimeException {
    private final int limite ;

    public LimitePlaceException(int limite) {

        super ("la limite de { " + limite + " } ");
        this.limite = limite;
    }
}
