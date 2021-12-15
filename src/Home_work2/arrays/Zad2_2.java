package Home_work2.arrays;
//2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
// Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
//        2.2.1. Вывести все элементы в консоль.
//        2.2.2. Вывести каждый второй элемент массива в консоль.
//        2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import Home_work2.utils.ArraysUtils;

public class Zad2_2 {
    public static void main(String[] args) {
        //        2.2.1. Вывести все элементы в консоль.
        printToConsole();

        //        2.2.2. Вывести каждый второй элемент массива в консоль.
        printToConsoleTroughOne();


        //        2.2.3. Вывести все элементы массива в консоль в обратном порядке.
        printToConsoleRevers();

    }

    public static void printToConsole () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = 0;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);

        // while метод
        System.out.println( "while метод" );

        int j = 0;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }

        // foreach метод
        System.out.println( "foreach метод" );

        for (int l : arr
             ) {
            System.out.println(l);

        }

    }


    public static void printToConsoleTroughOne () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = 1;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i += 2;
        } while (i < arr.length);

        // while метод
        System.out.println( "while метод" );

        int j = 1;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j += 2;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = 1; k < arr.length; k += 2) {
            System.out.println(arr[k]);

        }

        // foreach метод
        System.out.println( "foreach метод" );
        int m = 0;

        for (int l : arr) {

            if (m % 2 != 0) {
                System.out.println(l);
            }
            m++;
        }


    }

    public static void printToConsoleRevers () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = arr.length -1 ;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i--;
        } while (i > -1);

        // while метод
        System.out.println( "while метод" );

        int j = arr.length - 1;
        while (j > -1) {
            System.out.println(arr[j]);
            j--;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = arr.length -1; k > -1; k--) {
            System.out.println(arr[k]);

        }

        // foreach метод
        System.out.println( "foreach метод" );

        int n = arr.length-1;

        int [] array = new int [arr.length];
        for (int l : arr) {

           array [n] = l;
            System.out.println(array[n]);
            n--;

        }




    }

}
