package d_arrays_matriz;

import java.util.Scanner;

public class Exerci02 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        double[] vetorC = new double[5];
        double[] vetorD = new double[vetorC.length];

        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;

        System.out.println("Vetor B = vetorA * 2");
        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = vetorA[i] * 2;
        }
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor A: " + vetorA[i]);
            System.out.println("Vetor B: " + vetorB[i]);
        }

        //outro exercicio
        System.out.println("Vetor D = vetorc * vetor c  (ao quadrado)");
        for(int i = 0; i < vetorC.length; i++){
            System.out.println("Digite o valor da posicao: " + i);
            vetorC[i] = scan.nextInt();
            //vetorD[i] = vetorC[i] * vetorC[i];
            vetorD[i] = Math.sqrt(vetorC[i]);
        }
        for(int i = 0; i < vetorC.length; i++) {
            System.out.println("Vetor C: " + vetorC[i]);
            System.out.println("Vetor D: " + vetorD[i]);
        }

    }
}