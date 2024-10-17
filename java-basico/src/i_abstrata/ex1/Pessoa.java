package i_abstrata.ex1;


//classe abstratas não podem ser instanciadas
public abstract class Pessoa {

    // ATRIBUSTOS DA CLASSE
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;



    // CONSTRUTOR PADRAO
    public Pessoa() {
    }

    // CONSTRUTOR COM PARAMETROS
    public Pessoa(String nome, String endereco, String telefone){
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //METODOS ESPECIFICOS

    //metodo que vai ser sobrescrito

//  public String obterEtiquetaEndereco(){
//    return endereco;
//  }


    //pode-se utilizar o abstrato em metodos. as classes filhas devem declarar como sera o comportamento
    public abstract String obterEtiquetaEndereco();

    //as classes filhas devem declarar esse metodo
    public abstract void imprimirEtiquetaEndereco();





    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

