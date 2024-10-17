package j_relacionamento_entre_classes.exercicio2;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;


    //metodo obter informacao
    public String obterInfo(){
        String info = "Nome Aluno: " + nome + " - ";
        info += "Matricula: " + matricula + "- ";
        info += "Notas: ";

        //para as notas
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma/4;
        info += "\n" + "Média = " + media + " - ";

        if(media >= 7){
            info += "Aprovado!";
        } else {
            info += "Reprovado!";
        }
        return info;
    }


    public double obterMedia(){
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        return soma/4;
    }








    //getters e setters
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }





}
