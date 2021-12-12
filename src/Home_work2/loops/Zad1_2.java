package Home_work2.loops;
// 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
//      вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
//      пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

import java.util.Scanner;

public class Zad1_2 {
    public static void main(String[] args) {

        double testNumber;
        String expression = "";
        long result = 1L;


        try {
            testNumber = Double.parseDouble(args[0]);    // проверяем на не число
        } catch (Exception e) {
            System.out.println("Аргумент программы не является числом");
            return;
        }


        // переводим строку в число                     // чтобы не потерять дробную чсть (если ее введут), для проверки
        testNumber = Double.parseDouble(args[0]);       // целочисленности используем дабл


        if (testNumber % 1 != 0) {  // проверка на целочисленность
            System.out.println("введено не целое число");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int length = length(number);
        int[] arr = new int[length];

        System.out.println("аргумент программы = " + number );


        for (int i = length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
            result *= arr[i];
        }

        expression += arr[0];

        for (int i = 1; i < length ; i++) {
            expression += " * " + arr[i];
        }
        System.out.println(expression + " = " + result);







    }

    public static int length (int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}