package b_condicionais;

import java.util.Scanner;

public class SwitchCase{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int dia;

       /* do {
            System.out.println("0 - SAIR");
            System.out.println("Entre com o dia da semana 1 - 7");
            dia = scan.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Domingo!");
                    break;
                case 2:
                    System.out.println("Segunda!");
                    break;
                case 3:
                    System.out.println("terça!");
                    break;
                case 4:
                    System.out.println("Quarta!");
                    break;
                case 5:
                    System.out.println("Quinta!");
                    break;
                case 6:
                    System.out.println("Sexta!");
                    break;
                case 7:
                    System.out.println("Sábado!");
                    break;
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Inválido!");
            }
        }
        while(dia != 0);
        */

        do {
            System.out.println("0 - SAIR");
            System.out.println("Entre com o dia da semana 1 - 7");
            dia = scan.nextInt();
            switch (dia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia útil!");
                    break;
                case 7:
                    System.out.println("Fim de semana!");
                    break;
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Inválido!");
            }
        }
        while(dia != 0);

    }
}