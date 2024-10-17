package l_heranca_polismorfismo_exercicios;

public class TesteContaBancaria {
    public static void main(String[] args) {

        System.out.println(">>>>>>>> TESTE CONTA BANCÁRIA <<<<<<<");
        ContaBancaria contaSimples = new ContaBancaria();

        contaSimples.setNomeCliente("CLIENTE CONTA BANCARIA - Capitão Nudez");
        contaSimples.setNumConta("00000000000");

        //chamando metodos
        contaSimples.depositar(100);
        //utilizando o metodo estático
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        //assim,a saída vem do toString
        System.out.println("\n" + contaSimples);


        System.out.println("\n\n");
        //-----------------------------------------------------------------------------------

        System.out.println(">>>>>>>> TESTE CONTA POUPANÇA <<<<<<<");
        ContaPoupanca poupanca = new ContaPoupanca();

        poupanca.setNomeCliente("CLIENTE CONTA POUPANCA - Senhor Calça Cagada");
        poupanca.setNumConta("1111111111");
        poupanca.setDiaRendimento(5);

        //chamando metodos
        poupanca.depositar(100);
        //utilizando o metodo estático
        realizarSaque(poupanca, 50);
        realizarSaque(poupanca, 70);

        //metodo da conta poupanca calcularNovoSaldo passado em um if para foramtar saída.
        if(poupanca.calcularNovoSaldo(0.6)){
            System.out.println("Rendimento aplicado! \n - Novo saldo: " + poupanca.getSaldo() );
        } else {
            System.out.println("hoje não é dia de rendimento \n - novo saldo não calculado!");
        }

        //assim,a saída vem do toString
        System.out.println(poupanca);



        System.out.println("\n\n");
        //-----------------------------------------------------------------------------------

        System.out.println(">>>>>>>> TESTE CONTA ESPECIAL <<<<<<<");
        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNomeCliente("CLIENTE CONTA POUPANCA - Senhor Calça Cagada");
        contaEspecial.setNumConta("2222222222");
        contaEspecial.setLimite(50);

        //chamando metodo depositar
        contaEspecial.depositar(100);
        //utilizando o metodo estático
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);

    }

    //metodo estatico para valida saque -
    // como a conta poupanca extend a contabancaria o codigo nao da erro (polimorfismo)
    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso! \n - Novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de: " + valor + " \n - Saldo atual: " + conta.getSaldo());
        }
    }

}
