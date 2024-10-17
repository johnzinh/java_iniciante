package l_polimorfismo;

public class Teste {
  public static void main(String[] args){

      Pessoa pessoa = new Pessoa();
      Pessoa aluno = new Aluno();
      Pessoa professor = new Professor();

      pessoa.setEndereco("Rua Castela Ratimbum");
      aluno.setEndereco("Rua São Paulo");
      professor.setEndereco("Rua Belo Horizonte");

      System.out.println(pessoa.obterEtiquetaEndereco());
      System.out.println(aluno.obterEtiquetaEndereco());
      System.out.println(professor.obterEtiquetaEndereco());

  }
}
