package d_arrays_matriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerci03 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int[] vetorD = new int[vetorA.length];
        int[] vetorE = new int[vetorA.length];
        double[] vetorF = new double[vetorA.length];
        int[] vetorG = new int[vetorA.length];

        for(int i= 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        for(int i= 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor do vetor B: ");
            vetorB[i] = scan.nextInt();
        }
        for(int i = 0; i < vetorC.length; i++){
                vetorC[i] = vetorA[i] + vetorB[i];
                vetorD[i] = vetorA[i] - vetorB[i];
                vetorE[i] = (vetorA[i] * vetorB[i]);
                vetorF[i] = vetorA[i] / vetorB[i];
                vetorG[i] = vetorA[i] % 2;
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Vetor A: " +vetorA[i]);
            System.out.println("Vetor B: " +vetorB[i]);
            System.out.println("Vetor C: " +vetorC[i]);
            System.out.println("Vetor D:" +vetorD[i]);
            System.out.println("Vetor E:" +vetorE[i]);



            //usando decimalFormat pra saida.
            DecimalFormat df = new DecimalFormat("###,###.##");

            System.out.println("vetor F: " + df.format(vetorF[i]));
            System.out.println("vetor G: " + vetorG[i]);


            System.out.println("--------------------");
        }




    }
}