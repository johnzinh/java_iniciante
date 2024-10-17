package w_exceptions_try_catch.exercicio;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();


        int opcao = 1;
        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { //--> consultar contato
                //CRIEI UM METODO QUE TRATA AS EXCECOES
                consultarContato(scan, agenda);

            } else if (opcao == 2) { //Adicionar contato
                adicionarContato(scan, agenda);
            } else if (opcao == 3) { //Sair - termina o programa
                System.exit(0); //-> so usa em sistemas desktop (Grr)
            }
        }


    } //FIM DO MAIN


    //metodo pra ler as informacoes
    public static String lerInformacao(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }


    //metodo pra tratar as exceptions ao consultar contato
    public static void consultarContato(Scanner scan, Agenda agenda) {
        Contato cont = new Contato();
        String nomeContato = lerInformacao(scan, "Entre com o nome do Contato a ser pesquisado");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
                System.out.println(cont);
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }


    //metodo para adicionar contatos
    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("********************************************");
            System.out.println("Criando um contato, entre com as informações");
            String nome = lerInformacao(scan, "Entre com o nome do contato");
            String telefone = lerInformacao(scan, "Entre com o telefone do contato");
            String email = lerInformacao(scan, "Entre com o Email do contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);


            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            System.out.println("********************************************");


            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }


    }


    public static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {//--> enquanto entrada não for válida.
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Consultar contato:");
            System.out.println("2- Adicionar contato:");
            System.out.println("3 - Sair!");

            try {
                //opcao = scan.nextInt();
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada); //--> transforma a string em um inteiro

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida!\n");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
            }

        }
        return opcao;
    }


}
