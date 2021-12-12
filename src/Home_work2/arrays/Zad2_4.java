package Home_work2.arrays;
//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
// Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//        2.4.1. Сумма четных положительных элементов массива                    // sumEvenPositive
//        2.4.2. Максимальный из элементов массива с четными индексами
//        2.4.3. Элементы массива, которые меньше среднего арифметического
//        2.4.4. Найти два наименьших (минимальных) элемента массива
//        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//        2.4.6. Сумма цифр массива

import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {    //используем для проверки методов
//        sumEvenPositive();
//        maxPositiveEvenIndex();
//        lessThanAverage();
//        doubleMin();
//        compressionDelete();
    sumNumber();
    }

    public static int[] array() {             // генерируем массив (сбросил сюда повторяющиеся действия актуальные для всех методов в классе)
        Scanner in = new Scanner(System.in);


        System.out.println("Введите желаемую длину массива");
        int size = in.nextInt();

        System.out.println("Введите максимально возможное значение элемента массива");
        int maxValue = in.nextInt();

        int[] arr = ArraysUtils.arrayRandom(size, maxValue);
        System.out.println("Вот наш сгенерированный массив:");

        int i = 0;

        do {                                // выводим наш массив в консоль (интересно же)
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
        return arr;
    }


    public static void sumEvenPositive() {         // 2.4.1. Сумма четных положительных элементов массива
       int [] arr = array();
       String result = "";

        int sum = 0;
        int stepIteration = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 0 && arr[j]%2 == 0) {
                result += arr[j];
                sum += arr[j];
                stepIteration = j;
                break;
            }
        }


        for (int k = stepIteration+1; k < arr.length; k++) {
            if (arr[k] >= 0 && arr[k]%2 == 0) {
                result += " + " + arr[k];
                sum += arr[k];
            }
        }

        System.out.println("Сумма четных положительных элементов массива: " + result + " = " + sum);

    }

    public static void maxPositiveEvenIndex() {         //     2.4.2. Максимальный из элементов массива с четными индексами
        int [] arr = array();
        System.out.println("Элементы массива с четными индексами: ");

        int maxArg = 0;

        for (int j = 0; j < arr.length; j+=2) {
            if (maxArg < arr[j]) {
            maxArg = arr[j];
            }
            System.out.println(arr[j]);
        }
        System.out.println("максимальный из элементов массива с четными индексами = " + maxArg);
    }



    public static void lessThanAverage() {             //        2.4.3. Элементы массива, которые меньше среднего арифметического

        int [] arr = array();
        double sum = 0;


        for (int arg:arr) {
            sum += arg;
        }
        double average = sum /  arr.length;

        System.out.println("Среднее арифметическое элементов массива = " + average);
        System.out.println("Элементы массива меньше среднего арифметического");

        for (int args :
                arr) {
            if (args < average){
            System.out.print(args + " ");
            }
        }
    }




    public static void doubleMin() {         //        2.4.4. Найти два наименьших (минимальных) элемента массива
        int [] arr = array();
        int min1 = arr[0];
        int min2 = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min1){
                min1 = arr[i];


            } else if (arr[i] < min2){
                min2 = arr[i];
            }
        }
        System.out.println("два минимальных элмента массива это : " + min1 + " и " + min2);
    }




    public static void compressionDelete(){        //        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
        int [] arr = array();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите нижнюю границу интервала");
        int a = in.nextInt();

        System.out.println("Введите верхнюю границу интервала");
        int b = in.nextInt();

        int lenth = arr.length;
        int i = 0;

        while (i < lenth){
            if (arr[i] < b && arr[i] > a) {
                lenth --;
                for (int j = i; j <lenth ; j++) {
                    arr[j] = arr[j+1];
                }
            } else {
                i++;
            }

        }

        for (int j = lenth; j < arr.length; j++) {
            arr[j] = 0;
        }
        System.out.println("Интервал удаляемых значений : [ " + a + " ; " + b + " ]");
        System.out.println("Получившийся массив : ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print( arr[j] + "\t");

        }
    }




    public static void sumNumber() {        //        2.4.6. Сумма цифр массива
        int[] arr = array();
        int sum = 0;
        int help = 0;

        for (int i = 0; i < arr.length; i++) {
            help = arr[i];

            do {
                sum += help % 10;
                help /= 10;

            }
            while (help != 0);
        }
        System.out.println("Сумма цифр массива :" + sum);

    }
}
