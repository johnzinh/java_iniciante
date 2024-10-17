package w_exceptions_try_catch.stacktrace_throws;

public class UsandoException {
    //Throwable - classe mae de todas as exceptions -
    //getMessage(); - retorna a descricao do erro
    //printStackTrace(); - imprime o stack trace do erro, onde e qual foi o erro


    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }


    }

}
