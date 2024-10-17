package d_arrays_matriz;

public class ArrayExemplo {
    public static void main (String[] args){

        double[] temperatura = new double[10];
        //declarando antes os valores
        //double temperatura = {31, 29, 15, 16, 14};

        temperatura[0] = 31;
        temperatura[1] = 29;
        temperatura[2] = 15;
        temperatura[3] = 16;
        temperatura[4] = 14;

        for(int i = 0; i < temperatura.length; i++){
            System.out.println("o valor da temperatura do dia " + (i+1) + " e: " + temperatura[i]);
        }
        //outra forma de for
        for (double temp: temperatura ){
            System.out.println(temp);
        }






    }
}
