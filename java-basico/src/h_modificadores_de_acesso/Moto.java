package h_modificadores_de_acesso;

public class Moto {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public Moto(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }


    //metodos ------------------------------------------------------------------------------------


    //metodo com retorno.
    public double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    public void exibirAutonomia(){
        System.out.println("Autonomia da Moto: " + obterAutonomia());
    }


    //metodo com parametro - quando nõo tem essa informacao dentro da classe.
    private double divideKmCombustivel(double km){  //divide Km por combustivel
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        return this.divideKmCombustivel(km);
    }


}
