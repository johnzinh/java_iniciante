package w_exceptions_try_catch.stacktrace_throws;

import java.util.Scanner;
//Throwable - classe mae de todas as exceptions
//throws Exception é usado na assinatura do metodo, quem for utilizar o metodo deve tratar a excecao.

public class UsandoThrows {

    public static void main(String[] args) {
        System.out.println("Entre com um numero double:");
        try {
            double num = lerNumeros();
            System.out.println("vc digitou - " + num );
        } catch (Exception e) {
            System.out.println("Inválido!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static double lerNumeros() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }


}