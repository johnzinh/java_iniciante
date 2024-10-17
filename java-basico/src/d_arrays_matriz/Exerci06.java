package d_arrays_matriz;

import java.util.Scanner;

public class Exerci06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite: " + i);
            vetorA[i] = input.nextInt();
        }
        //quantidade de elementos pares e impares
        int qtdPar = 0;
        int qtdImpar = 0;

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                qtdImpar++;
            }
        }
        qtdPar = vetorA.length - qtdImpar;

        //logica para achar o percentual de pares e impares
            // vetorA.length - 100%
            // qtdPar        - X
            //X * vetorA.length = qtdPar * 100
            //X = (qtdPar * 100) / vetorA.length
        double porcPar = (qtdPar * 100)/ vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.println("Porcentagem Pares: " + porcPar);
        System.out.println("Porcentagem Impar: " + porcImpar);




    }
}
