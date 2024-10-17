package d_arrays_matriz;

import java.util.Random;

public class ExeM02 {
    public static void main(String[] args) {
        int[][] numAleatorios = new int[10][10];
        Random numRandom = new Random();

        for(int i = 0; i < numAleatorios.length; i++){
            for(int j = 0; j < numAleatorios[i].length; j++){
                numAleatorios[i][j] = numRandom.nextInt(100);
            }
        }
        //Mostrando a matriz
        for(int i = 0; i < numAleatorios.length; i++){
          for(int j = 0; j < numAleatorios[i].length; j++){
              System.out.print(numAleatorios[i][j] + " - ");
          }
          System.out.println("");
        }



        //Maior e menor da linha 5
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;

        //linha fixa, passeando pelas colunas
        for(int i = 0; i < numAleatorios[linha5].length; i++){
            if(numAleatorios[linha5][i] > maiorL5){
                maiorL5 = numAleatorios[linha5][i];
            }
            if(numAleatorios[linha5][i] < menorL5){
                menorL5 = numAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5: " + menorL5);


        //maior e menor da coluna 7
        int maiorC7 = 0;
        int menorC7 = 101;
        int coluna7 = 7;

        //coluna fixa, passeando pelas linhas
        for(int i = 0; i < numAleatorios.length; i++){
            if(numAleatorios[i][coluna7] > maiorC7 ){
                maiorC7 = numAleatorios[i][coluna7];
            }
            if(numAleatorios[i][coluna7] < menorC7){
                menorC7 = numAleatorios[i][coluna7];
            }
        }
        System.out.println("Maior valor da coluna 7: " + maiorC7);
        System.out.println("Menor valor da coluna 7: " + menorC7);


    }
}
