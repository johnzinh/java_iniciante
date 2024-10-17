package a_algoritmo;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o Valor/Hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de Hrs trabalhadas no mes: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println("o salraio é: " + salario);
    }
}
