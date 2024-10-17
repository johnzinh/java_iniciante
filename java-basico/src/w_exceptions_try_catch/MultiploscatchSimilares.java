package w_exceptions_try_catch;
//SEMPRE DA EXCECAO MAIS ESPEFICA PRA MAIS GENERICA
public class MultiploscatchSimilares {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i] / denom[i]));

                //UTILIZANDO O OPERADOR OU "|" PRA FAZER MULTIPLOS
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um erro!");
            }

        }


    }
}
