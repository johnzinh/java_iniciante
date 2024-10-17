package b_condicionais;

import java.util.Scanner;
public class Exer07 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o ano: ");
        int ano = scan.nextInt();
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("Ano Bissexto!");
        }else{
            System.out.println("Não é Bissexto!");
        }

        //numero é par ou impar
        System.out.println("Informe um numero:");
        int num1 = scan.nextInt();
        //resto da divisao por 2 é zero
        if (num1 % 2 ==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

        System.out.println("Entre com o primeiro numero");
        int num2 = scan.nextInt();
        System.out.println("Entre com o segundo numero");
        int num3 = scan.nextInt();
        System.out.println("Entre com a operação ( + - / *) ");
        String operacao = scan.next();

        double resultado = 0;
        //flag
        boolean valida = true;
        switch (operacao){
            case "+": resultado = num2 + num3;
                break;
            case "-": resultado = num2 - num3;
                break;
            case "/": resultado = num2 / num3;
                break;
            case"*": resultado = num2 * num3;
                break;
            default: System.out.println("Operacao invalida");
                valida = false;
            }


            if(valida){
                System.out.println("Resultado: "+ resultado);
                if(resultado >= 0){
                    System.out.println("resultado positivo");
                }else{
                    System.out.println("Resultado negativo");
                }

                if(resultado % 2 == 0){
                    System.out.println("PAR");
                }else{
                    System.out.println("IMPAR");
                }

            }


    }
}