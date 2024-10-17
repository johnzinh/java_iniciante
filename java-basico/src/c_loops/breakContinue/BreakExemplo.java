package c_loops;

import java.util.Scanner;

public class BreakExemplo {
    public static void main(String[] args) {
        //break usado pra sair do loop, pode ser usado com um label (rotulo)

        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.println("Entre com numero: ");
        num1 = teclado.nextInt();
        System.out.println("Entre com limite: ");
        num2 = teclado.nextInt();

        //qual primeiro numero divisivel por 7 depois do num1 e limite num2
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("o valor de i é: " + i);
                break;
            }
        }

        System.out.println("Entre com numero: ");
        num3 = teclado.nextInt();
        System.out.println("Entre com limite: ");
        num4 = teclado.nextInt();
        //continue - pede pra continuar o loop na proxima iteracao
        // abaixo sempre q for divisivel por 7 (com resto 0) vai pular e continuar o codigo abaixo

        for (int i = num3; i <= num4; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("o valor de i é: " + i);
        }


        System.out.println("Rotulos GOTO");
        //break com rotulos ( GOTO ) - não é uma boa pratica.
        for (int i = 0; i <= 4; i++) {
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);

        }


    }
}
