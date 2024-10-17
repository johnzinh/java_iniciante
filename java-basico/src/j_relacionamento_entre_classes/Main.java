package j_relacionamento_entre_classes;

public class Main {
    public static void main(String[] args) {

        Contatos contato = new Contatos();
        contato.setNome("Tyrion");
        //contato.setTelefone("+55 11-9999999");
        //contato.setEndereco("Kings Landing");


        //RELACIONAMENTO TEM-UM ENDERECO
        Endereco end = new Endereco();
        contato.setEndereco(end);

        end.setNomeRua("Rua Aemond terceiro");
        end.setNumero("309");
        end.setComplemento("Proximo à praça principal");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("39-949999");


        //RELACIONAMENTO TEM-UM TELEFONE
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Casa");
        telefone1.setDdd("47");
        telefone1.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular");
        telefone2.setDdd("37");
        telefone2.setNumero("888888-8888");


        //RELACIONAMENTO TEM-MUITOS TELEFONE (array ou collections)
        Telefone[] telefones = new Telefone[2];
        contato.setTelefones(telefones);

        telefones[0] = telefone1;
        telefones[1] = telefone2;


        //SAÍDA CONSOLE
        System.out.println("Nome: " + contato.getNome());
        //System.out.println("Telefone: " + contato.getTelefone().getNumero());
        //System.out.println("Endereço: " + contato.getEndereco().getCidade());


        //null safe operator - pra evitar erros e excecoes
        if (contato != null && contato.getEndereco() != null) {
            System.out.println("Endereço: " + contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println("Telefone: " + t.getDdd() + " " + t.getNumero());
            }
        }


    }
}
