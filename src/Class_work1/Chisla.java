package Class_work;
import java.util.Random;
import java.util.Scanner;

public class Chisla {
    public static void main(String[] args) {
        int rndNum = 0;
        Random rnd = new Random();
        int chet = 0;
        int neChet = 0;

        for (int i=0; i<= 1000; i++ ) {
            rndNum = rnd.nextInt(99);
            if (rndNum % 2 == 0){
                chet ++;
            } else {
                neChet ++;
            }

        }
        System.out.println( "четных чисел " + chet);
        System.out.println( "нечетных чисел " + neChet);


        double a = ((double)chet /1000*100);
        double b = ((double) neChet /1000*100);


        System.out.println( "% четных чисел " + a);
        System.out.println( "% нечетных чисел " + b);
    }
}
