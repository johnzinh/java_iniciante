package d_arrays_matriz;

import java.util.Scanner;

public class Exerci08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[10];

        int qtdIdade = 0;
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade " + (i + 1));
            idades[i] = teclado.nextInt();
            if (idades[i] > 35) {
                qtdIdade++;
            }
        }
        //variaveis para pegar o maior e menor e sua posicao.
        int menorIdade = idades[0];
        int indexMenor = 0;
        int maiorIdade = idades[0];
        int indexMaior = 0;
        for(int i = 0; i < idades.length; i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indexMaior = i;
            } else if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indexMenor = idades[i];
            }
        }

        for (int idade : idades) {
            System.out.print(idade + " ");
        }
        System.out.println(" ");
        System.out.println("idades maiores que 35: " + qtdIdade);
        System.out.println("menor idade: " + menorIdade + " - posicao: " + indexMenor);
        System.out.println("maior idade: " + maiorIdade + " - posicao: " + indexMaior);


    }
}
