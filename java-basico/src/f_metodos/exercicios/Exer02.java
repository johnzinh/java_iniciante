package f_metodos.exercicios;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "1234";
        conta.agencia = "134545";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEspecialUsado = 0;

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
            System.out.println("Não possivel realixar saque, Saldo insufuciente!");
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
