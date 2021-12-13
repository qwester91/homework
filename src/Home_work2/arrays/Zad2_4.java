package Home_work2.arrays;
//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
// Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//        2.4.1. Сумма четных положительных элементов массива                    // sumEvenPositive
//        2.4.2. Максимальный из элементов массива с четными индексами
//        2.4.3. Элементы массива, которые меньше среднего арифметического
//        2.4.4. Найти два наименьших (минимальных) элемента массива
//        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//        2.4.6. Сумма цифр массива

import java.util.Arrays;
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


// 2.4.1. Сумма четных положительных элементов массива

    public static void sumEvenPositive() {
//       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
       int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
       System.out.println("вот наш массив:");                                //эту
       System.out.println(Arrays.toString(arr));                             // и эту

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



    //     2.4.2. Максимальный из элементов массива с четными индексами

    public static void maxPositiveEvenIndex() {
        //       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
        int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
        System.out.println("вот наш массив:");                                //эту
        System.out.println(Arrays.toString(arr));                             // и эту


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



    //        2.4.3. Элементы массива, которые меньше среднего арифметического

    public static void lessThanAverage() {

        //       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
        int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
        System.out.println("вот наш массив:");                                //эту
        System.out.println(Arrays.toString(arr));                             // и эту
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


//        2.4.4. Найти два наименьших (минимальных) элемента массива

    public static void doubleMin() {

        //       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
        int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
        System.out.println("вот наш массив:");                                //эту
        System.out.println(Arrays.toString(arr));                             // и эту


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


    //        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу

    public static void compressionDelete(){
        //       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
        int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
        System.out.println("вот наш массив:");                                //эту
        System.out.println(Arrays.toString(arr));                             // и эту


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


    //        2.4.6. Сумма цифр массива

    public static void sumNumber() {
        //       int [] arr = ArraysUtils.arrayRandomText();   //если хочешь ввести параметры массива с клавиатуры, раскомментируй эту строку, и закомментируй три следующие
        int [] arr = ArraysUtils.arrayRandom(10,50);       //вот эту
        System.out.println("вот наш массив:");                                //эту
        System.out.println(Arrays.toString(arr));                             // и эту
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
