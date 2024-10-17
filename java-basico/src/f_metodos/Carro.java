package f_metodos;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    //metodo sem retorno.
    void exibirAutonomia(){
        System.out.println("A autonomia do carro: " + capCombustivel * consumoCombustivel + " km");
    }


    //metodo com retorno.
    double obterAutonomia(){
        System.out.println("Metodo obterAutonomia foi chamado!");
        return capCombustivel * consumoCombustivel;
    }

    //metodo com parametro - quando nao tem essa informacao dentro da classe.
    double calcularCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }


}
