package metodos.exercicios;

public class JogoDaVelha {

    //char[][] jogoVelha = new char[3][3];
    char[][] jogoVelha;
    int jogada;

    //constructor
    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        int jogada = 1;
    }



    //VALIDAR JOGADA
    boolean validarJogada(int linha, int coluna, char sinal){
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'o') {
            return false;
        }
        else { //jogada valida deve incrementar a jogada
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }


    //METODO IMPRIMIR TABULEIRO
    void imprimirTabuleiro(){
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha.length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }


    //METODO VERIFICAR GANHADOR
    boolean verificarGanhador(char sinal){
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||    //linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||   //linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) ||   //linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||   //coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||   //coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) ||   //coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||   //diagonal
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {   //diagonal inversa
            return true;
        }
        return false;
    }




    //METODO VEZ DO JOGADOR 1
    boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }

    //METODO INICIO DO GAME
    void telaInicio(){
        System.out.println("# JOGO DA VELHA #");
        System.out.println("# by - johnzinho #");
        System.out.println("──────────────────────────────▓▓█───────\n" +
                "────────────────────────────▒██▒▒█──────\n" +
                "───────────────────────────█▓▓▓░▒▓▓─────\n" +
                "─────────────────────────▒█▓▒█░▒▒▒█─────\n" +
                "────────────────────────▒█▒▒▒█▒▒▒▒▓▒────\n" +
                "─▓▓▒░──────────────────▓█▒▒▒▓██▓▒░▒█────\n" +
                "─█▓▓██▓░──────────────▓█▒▒▒▒████▒▒▒█────\n" +
                "─▓█▓▒▒▓██▓░──────────▒█▒▒▒▒▒██▓█▓░░▓▒───\n" +
                "─▓▒▓▒▒▒▒▒▓█▓░──░▒▒▓▓██▒▒▒▒▒▒█████▒▒▒▓───\n" +
                "─▓░█▒▒▒▒▒▒▒▓▓█▓█▓▓▓▓▒▒▒▒▒▒▒▒██▓██▒░▒█───\n" +
                "─▓░▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▒▒▒█───\n" +
                "─▓░▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▓██░░░█───\n" +
                "─▓░▓███▒▒▒▒▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▓──\n" +
                "─▒▒▒██▓▒▓█▓▒▒▒▒▒▒▒▓▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▓▒█──\n" +
                "──▓▒█▓▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓█▓▒▒▒▒▒▒▒▓▒─\n" +
                "──▓▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓──────▓█▓▒▒▒▒▒▓█─\n" +
                "──▒▒▓▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▓▓───░▓▓───█▓▒▒▒▒▒█─\n" +
                "───█▒▒▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓───█████▓──█▓▒▒▒▒▓▒\n" +
                "───▓▓█▒─────▒▓▒▒▒▒▒█───░██████──░█▒▒▒▒▓▓\n" +
                "───▓█▒──▒███─▒▓▒▒▒▒█────██████───▓▒▒▒▒▒▓\n" +
                "───██───█████─█▒▒▒▒█─────███▓────▓▓▒▒▒▒▓\n" +
                "───█▓───█████─▒▓▒▒▒█─────────────█▓▓▓▒▒▓\n" +
                "───█▓───░███──░▓▒▒▒▓█──────────░█▓▒▒▒▓▒▓\n" +
                "───██─────────▒▓▒▒▒▒▓▓──────░▒▓█▓────░▓▓\n" +
                "───▓█░────────█▓██▓▒▒▓█▓▓▓▓██▓▓▒▓▒░░▒▓▒▓\n" +
                "───▒██░──────▓▒███▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▓─\n" +
                "────█▓█▓▓▒▒▓█▓▒░██▒▒▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓█▒\n" +
                "────▓─░▓▓▓▓▓▒▓▓▓▓▒▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓\n" +
                "────▒▒▒▓▒▒▒▒▒▒▓█░─░░░─▓▓▒▒▒▒▒▒▒▒▒▒▒▓██▓▒\n" +
                "─────█▓▒▒▒▒▒▒▒▒▓▓─░░░─▓▓▒▒▒▒▒▒▒▒▒▓▓▓▒▒▓▒\n" +
                "──────██▓▓▒▒▒▒▒▒█▒░░░░█▒▒▒▒▒▒▒▒▓█▓▓▒▒▒▒▒\n" +
                "─────░─▒██▓▓▒▒▒▒▒█▓▒▒▓▒▒▒▒▒▒▓███▓▒▒▒▒▒▓▓\n" +
                "──────────░▒▓▓▓▓▒▒▓▓▓▓▓▓████▓▓█▒▒▒▒▒▓▓█░");

        System.out.println("--------------------------------------");
    }


}
