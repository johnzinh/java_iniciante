package d_arrays_matriz;

import java.util.Scanner;

public class ExeM03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println("Entre com valor da posição: ["+ i + "," + j + "]");
                numeros[i][j] = teclado.nextInt();
            }
        }

        //algoritmo
        int qtdPares = 0;
        int qtdImpar = 0;
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                if (numeros[i][j] % 2 == 0){
                    qtdPares++;
                }
                else{
                    qtdImpar++;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpar);


    }
}
