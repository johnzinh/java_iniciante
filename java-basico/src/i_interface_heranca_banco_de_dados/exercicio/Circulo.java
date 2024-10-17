package i_interface_heranca_banco_de_dados.exercicio;

public class Circulo extends Figura2D{
    private double raio;



    //getters e setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
}
