package k_heranca_super;

//HERANCA É UM TIPO DE RELACIONAMENTO É UM
public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;


    public void verificarAcesso(){

    }


    //CONSTRUTOR SUPERCLASE
    public Aluno(){
        super();
    }
    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    //METODOS ESPECIFICOS
    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer(){
        super.getNome();
        this.getCurso();
    }


    //METODOS GETTERS E SETTERS
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
