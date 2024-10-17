package l_heranca_polismorfismo_exercicios;

public class ContaBancaria {
    //atributos
    private String nomeCliente;
    private String numConta;
    private double saldo;


    //CONSTRUTORES
    public ContaBancaria(){

    }
    public ContaBancaria(String nomeCliente, String numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //GETTERS E SETTERS
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo toString
    @Override
    public String toString() {
        return "ContaBancaria {" +
                "nomeCliente = '" + nomeCliente + '\'' +
                ", numConta = '" + numConta + '\'' +
                ", Saldo = " + saldo +
                '}';
    }

    //METODOS ESPECIFICOS

    //metodo depositar
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! \n - Novo Saldo: " + getSaldo() );
    }

    //metodo sacar (o saldo não pode ficar negativo)
    public boolean sacar(double valor){
        if((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

}
