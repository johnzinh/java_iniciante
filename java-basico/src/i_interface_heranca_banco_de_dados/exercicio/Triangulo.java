package i_interface_heranca_banco_de_dados.exercicio;

public class Triangulo extends Figura2D{
    private double base;
    private double altura;



    //getters e setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public double calcularArea() {
        return (altura * base)/2;
    }
}
