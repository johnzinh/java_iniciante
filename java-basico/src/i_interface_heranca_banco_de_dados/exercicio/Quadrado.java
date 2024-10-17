package i_interface_heranca_banco_de_dados.exercicio;

public class Quadrado extends Figura2D{
    private int lado;



    public Quadrado(int lado){
        this.lado = lado;
    }

    //getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }



//metodo herdado de DimencaoSuperficial
    @Override
    public double calcularArea() {
        //return lado * lado;
        return Math.pow(lado, lado);
    }
}
