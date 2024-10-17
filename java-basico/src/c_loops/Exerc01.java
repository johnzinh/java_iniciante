package c_loops;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //resolver utilizando flag pra testa se a condicao é verdadeira.
        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota entre 0 e 10:");
            double nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota válida: " + nota);
            } else {
                //notaValida = false
                System.out.println("Nota inválida!");
            }
        } while (!notaValida);
        //while(notaValida = false)


    }
}