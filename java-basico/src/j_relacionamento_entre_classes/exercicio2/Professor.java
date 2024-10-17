package j_relacionamento_entre_classes.exercicio2;

public class Professor {
    private String nome;
    private String departamento;
    private String email;



    //metodos obter informacao
    public String obterInfo(){
        return "Professor: " + nome;
    }





    //getters e setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
