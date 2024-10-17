package f_sobrecarga_exemplo;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.soma(5,5);
        calc.soma(2.0,3.0);
        calc.soma(5,5,5);
    }



}
