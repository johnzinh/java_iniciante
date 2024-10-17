package g_modificador_static;

public class TesteContador {

    static void imprimirValor() {
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {

        //nao precisa instanciar metodos statics - static, o valor não muda quando é chamado.
        imprimirValor();
        Contador.incrementar();

        imprimirValor();
        Contador.zerar();

        imprimirValor();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimirValor();

        //A cada instancia pode ser setado o valor para os atributos.
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimirValor();






    }

}
