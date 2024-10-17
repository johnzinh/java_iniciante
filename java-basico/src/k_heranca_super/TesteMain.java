package k_heranca_super;

public class TesteMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Filosofia");

        aluno.setNome("John");
        aluno.setEndereco("Rua cuzinho");
        aluno.setTelefone("000000");
        aluno.setCpf("000000000");

        Professor prof = new Professor();
        prof.setNomeCurso("Gestao de rabo");
        prof.setSalario(0000);

        prof.setNome("John");
        prof.setEndereco("Rua grelinho");
        prof.setTelefone("37-00000");
        prof.setCpf("000000000");


//DESSA MANEIRA, NÃO TEM ACESSO AOS ATRIBUTOS DO Aluno

        //pessoa é a superClasse da classe Aluno

        Pessoa aluno2 = new Aluno();
        //aluno2.setCurso("Filosofia");

        aluno2.setNome("John");
        aluno2.setEndereco("Rua pintinhu");
        aluno2.setTelefone("000000000");
        aluno2.setCpf("0000000000000");

        Pessoa prof2 = new Professor();
        //prof2.setNomeCurso("Gestao de rabo");
        //prof2.setSalario(0000);

        prof2.setNome("John");
        prof2.setEndereco("Rua grelinho");
        prof2.setTelefone("37-00000");
        prof2.setCpf("000000000");









    }
}
