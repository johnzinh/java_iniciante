package w_exceptions_try_catch;

/*
exemplo de uso
- ao realizar leitura ou escrita de arquivo usa-se o finally pra fechao-lo ao final
- ao abrir conexao no banco de dados, fecha a conexao com o bloco finally
 */
public class Teste_finally {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero!");
            } catch (Throwable e) {
                System.out.println("Ocorreu um erro!");
            } finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }


        }


    }

}
