package d_arrays_matriz;

import java.util.Scanner;

public class exerci04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorNumeros = new int[10];
        int qtdPares = 0;
        int soma = 0;
        int mult5 = 0;
        int somaImpares = 0;
        int qtdImpares = 0;

        //numeros pares
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.println("Digite o valor da posicao: " + i);
            vetorNumeros[i] = input.nextInt();

            if(vetorNumeros[i] % 2 == 0){
                qtdPares++;
            }
        }
        //soma dos valores
        for(int i = 0; i < vetorNumeros.length; i++){
            soma += vetorNumeros[i];
        }


        //soma so os multiplos de 5
        for(int i = 0; i < vetorNumeros.length; i++){
            if(vetorNumeros[i] % 5 == 0){
                mult5 += vetorNumeros[i];
            }
        }
        //media dos impares
        for (int i = 0; i < vetorNumeros.length; i++){
            if(vetorNumeros[i] % 2 != 0){
                somaImpares += vetorNumeros[i];
                qtdImpares++;
            }
        }
        int media = somaImpares/qtdImpares;





        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Soma: " + soma);
        System.out.println("Soma dos multiplos de 5: " + mult5);
        System.out.println("Soma: " + somaImpares);
        System.out.println("media dos impares: " + media);



    }
}
