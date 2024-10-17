package b_condicionais;

import java.util.Scanner;
public class Exer08 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("telefonou pra vítima?");
        String resp1 = scan.next();
        System.out.println("esteve no local do crime?");
        String resp2 = scan.next();
        System.out.println("mora perto da vítima?");
        String resp3 = scan.next();
        System.out.println("devia pra vítima?");
        String resp4 = scan.next();
        System.out.println("já trabalhou pra vítima?");
        String resp5 = scan.next();

        int count = 0;

        if (resp1.equalsIgnoreCase("s")){
            count++;
        }
        if (resp2.equalsIgnoreCase("s")){
            count++;
        }
        if (resp3.equalsIgnoreCase("s")){
            count++;
        }
        if (resp4.equalsIgnoreCase("s")){
            count++;
        }
        if(resp5.equalsIgnoreCase("s")){
            count++;
        }

        if(count == 2){
            System.out.println("SUSPEITA!");
        } else if (count == 3|| count == 4) {
            System.out.println("CÚMPLICE!");
        } else if (count == 5) {
            System.out.println("ASSASSINO");
        } else if (count == 0) {
            System.out.println("INOCENTE");
        }


    }
}