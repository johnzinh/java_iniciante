package k_heranca_super;

public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;


    //construtores








    //metodos especificos
    public double calcularSalarioLiquido() {
        return 0;
    }





    //metodo getters e setters
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
