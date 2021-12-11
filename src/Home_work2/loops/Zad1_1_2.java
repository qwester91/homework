package Home_work2.loops;
//  1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к
//          исполняемой программе. Есть нюанс с переполнением, можно добавить проверки
//          и сообщения пользователю. Пример: Ввели 5, должно получиться в
//          консоли: 1 * 2 * 3 * 4 * 5 = ответ
//          1.1.1. Используя только цикл

import java.util.Scanner;

public class Zad1_1_2 {
    public static void main(String[] args) {
        int product = 1;
        int number;
        String expression = "1";

        Scanner q = new Scanner(System.in);


        try {
           number =  Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            System.out.println("Аргумент программы не является числом");
            return;
        }


        // переводим строку в число
            number = Integer.parseInt(args[0]);

        System.out.println("аргумент = " + number);


        if (number < 0) {  // проверка на отрицатльность
            System.out.println("Вы запустили программу с отрицательным аргументом");
            return;

        } else if (number == 0) { // проверка на ноль
            System.out.println("Вы запустили программу с аргументом равным нулю");
            return;
        }



        for (int i = 2; i <= number; i++) {  // собираем строку вида 1 * 2 * 3 * ,,,,
            expression += " * " + i;

        }


         do {                          // считаем результат перемножения
             product *= number;
             number--;
         } while (number > 1);


         System.out.println(expression + " = " + product);    // вывод результата в консоль


    }
}
