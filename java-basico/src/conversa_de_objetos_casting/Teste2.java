package conversa_de_objetos_casting;

public class Teste2 {
    public static void main(String[] args) {

        Object obj1 = obterString();
        String s1 = (String) obj1; //DOWNCASTING

        Object obj2 = "Minha String";
        String s2 = (String) obj2;//UPCASTING

        Object obj3 = new Object();
        String s3 = (String) obj3;//downcasting, object não pode ser convertido em String - erro em tempo de execução.


        //n da pra transformar um Inteiro em uma String
        //Object obj01 = obterInteiro();
        //String s01 = (String) obj01;






    }

    public static String obterString(){
        return "Minha String!";
    }

    public static int obterInteiro(){
        return 1;
    }


}
