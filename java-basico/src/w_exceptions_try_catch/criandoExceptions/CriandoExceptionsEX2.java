package w_exceptions_try_catch.criandoExceptions;

public class CriandoExceptionsEX2 {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //ou pode tratar na hora de chamar o metodo

    }

    public static void teste() throws DivisaoNaoExata{ //usando metodo throws

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            //catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e)
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //ao invés de capturar aqui, lanca atraves do metodos throws
                System.out.println("Aconteceu um erro inesperado!");
                e.printStackTrace();
            }
            catch (Exception e) {
                System.out.println("Aconteceu um erro inesperado!");
                System.out.println(e.getMessage());
            }
        }


    }


}
