package w_classe_object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    //ATRIBUTOS
    private String curso;
    private double[] notas;

    //CONSTRUTOR PADRAO
    public Aluno(){
    }

    //CONSTRUTOR COM PARAMETROS
    public Aluno(String curso, double[] notas){
        this.curso = curso;
        this.notas = notas;
    }

    //GETTERS E SETTERS
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public double[] getNotas(){
        return notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }


    //METODOS OVERRIDE DO toString
/*
/    public String toString(){
/        String s = curso + "\n";
/        for(double nota : notas){
/            s += nota + " ";
/        }
/        return s;
/    }
*/

    //METODO toString
    @Override
    public String toString() {
        return "Aluno {" +
                "curso= '" + curso + '\'' +
                ", notas= " + Arrays.toString(notas) +
                '}';
    }


//METODO equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno aluno)) return false;
        return Objects.equals(curso, aluno.curso) && Objects.deepEquals(notas, aluno.notas);
    }



/*   @Override
/   public int hashCode() {
/       return Objects.hash(curso, Arrays.hashCode(notas));
/   }
*/

}
