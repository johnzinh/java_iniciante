package w_exceptions_try_catch.exercicio;

public class AgendaCheiaException extends Exception {

    //mudou apenas o getMessage();
    @Override
    public String getMessage() {
        return "Agenda está cheia!";
    }
}
