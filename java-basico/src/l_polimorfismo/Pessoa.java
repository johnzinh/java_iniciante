package l_polimorfismo;



public class Pessoa {
    // Atributos da classe
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;



    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String telefone){
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    //metodos especificos

    //metodo que vai ser sobrescrito
    public String obterEtiquetaEndereco(){
        return endereco;
    }


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

