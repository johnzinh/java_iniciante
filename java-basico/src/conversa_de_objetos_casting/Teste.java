package conversa_de_objetos_casting;

public class Teste {

    //USANDO O INSTANCEOF - serve pra verificar o tipo de classe
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa() {
            @Override
            public String obterEtiquetaEndereco() {
                return "";
            }

            @Override
            public void imprimirEtiquetaEndereco() {

            }
        };
        Aluno aluno01 = new Aluno();
        Professor prof01 = new Professor();

        if(pessoa01 instanceof Pessoa){
            System.out.println("Ë do tipo Pessoa!");
        }

        if(aluno01 instanceof Aluno){
            System.out.println("Ë do tipo Aluno!");
        }

        if(prof01 instanceof Pessoa){
            System.out.println("Ë do tipo Professor!");
        }

    }





    // converter ums subclasse para o tipo de superclasse ou vice-versa

    /*
    Upcasting
    Aluno aluno = new Aluno();
    Objeto pessoa = aluno;
    */

    Aluno aluno = new Aluno();
    Pessoa pessoaAluno = aluno; //UPCASTING - transformou uma classe menor em um tipo de clase maior.

    //exemplos de upcasting manual
    Pessoa aluno1 = new Aluno();
    //ou
    Pessoa aluno2 = (Pessoa) new Aluno();// ---> conversão



        /*
    Downcasting - transformar em uma classe que te menor na hierarquia
     */
    // Pessoa aluno4 = new Pessoa();
    // Aluno aluno5 = (Aluno) aluno4;
    // Aluno aluno5 = (Aluno) pessoaAluno;





}
