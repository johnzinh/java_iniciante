package metodos.exercicios;


import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogoDavelha = new JogoDaVelha();



        jogoDavelha.telaInicio();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal; // X - O
        int linha = 0, coluna = 0;


        while(!ganhou) {

            if (jogoDavelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2, Escolha linha e coluna (1-3");
                sinal = 'o';
            }

            linha = valor("linha", scan);
            coluna = valor("coluna", scan);

            if (!jogoDavelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição ja usada, tente novamente!");
            }

            jogoDavelha.imprimirTabuleiro();

            if(jogoDavelha.verificarGanhador('x')){
                ganhou = true;
                System.out.println("Parabens, Jogador 1 ganhou !");
            } else if (jogoDavelha.verificarGanhador('o')) {
                ganhou = true;
                System.out.println("Parabens, Jogador 2 ganhou !");
            } else if (jogoDavelha.jogada > 9) {
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida!");
            }

        }

    }


//METODO FORA DO MAIN (STATIC)
    static int valor (String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor --;
        return valor;
    }


}
