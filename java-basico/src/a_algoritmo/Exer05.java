package a_algoritmo;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();

        //1M = 100cm
        double cm = metros * 100;
        System.out.println(metros+"m" + " é igual a: "+ cm + "cm");

    }
}