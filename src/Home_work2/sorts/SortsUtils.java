package Home_work2.sorts;
//4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
//        4.2.1. Пузырьковая сортировка
//        4.2.2. Шейкерная сортировка
//4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//		4.3.1. {1,2,3,4,5,6}
//		4.3.2. {1,1,1,1}
//		4.3.3. {9,1,5,99,9,9}
//		4.3.4. {}
//	4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
//	4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.

import Home_work2.arrays.ArraysUtils;
import Home_work2.arrays.Zad2_4;

import java.util.Arrays;

public class SortsUtils {

    public static void main(String[] args) {
        int [] arr = ArraysUtils.arrayRandom(20,50);
        int [] arr1 = ArraysUtils.arrayFromConsole();
        int [] arrTest1 = {1,2,3,4,5,6};
        int [] arrTest2 = {1,1,1,1};
        int [] arrTest3 = {9,1,5,99,9,9};
        int [] arrTest4 = {};

        test(arr1);                  //проверка сортировки на arrayFromConsole (4.5)

        test(arr);                   //проверка сортировки на arrayRandom   (4.4)

        test(arrTest1);              //проверка сортировки на arrTest1   (4.3.1)

        test(arrTest2);              //проверка сортировки на arrTest2   (4.3.2)

        test(arrTest3);              //проверка сортировки на arrTest3    (4.3.3)

        test(arrTest4);              //проверка сортировки на arrTest4     (4.3.4)


    }

    public static void test(int [] arr){
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(arr));
        System.out.println("сортировка пузырьком");
        System.out.println(Arrays.toString(sortBubble(arr)));
        System.out.println("Сортировка шейкером");
        System.out.println(Arrays.toString(sortShake(arr)));
        System.out.println();
    }

    public static int[] sortBubble(int[] arr) {
        int help = 0;
        int stop = 0;
        for (int i = 0; i < arr.length-1; i++) {
            stop = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    help = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = help;
                    stop = 1;
                }
            }
           if (stop == 0) {
               break;
           }
        }
        return arr;
    }

    public static int[] sortShake(int[] arr) {
        int help = 0;
        int start = 0;
        int end = arr.length-1;
        do {
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    help = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = help;
                }
            }end--;
            for (int i = end; i > start ; i--) {
                if (arr[i] < arr[i - 1]) {
                    help = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = help;
                }
            }start++;

        } while (end >start);

        return arr;
    }

}
