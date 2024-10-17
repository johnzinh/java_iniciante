package f_metodos.exercicios;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;

    boolean tipoAbajur;
    boolean ligada;

    //METODOS LIGAR E DESLIGAR
    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    //METODO MOSTRAR STATUS DA LAMPADA
    void mostrarStatus(){
        if(ligada){
            System.out.println("Ligando Lampada!");
        }else{
            System.out.println("Desligando Lampada!");
        }
    }

    //MUDAR ESTADO DA LAMPADA
    void mudarEstado(){
        if(ligada){
            desligar();
        }else {
            ligar();
        }
    }



}
