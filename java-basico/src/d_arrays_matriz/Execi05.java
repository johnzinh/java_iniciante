package d_arrays_matriz;

import java.util.Scanner;

public class Execi05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        //soma dos impares
        int qtdImpar = 0;
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            numeros[i] = input.nextInt();
            if(numeros[i] % 2 != 0){
                 soma += numeros[i];
                 qtdImpar++;
            }
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/qtdImpar));



    }
}
