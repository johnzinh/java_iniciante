package w_exceptions_try_catch.exercicio;

public class ContatoNaoExisteException extends Exception{

    private String nomeContato;

    //construtor
    public ContatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!\n";
    }
}
