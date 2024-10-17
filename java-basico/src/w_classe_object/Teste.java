package w_classe_object;

public class Teste {
    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da computação");

        double[] notas = {10, 9, 5, 7};
        aluno.setNotas(notas);
        System.out.println(aluno);

        String s1 = "asdf";
        String s2 = "asdF";

        System.out.println("Comparando as Strings");
        //compara as refrencias
        System.out.println(s1 == s2);
        //comparacao de objetos, usa-se eguals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        System.out.println("---------------------------------");


        //instancia criada pra comparacao
        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciência da computação");

        double[] notas2 = {10, 9, 5, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno2);

        //compara as refrencias
        System.out.println(aluno == aluno2);

        //quando se utiliza o metodo equals ele compara os atributos
        //deve se gerar o metodo equals e alterar o tipo de comparacao que se quer.
        System.out.println(aluno.equals(aluno2));








    }
}
