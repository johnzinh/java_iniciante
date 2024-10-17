package e_orientacao_objeto;

import java.util.Date;

public class Exer02 {
    public static void main(String[]args){

        Livro livro = new Livro();

        livro.autor = "Johnzinho";
        livro.nome = "Cronicas de john";
        livro.qtdPaginas = 235;
        livro.anoLancamento = 2015;
        //livraria
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestaA = "Johnzinho";




        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Paginas: " + livro.qtdPaginas);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);


    }

}
