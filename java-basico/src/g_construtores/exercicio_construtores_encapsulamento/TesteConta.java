package g_construtores.exercicio_construtores_encapsulamento;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente3 conta = new ContaCorrente3();

        conta.setNumero("123456");
        conta.setAgencia("52585");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta - " + conta.getNumero() + "= " + conta.getSaldo());


        //CHAMANDO METODO REALIZARSAQUE
        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque Efetuado com Sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Não possivel realixar saque, Saldo insufuciente!");
        }

        //CHAMANDO METDO REALIZAR SAQUE COM 500
        saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado com Sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Não possivel realizar saque, Saldo insufuciente!");
        }

        //METODO DEPOSITAR
        conta.depositar(500);
        conta.consultarSaldo();

        //SE ESTA USANDO CHEQUE ESPECIAL
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial!");
        } else {
            System.out.println("Nào está usando cheque especial!");
        }



    }
}
