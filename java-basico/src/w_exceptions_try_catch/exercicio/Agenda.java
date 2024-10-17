package w_exceptions_try_catch.exercicio;

public class Agenda {
    private Contato[] contatos; //array de Contatos


    //construtor
    public Agenda() {
        contatos = new Contato[5]; //setando o tamanho do array
    }


    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            //lançar exception aqui.
            throw new AgendaCheiaException();
        }
    }


    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        //lançar exception contato nao existe
        throw new ContatoNaoExisteException(nome);
    }


    //toString pra imprimir a agenda.
    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }

        }
        return s;
    }


}
