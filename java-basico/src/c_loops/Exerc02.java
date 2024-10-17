package c_loops;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //utilizando flag
        boolean infoValidas = false;
        String userName;
        String pass;


        do {
            System.out.println("Digite o nome do usuario");
            userName = teclado.next();
            System.out.println("Entre com Senha");
            pass = teclado.next();

            if (userName.equalsIgnoreCase(pass)) {
                //infoValidas = false;
                System.out.println("Senha igual ao usuário, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válido!");
            }
        } while (!infoValidas);


    }
}