package w_exceptions_try_catch;

public class Teste {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[3];

            System.out.println("Antes da exception");

            vetor[0] = 1;
            vetor[1] = 2;
            vetor[2] = 3;
            vetor[4] = 4;

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("excecao ao acessar um indice do vetor que nao existe!");
        }


        System.out.println("Esse texto será impresso apos a exception");


    }
}
