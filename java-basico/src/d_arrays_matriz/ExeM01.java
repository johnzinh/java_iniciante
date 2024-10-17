package d_arrays_matriz;

import java.util.Random;

public class ExeM01 {
    public static void main(String[]args){
        int[][] numAleatorios = new int[4][4];

        //numeros aleatorios na matriz
        Random numeroRandom = new Random();

        for(int i = 0; i < numAleatorios.length; i++){
            for(int j = 0; j < numAleatorios[i].length; j++){
                //Gera numeros aleatoris até 100.
                numAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        //mostando matriz
        for(int i = 0; i < numAleatorios.length; i++){
            for(int j = 0; j < numAleatorios[i].length; j++){
                System.out.print(numAleatorios[i][j] + " - ");
            }
            System.out.println(" ");
        }

        //maior numero da matriz e sua posicao
        int maior = 0;
        int linha = 0;
        int col = 0;

        for(int i = 0; i < numAleatorios.length; i++){
            for(int j = 0; j < numAleatorios[i].length; j++){
                if(numAleatorios[i][j] > maior){
                    maior = numAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + col);



    }
}
