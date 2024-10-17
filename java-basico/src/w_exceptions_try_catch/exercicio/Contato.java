package w_exceptions_try_catch.exercicio;

public class Contato {
    //atributos
    private static int contador = 0;
    private int id; //identificador

    private String nome;
    private String telefone;
    private String email;


    //construtor para inicializar o ID e incrementar o contador.
    public Contato(){
        contador++;
        id = contador;
    }



    //GETTERS E SETTERS
    public int getId() {
        return id;
    }
    //NÃO TEM setID - ELE É CONTROLADOR INTERNAMENTE

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //metodo toString
    @Override
    public String toString() {
        String s ="[ ";
        s += "ID: " + id;
        s += " - Nome: " + nome;
        s += " - Telefone: " + telefone;
        s += " - Email: " + email;
        s += " ]";
        return s;
    }




}
