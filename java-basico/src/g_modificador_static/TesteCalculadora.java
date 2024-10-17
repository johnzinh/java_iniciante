package g_modificador_static;

import java.util.Scanner;

public class TesteCalculadora {

    static void imprimirTela(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.println("Entre com um número positivo!");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, Tente novamente!");
            }

        } while (num < 0);
        System.out.println(Calculadora.fatorial(num));


        imprimirTela(Calculadora.soma(1, 2));
        imprimirTela(Calculadora.subtrair(5, 4));
        imprimirTela(Calculadora.multiplicar(5, 5));
        imprimirTela(Calculadora.dividir(8, 2));
        imprimirTela(Calculadora.potencia(2, 4));

    }


}
