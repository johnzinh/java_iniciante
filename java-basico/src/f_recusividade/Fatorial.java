package f_recusividade;

public class Fatorial {

    public static int fatorialNR(int num) {
        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    //RECURSIVIDADE
    public static int fatorialR(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorialR(num - 1);
    }


}
