package a_algoritmo;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero 1");
        int num1 = scan.nextInt();
        System.out.println("Entre com o numero 2");
        int num2 = scan.nextInt();
        System.out.println("Entre com o numero 3");
        double num3 = scan.nextInt();

        int resul1 = (num1 * 2) * (num2/2);
        double resul2 = (num1 * 3) + num3;
        double resul3 = Math.pow (num3,3);

        System.out.println("Resultado 1: " + resul1);
        System.out.println("Resultado 3: " + resul2);
        System.out.println("Resultado 3: " + resul3);

    }
}
