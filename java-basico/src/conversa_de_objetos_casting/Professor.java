package conversa_de_objetos_casting;

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

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do Professor");
        System.out.println(this.obterEtiquetaEndereco());
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
