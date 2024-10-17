package h_modificadores_de_acesso;



public class TesteMoto {
    public static void main(String[] args) {
 /*
Default - Somente dentro do pacote
public - O método pode ser chamado de qualquer classe.
private - O método pode ser chamado apenas de dentro da mesma classe.
protected - O método pode ser chamado apenas de classes no mesmo pacote ou subclasses.
*/


        Moto moto = new Moto("Honda", "FalconX", 2, 100, 2.5);

        moto.exibirAutonomia();
        moto.calcularCombustivel(25);


    }
}
