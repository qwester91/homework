package Home_work2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
       // System.out.println(Arrays.toString(arrayFromConsole()));     //проверки работоспособности

       // System.out.println(Arrays.toString(arrayRandom(8,99)));

    }
    public static int[] arrayFromConsole () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число элементов массива");
        int [] container = new int[scan.nextInt()];

        for (int i = 0; i < container.length; i++) {
            System.out.println("введите " + (i + 1) + " элемент массива ");
            container[i] = scan.nextInt();
        }

       return container;
    }

    public static int[] arrayRandom (int size, int maxValueExclusion) {
    int [] container = new int[size];
        Random arr = new Random();


        for (int i = 0; i < size; i++) {

            container[i] = arr.nextInt(maxValueExclusion);
        }

        return container;
    }

}
