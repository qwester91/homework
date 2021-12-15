package Home_work2.utils;
//2.1. Создать класс ArraysUtils:
//        2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
//        Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
//
//        2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена
//        информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
//        Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
//
//
//        2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
//        Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
//        Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
//
//        2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
//        размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.

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

    public static int[] arrayRandomText() {             // для ввода с клавиатуры параметров рандома
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
