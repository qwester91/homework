package Class_work;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("сколько чисел вы будете вводить");

        int [] data = new int[console.nextInt()];

        for (int i = 0; i < data.length; i++) {
            System.out.println("введите число");
            data[i] = console.nextInt();
        }
        int sum = 0;
        for (int item : data) {
            sum += item;

        }
        System.out.println("сумма чисел " + sum);
    }


}
