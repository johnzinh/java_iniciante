package l_polimorfismo;

public class Professor extends Pessoa {

    //atributos
    private String nomeCurso;
    private double salario;



    //metodos especificos
    public double calcularSalarioLiquido() {
        return 0;
    }

    //overrides - está sobrescrevendo o metodo e modificando o comportamento.
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return s;
    }


//getters e setters
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
