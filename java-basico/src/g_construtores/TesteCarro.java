package g_construtores;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();


        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 20;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirDetalhes();

        Carro van2 = new Carro("Mercedes","Ducato", 10, 100, 0.3);
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.consumoCombustivel);
        System.out.println(van2.capCombustivel);







    }
}
