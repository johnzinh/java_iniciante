package b_condicionais;

import java.util.Scanner;
public class Exer06 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com valor de a:");
        int a = scan.nextInt();
        if(a == 0){
            System.out.println("Não é equação do 2 grau.");
        } else {
            System.out.println("Entre com valor de b:");
            int b = scan.nextInt();
            System.out.println("Entre com valor de c");
            int c = scan.nextInt();

            //calculo do Delta ( b ao quadrado menos 4ac )
            double delta = (b*b) - (4 * a * c);
            if(delta < 0){
                System.out.println("Delta negativo!");
            }
            //calculo das raizes reais
            else {

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("delta: " + delta);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);

            }


        }




    }
}