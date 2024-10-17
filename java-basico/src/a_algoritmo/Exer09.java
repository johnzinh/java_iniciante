package a_algoritmo;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f-32) / 9);
        System.out.println(f + " farenheit equivale à: " + c);



        System.out.println("Temperatura em celcius: ");
        double celcius = scan.nextDouble();

        double faren = (celcius * 1.8) + 32;
        System.out.println(celcius + " celcius equivale à: " + faren);

    }
}
