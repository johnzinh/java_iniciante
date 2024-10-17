package e_orientacao_objeto;

public class Exer03 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.agencia = "13245678";
        contaCorrente.especial = true;
        contaCorrente.numero = "134";
        contaCorrente.saldo = 120;
        contaCorrente.limiteEspecial = 500;

        System.out.println("Saldo da conta "+contaCorrente.numero + " = " + contaCorrente.saldo);
    }
}
