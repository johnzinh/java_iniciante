package l_heranca_polismorfismo_exercicios;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    //getters e setters
    public int getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    //toString
    @Override
    public String toString() {
        String s = "ContaPoupanca [" ;
        s += "diaRendimento: " + diaRendimento;
        s += " - " + super.toString();
        s += " ]";
        return s;
    }

    //METODOS ESPECIFICOS

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        } else {
            return false;
        }


    }



}
