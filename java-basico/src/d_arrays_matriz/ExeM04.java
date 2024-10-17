package d_arrays_matriz;

import java.util.Scanner;

public class ExeM04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //matriz de 31 dias, 24 horas
        String[][][] compromissos = new String[31][24][8];

        boolean sair = false;
        byte opcao;

        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso: ");
            System.out.println("Digite 2 para verificar compromisso: ");
            System.out.println("0  - Sair");

            opcao = scan.nextByte();

            if (opcao == 1) {   //adicionar compromisso

                boolean diaValido = false;
                boolean horaValida = false;
                int hora = 0;
                int dia = 0;
                boolean mesvalido = false;
                int mes = 0;

                while (!mesvalido) {
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesvalido = true;
                    } else {
                        System.out.println("mes inválido, Digite novamente!");
                    }
                }

                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, Digite novamente!");
                    }
                }

                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 5 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, Digite uma hora válida!");
                    }
                }

                mes--;
                dia--;
                System.out.println("Digite o compromisso: ");
                compromissos[mes][dia][hora] = scan.next();

            } else if (opcao == 2) {   //verificar compromisso

                boolean diaValido = false;
                boolean horaValida = false;
                int hora = 0;
                int dia = 0;
                boolean mesvalido = false;
                int mes = 0;

                while (!mesvalido) {
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {
                        mesvalido = true;
                    } else {
                        System.out.println("mes inválido, Digite novamente!");
                    }
                }


                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, Digite novamente!");
                    }
                }

                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, Digite uma hora válida!");
                    }
                }

                dia--;
                System.out.println("o compromisso agendado é: ");
                System.out.println(compromissos[mes][dia][hora]);

            } else if (opcao == 0) {   //sair
                System.out.println("Programa Finalizado");
                sair = true;
            } else {
                System.out.println("Digite uma opção válida!");
            }


        } //fim do while

    }
}

