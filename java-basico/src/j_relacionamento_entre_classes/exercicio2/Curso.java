package j_relacionamento_entre_classes.exercicio2;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;



//metodos especificos

    //metodo obter informacao
    public String obterInfo() {
        String info = "Nome do curso = " + nome + "\n";

        if(professor != null) {
            info += professor.obterInfo();
        }
        if(alunos != null){
            System.out.println("-----------ALUNOS-----------");
            for(Aluno aluno : alunos){
                if(aluno != null){
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMeédia da Turma: " + obterMediaTurma();

        }

        return info;
    }


//metodo obter media
    public double obterMediaTurma() {
        double soma = 0;
        for(Aluno aluno : alunos){
            if (aluno != null){
                soma += aluno.obterMedia();
            }
        }
        return soma/alunos.length;
    }






    //getters e setters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
