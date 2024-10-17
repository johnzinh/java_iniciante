package b_condicionais;

import java.util.Scanner;
public class Exer05 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String aproveitamento = "";
        if(media >= 9 && media >= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media <= 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media <+6) {
            aproveitamento = "D";
        }else if(media >= 0 && media <= 4){
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        switch(aproveitamento){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO!");break;
            case "D":
            case "E":System.out.println("REPROVADO!");break;
        }




        //TRIANGULO
        System.out.println("LADO 1 DO TRIANGULO");
        int lado1 = scan.nextInt();
        System.out.println("LADO 2 DO TRIANGULO");
        int lado2 = scan.nextInt();
        System.out.println("LADO 3 DO TRIANGULO");
        int lado3 = scan.nextInt();

        if(((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("triangulo equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("triangulo escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triangulo isosceles");
            }
        }
        else{
            System.out.println("Não é um triangulo");
        }


    }
}