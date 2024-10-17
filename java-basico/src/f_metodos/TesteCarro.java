package f_metodos;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        //System.out.println("Marca: " + van.marca);
        //System.out.println("Modelo: " + van.modelo);

        //metodo sem retorno
        van.exibirAutonomia();

        //metodo com retorno
        van.obterAutonomia();

        //pode atribuir o metodo a uma variavel
        // double autonomia = van.obterAutonomia();
        //System.out.println("A autonomiado carro é: " + autonomia);

        //metodo com parametros
        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 =  " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 =  " + qtdCombustivel15);


    }
}
