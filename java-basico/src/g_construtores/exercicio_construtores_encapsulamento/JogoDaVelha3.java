package g_construtores.exercicio_construtores_encapsulamento;


public class JogoDaVelha3 {

    //char[][] jogoVelha = new char[3][3];
    private char[][] jogoVelha;
    private int jogada;

    //CONSTRUTORES ----------------------------------------------------------------
    public JogoDaVelha3() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }


    //METODOS ESPECIFICOS ----------------------------------------------------------


    //VALIDAR JOGADA
    public boolean validarJogada(int linha, int coluna, char sinal){
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
    public void imprimirTabuleiro(){
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha.length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }


    //METODO VERIFICAR GANHADOR
    public boolean verificarGanhador(char sinal){
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
    public boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }






    public void telaInicio(){
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







    //METODOS GETTERS E SETTERS -----------------------------------------------------
    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

}
