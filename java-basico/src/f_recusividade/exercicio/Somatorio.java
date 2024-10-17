package f_recusividade.exercicio;

public class Somatorio {
    public static void main(String[] args) {
        System.out.println(Somatorio.somatorio(3));


    }


    public static int somatorio(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);

    }


}
