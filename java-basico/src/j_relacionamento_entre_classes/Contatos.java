package j_relacionamento_entre_classes;

public class Contatos {

    //private String endereco;
    //private String telefone;
    private String nome;
    private Endereco endereco; //endereco do tipo Endereco
    private Telefone[] telefones; //telefone do tipo Telefone[]


    //CONSTRUTOR VAZIO
    public Contatos() {

    }


    //METODOS GETTERS E SETTERS
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
