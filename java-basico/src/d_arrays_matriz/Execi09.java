package d_arrays_matriz;
import java.util.Scanner;

public class Execi09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        //array para armazenar a media das notas
        double[] resultados = new double[notas1.length];


        System.out.println("Notas 1");
        for(int i = 0; i < notas1.length; i++){
            System.out.println("Digite a primeira nota dos alunos - " + (i+1));
            notas1[i] = input.nextDouble();
        }
        System.out.println("Notas 2");
        for(int i = 0; i < notas2.length; i++){
            System.out.println("Digite a segunda nota dos alunos- " + (i+1));
            notas2[i] = input.nextDouble();

            resultados[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("------Mostrando notas 1-----");

        for(int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println("");

        System.out.println("------Mostrando notas 2-----");
        for(int i = 0; i < notas2.length; i++){
            System.out.print(notas2[i] + " ");
        }
        System.out.println(" ");

        System.out.println("----Resultados-----");
        for(int i = 0; i < resultados.length; i++){
            System.out.print(resultados[i] + " ");
        }
        System.out.println(" ");

        for(int i = 0; i < resultados.length; i++) {
            if (resultados[i] > 7) {
                System.out.println(resultados[i] + " - aprovado");
            } else {
                System.out.println(resultados[i] + " - reprovado");
            }
        }

    }
}
