package f_recusividade;

import java.util.Scanner;

public class TesteFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int fatNR = Fatorial.fatorialNR(5);
        System.out.println(fatNR);

        int fatR = Fatorial.fatorialR(5);
        System.out.println(fatR);




        /*
        int num;
        do {
            System.out.println("Entre com um número positivo!");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, Tente novamente!");
            }

        } while (num < 0);
        System.out.println("Fatorial de " + num + ": " + Fatorial.fatorialR(num));
        */





    }

}
