/*package construtores.exercicio_construtores_encapsulamento;


import java.util.Scanner;

public class TesteAluno {
    // private String[] nomeDisciplinas;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno3 alu = new Aluno3();


        System.out.println("Entre com o nome do aluno: ");
        alu.setNome(scan.next());

        System.out.println("Entre com o nome do curso: ");
        alu.setCurso(scan.next());

        System.out.println("Entre com a matricula do aluno: ");
        alu.setMatricula(scan.next());


        //NOME DAS DISCILPLINAS - array
        for (int i = 0; i < alu.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina: " + (i + 1));
            alu.setNomeDisciplinaPos(i, scan.next());
        }
        System.out.println("-----------------------------------");

        //NOTAS DAS DISCILPLINAS - matriz
        for (int i = 0; i < alu.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina - " + alu.getNomeDisciplinas()[i]);

            for (int j = 0; j < alu.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                alu.setNomePosIJ(i, j, scan.nextDouble());

            }

        }
        alu.mostrarInfo();

        for (int i = 0; i < alu.getNomeDisciplinas().length; i++) {
            if (alu.verificaAprovado(i)) {
                System.out.println("Disciplinas " + alu.getNomeDisciplinas()[i] + " - APROVADO!");
            } else {
                System.out.println("Disciplina " + alu.getNomeDisciplinas()[i] + " - REPROVADO!");
            }
        }


    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplinas) {
        this.nomeDisciplinas[pos] = nomeDisciplinas;
    }

    public void setNomePosIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }


}
*/