package g_construtores.exercicio_construtores_encapsulamento;

public class TesteLampada {
    public static void main(String[] args){
        lampada3 lamp = new lampada3();

        lamp.ligar();
        lamp.mostraEstado();
        lamp.desligar();
        lamp.mostraEstado();
        lamp.mudarEstado();
        lamp.mostraEstado();


    }
}
