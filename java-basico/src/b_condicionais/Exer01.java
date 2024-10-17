package b_condicionais;

import java.util.Scanner;

public class Exer01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o número 1");
        int num1 = input.nextInt();
        System.out.println("Entre com o número 2");
        int num2 = input.nextInt();
        System.out.println("Entre com o número 3");
        int num3 = input.nextInt();

        //numero maior
        if (num1 >= num2 && num1 >= 3){
            System.out.println("numero 1: " + num1 + " é maior");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("numero 2:" +num2+ " é maior");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("numero 3: " +num3+ " é maior");
        }

        //numero menor
        if (num1 <= num2 && num1 <= 3){
            System.out.println("numero 1: " + num1 + " é menor");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("numero 2: " +num2+ " é menor");
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("numero 3: " +num3+ " é menor");
        }




    }
}