package a_algoritmo;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[4];
        double media;
        double soma = 0;

        for(int i = 0; i < 4; i++) {
            System.out.println("Digite a nota "+(i + 1)+" do aluno: ");
            notas[i] = teclado.nextDouble();
            soma += notas[i];
        }
        media = soma/4;
        System.out.println("Média do aluno: " + media);

        }


    }

