package a_algoritmo;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o lado do quadrado: ");
    double lado = scan.nextDouble();

    //area é lado * lado
        double area = Math.pow(lado,2);
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado é: " + (area * 2));


    }
}
