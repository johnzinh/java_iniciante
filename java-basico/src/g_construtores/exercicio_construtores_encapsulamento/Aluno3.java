/*package construtores.exercicio_construtores_encapsulamento;

public class Aluno3 {
    private String nome;
    private String curso;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][4];

    //CONSTRUTORES
    public Aluno3() {
    }

    public Aluno3(String curso, String matricula, String nome, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.curso = curso;
        this.matricula = matricula;
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = nomeDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }


    //METODOS ESPECIFICOS
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCurso);
        //mostrar as notas
        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas.length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean verificaAprovado(int indice) {
        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }


    private double obterMedia(int indice) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }


    //METODODS GET E SET
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }


}
*/