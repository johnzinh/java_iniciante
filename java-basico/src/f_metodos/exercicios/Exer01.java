package f_metodos.exercicios;

public class Exer01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarStatus();
        lampada.desligar();
        lampada.mostrarStatus();

        lampada.mudarEstado();
        lampada.mostrarStatus();


    }
}
