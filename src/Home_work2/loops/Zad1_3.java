package Home_work2.loops;

import java.util.Scanner;

public class Zad1_3 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Введите число которое будем возводить в степень");
        double base = num.nextDouble();
        double result = 1;


        System.out.println("Введите степень в которую будем возводить число");


       int exp = num.nextInt();

       if (exp <= 0){
           System.out.println("Степень должна быть целочисленной и положительной! а нука вводи как надо!");
           return;
       }

       for (int i = 0; i < exp; i++) {       //возведение в степень
               result *= base;

       }

           System.out.println(base + " ^ " + exp + " = " + result);

    }
}
