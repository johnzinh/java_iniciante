package a_algoritmo;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o Valor/Hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de Hrs trabalhadas no mes: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto/100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double ir = (salarioBruto/100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("o salaraio bruto é: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total Descontos: " + totalDesconto);
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
