package c_loops;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.println("entre com o nome");
            nome = teclado.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("favor entrar com nome no minimo 3 caracteres");
            }
        } while (!infoValida);


        //Reutilizando a flag
        infoValida = false;
        do {
            System.out.println("Entre com a idade");
            idade = teclado.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Inválido, idade deve ser entre 0 a 150");
            }
        }
        while (!infoValida);

        //reutilizando flag novamente
        infoValida = false;
        do {
            System.out.println("entre com o salario");
            salario = teclado.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("digite um valor válido");
            }
        } while (!infoValida);

        //flag again
        infoValida = false;

        do {
            System.out.println("Entre com o sexo (F ou M)");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Entre com um sexo valido");
            }
        }
        while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Estado civil");
            estadoCivil = teclado.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("invalido, entre com s,v,c,d");
            }
        } while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);


    }
}