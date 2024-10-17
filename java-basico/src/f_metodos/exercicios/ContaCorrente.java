package f_metodos.exercicios;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ContaCorrente {

    String numero;
    String agencia;
    double limiteEspecial;
    double saldo;
    double valorEspecialUsado;
    boolean especial;


    //METODOS REALIZAR SAQUE
    boolean realizarSaque(double quantiaAsacar){

        //TEM SALDO NA CONTA
        if(saldo >= quantiaAsacar){
            saldo -= quantiaAsacar;
            return true;
        } else { //NAO TEM SALDO
            if(especial){  //VERIFICAR SE O LIMITE ESPECIAL TEM SALDO
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaAsacar){
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
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    //METODO CONSULTAR SALDO
    void consultarSaldo(){
        System.out.println("Saldo atual da conta: " + saldo);
    }

    //METODO VERIFICAR SE ESTA USANDO CHEQUE ESPECIAL
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }





}
