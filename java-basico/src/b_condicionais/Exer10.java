package b_condicionais;

import java.util.Scanner;
public class Exer10 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morangos: ");
        double qtdMorango = scan.nextDouble();
        System.out.println("Entre com a quantidade (kg) de maçaes: ");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        double precoKgMaca = 0;

        if(qtdMorango <= 5){
            precoKgMorango = 2.5;
        }else{
            precoKgMorango = 2.20;
        }
        if (qtdMaca <= 5){
            precoKgMaca = 1.80;
        }else{
            precoKgMaca = 1.50;
        }

        //preco da compra morango e maca
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        //preco da compra toda
        double precoParcial = precoKgMaca + precoKgMorango;
        double precoTotal = precoParcial;

        //if para desconto de 10% caso ultrapasse 8kg ou acima de RS 25,00
        if((qtdMorango + qtdMaca > 8) ||  precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        System.out.println("Preço total = " + precoTotal);




    }
}
