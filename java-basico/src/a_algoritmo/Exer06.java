package a_algoritmo;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");
        double raio = scan.nextDouble();

        //classe Math do java ajuda com calculos.( raio é igual a pi vezes raio ao quadrado)
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A area é: " + area);

    }
}