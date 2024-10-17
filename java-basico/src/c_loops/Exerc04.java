package c_loops;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        //flag
        boolean valido = false;

        do {
            System.out.println("Entre com a populacao A: ");
            popA = teclado.nextDouble();
            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("invalido!");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Entre com a populacao B: ");
            popB = teclado.nextDouble();
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("invalido!");
            }
        } while (!valido);


        valido = false;

        do {
            System.out.println("entre com a taxa de crescimento da populacao A: ");
            taxaA = teclado.nextDouble();
            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("invalido!");
            }
        } while (!valido);

        valido = false;

        do {
            System.out.println("entre com a taxa de crescimento da populacao B: ");
            taxaB = teclado.nextDouble();
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("invalido!");
            }
        } while (!valido);


        int cont = 0;
        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }


        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd Anos: " + cont);
    }
}


