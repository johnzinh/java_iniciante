package d_arrays_matriz;

import java.util.Scanner;


public class Exerci07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite: " + i);
            vetorA[i] = input.nextInt();
        }
        //logica soma do elementos inferiores a 15
        int somaMenor15 = 0;
        int igual15 = 0;
        int qtdMaior15 = 0;
        int somaMaior15 = 0;

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == 15){
                somaMenor15 += vetorA[i];
            }
            else if (vetorA[i] < 15) {
                igual15 += vetorA[i];
            }
            else{
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("Quantidade Numeros igual 15: " + igual15);
        System.out.println("Soma numeros menor que 15: " + somaMenor15);
        System.out.println("Media dos mariores que 15: " + somaMaior15/qtdMaior15);



    }
}