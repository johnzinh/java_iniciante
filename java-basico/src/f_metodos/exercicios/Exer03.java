package f_metodos.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        //aluno.nomeDisciplinas = new String[3]; SE NAO TIVESSE DECLARADO LA NA CLASSE ALUNO

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso: ");
        aluno.curso = scan.next();

        System.out.println("Entre com a matricula do aluno: ");
        aluno.matricula = scan.next();


        //NOME DAS DISCILPLINAS - array
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina: " + (i + 1));
            aluno.nomeDisciplinas[i] = scan.next();
        }
        System.out.println("-----------------------------------");

        //NOTAS DAS DISCILPLINAS - matriz
        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina - " + aluno.nomeDisciplinas[i]);

            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();

            }

        }
        aluno.mostrarInfo();

        for(int i = 0; i < aluno.nomeDisciplinas.length; i++){
            if(aluno.verificaAprovado(i)){
                System.out.println("Disciplinas " + aluno.nomeDisciplinas[i] + " - APROVADO!");
            }else{
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - REPROVADO!");
            }
        }


    }
}
