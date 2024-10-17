package b_condicionais;


import java.util.Scanner;

public class IfElse{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com idade");
        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade!");
        }
        else{
            System.out.println("Não é maior de idade");
        }

        System.out.println("---------------------------------------------------------");


            //valor <10 - barato
            //10 < valor <15 -  pedir desconto
            //valor entre 15 e 17 - pesquisar mais
            //>=17 - muito caro

            System.out.println(" 0 - finalizar!");
            System.out.println("Entre com valor: ");
            double valor = scan.nextDouble();


            if (valor <= 10) {
                System.out.println("barato, pode comprar!");
            } else if (valor > 10 && valor < 15) {
                System.out.println("Pedir desconto!");
            } else if (valor >= 15 && valor < 17) {
                System.out.println("Pesquisar mais!");
            } else {
                System.out.println("Muito caro!");
            }



        System.out.println("---------------------------------------------------------");

        System.out.println("0 - sair");
        System.out.println("entre com o dia da semana 1 - 7");

        int dia = scan.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda- feira");
        } else if (dia == 3) {
            System.out.println("Terça - feira");
        } else if (dia == 4) {
            System.out.println("Quarta - feira");
        } else if (dia == 5) {
            System.out.println("Quinta - feira");
        } else if (dia == 6) {
            System.out.println("Sexta - feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else if (dia == 0){
            System.out.println("Saindo!");
        }
        else {
            System.out.println("invalido!");
        }


    }
}