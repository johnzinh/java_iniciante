package e_orientacao_objeto;

public class Exer01 {
    public static void main(String[] args) {
        //instanciacao
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "bivolt";
        lampada.garantiaMeses = 36;
        lampada.cor = "amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        //instanciar o array tbm
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeão";


    }
}
