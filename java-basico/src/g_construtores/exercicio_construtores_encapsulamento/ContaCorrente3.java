package g_construtores.exercicio_construtores_encapsulamento;

public class ContaCorrente3 {
    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;


    //CONSTRUTORES --------------------------------------
    public ContaCorrente3() {}

    public ContaCorrente3(String agencia, boolean especial, double limiteEspecial, String numero, double saldo) {
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.numero = numero;
        this.saldo = saldo;
    }




    //METODOS ESPECIFICOS --------------------------------

    //METODO REALIZAR SAQUE
    public boolean realizarSaque(double quantiaAsacar) {

        //TEM SALDO NA CONTA
        if (saldo >= quantiaAsacar) {
            saldo -= quantiaAsacar;
            return true;
        } else { //NAO TEM SALDO
            if (especial) {  //VERIFICAR SE O LIMITE ESPECIAL TEM SALDO
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaAsacar) {
                    saldo -= quantiaAsacar;
                    return true;
                } else {
                    return false;
                }
            } else { //NAO É ESPECIAL E NAO TEM SALDO SUFICIENTE
                return false;
            }
        }
    }

    //METODO DEPOSITAR
    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    //METODO CONSULTAR SALDO
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta: " + saldo);
    }

    //METODO VERIFICAR SE ESTA USANDO CHEQUE ESPECIAL
    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }






    //METODOS GET SET -----------------------------------

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
