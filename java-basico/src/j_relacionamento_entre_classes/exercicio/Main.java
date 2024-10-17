package j_relacionamento_entre_classes.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
        //Agenda agenda = new Agenda();
        //agenda.setNome(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1));

            Contato cont = new Contato();

            System.out.println("Entre com o Nome");
            nome = scan.nextLine();
            cont.setNome(nome);

            System.out.println("Entre com o Telefone");
            String telefone = scan.nextLine();
            cont.setTelefone(telefone);

            System.out.println("Entre com o Email");
            String email = scan.nextLine();
            cont.setEmail(email);

            contatos[i] = cont;

        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }


    }

}
