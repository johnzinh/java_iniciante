package l_polimorfismo;


public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    // Construtor padrão
    public Aluno() {
        super();
    }

    // Construtor com parâmetros
    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }


    //metodos especificos
    public void verificarAcesso() {

    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.getNome();
        this.getCurso();
    }

    //overrides - está sobrescrevendo o metodo e modificando o comportamento.
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return s;
    }





    //getters e setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
