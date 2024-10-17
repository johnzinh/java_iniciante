package d_arrays_matriz;

import java.util.Scanner;

public class ExeJogoDavelha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal; // X - O
        int linha = 0, coluna = 0;


        while (!ganhou) {

            if (jogada % 2 == 1) {//jogador 1 impar
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                 sinal = 'x';
            } else { //jogador 2 par
                System.out.println("Vez do jogador 2, Escolha linha e coluna (1-3");
                sinal = 'o';
            }


            boolean linhaValida = false;  //flag

            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();

                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
                //flag
                boolean colunaValida = false;

                while (!colunaValida) {
                    System.out.println("Entre com a coluna (1, 2 ou 3");
                    coluna = scan.nextInt();

                    if (coluna >= 1 && coluna <= 3) {
                        colunaValida = true;
                    } else {
                        System.out.println("Entrada inválida, tente novamente");
                    }
                }

                //decrementar por causa da matriz q comeca em 0
                linha--;
                coluna--;

                //verifica se a linha ou coluna ja foi escolhida
                if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
                    System.out.println("Posicao já usada, tente novamente");
                }
                else { //jogada valida deve incrementar a jogada
                    jogoVelha[linha][coluna] = sinal;
                    jogada++;
                }


                //imprimir tabuleiro
                for (int i = 0; i < jogoVelha.length; i++) {
                    for (int j = 0; j < jogoVelha.length; j++) {
                        System.out.print(jogoVelha[i][j] + " | ");
                    }
                    System.out.println();
                }


                //verificar se há ganhadores
                if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x') ||    //linha 1
                        (jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x') ||   //linha 2
                        (jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x') ||   //linha 3
                        (jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x') ||   //coluna 1
                        (jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x') ||   //coluna 2
                        (jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x') ||   //coluna 3
                        (jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x') ||   //diagonal
                        (jogoVelha[0][2] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][0] == 'x')) {   //diagonal inversa
                    ganhou = true;
                    System.out.println("Parabens jogador 1 ganhou!");
                } else if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'o') ||    //linha 1
                        (jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o') ||   //linha 2
                        (jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o') ||    //linha 3
                        (jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o') ||   //coluna 1
                        (jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o') ||   //coluna 2
                        (jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'o') ||   //coluna 3
                        (jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o') ||   //diagonal
                        (jogoVelha[0][2] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][0] == 'o')) {   //diagonal inversa
                    ganhou = true;
                    System.out.println("Parabens jogador 2 ganhou!");
                } else if (jogada > 9) {
                    ganhou = true;
                    System.out.println("Ninguem ganhou essa partida!");
                }


        }
    }
}
