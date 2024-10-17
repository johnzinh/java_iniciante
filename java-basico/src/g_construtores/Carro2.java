package g_construtores;

public class Carro2 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;



    public Carro2(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parametros");
    }


    public Carro2(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parametros");
    }


    //construtor vazio
    public Carro2() {
    }


//Usando o THIS nos metodos
    //metodo sem retorno.
    void exibirAutonomia(){
        System.out.println("A autonomia do carro: " + this.capCombustivel * this.consumoCombustivel + " km");
    }


    //metodo com retorno.
    double obterAutonomia(){
        System.out.println("Metodo obterAutonomia foi chamado!");
        return this.capCombustivel * this.consumoCombustivel;
    }

    //metodo com parametro - quando nao tem essa informacao dentro da classe.
    double calcularCombustivel(double km){
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }




}


