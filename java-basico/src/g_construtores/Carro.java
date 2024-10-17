package g_construtores;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //construtor é o nome da classe com ou sem parametros
    public Carro(){
         System.out.println("Classe carro foi instanciada!");
         numPassageiros = 5;
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }



    //metodo exibir tudo
    void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de Passageiros: " + numPassageiros);
        System.out.println("Capacidade de combústivel: " + capCombustivel);
        System.out.println("Consumo do combustível: " + consumoCombustivel);
        System.out.println("------------------------------------------------");
    }

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
