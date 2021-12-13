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

    public static int[] arrayRandomText() {             // генерируем массив (сбросил сюда повторяющиеся действия актуальные для всех методов в классе)
        Scanner in = new Scanner(System.in);


        System.out.println("Введите желаемую длину массива");
        int size = in.nextInt();

        System.out.println("Введите максимально возможное значение элемента массива");
        int maxValue = in.nextInt();

        int[] arr = ArraysUtils.arrayRandom(size, maxValue);
        System.out.println("Вот наш сгенерированный массив:");
        System.out.println(Arrays.toString(arr));      // выводим наш массив в консоль (интересно же)

        return arr;

    }

}
