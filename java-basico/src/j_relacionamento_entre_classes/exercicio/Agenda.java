package j_relacionamento_entre_classes.exercicio;

public class Agenda {
    private String nome;
    private Contato[] contatos;


    //CONSTRUTORES
    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }


    //METODOS ESPECIFICOS
    public String obterInfo() {
        String info = "Nome da agenda: " + nome + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }


    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }


}
