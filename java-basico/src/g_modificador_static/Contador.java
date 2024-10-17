package g_modificador_static;

public class Contador {

    private static int cont;

    //construtor pra teste
    public Contador() {
        cont++;
    }


    //metodos estaticos
    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int obterValor() {
        return cont;
    }



}
