package i_interface_heranca_banco_de_dados.exercicio;

public class Cubo extends Figura3D{
    private double lado;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }



    //HERDADOS
    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
