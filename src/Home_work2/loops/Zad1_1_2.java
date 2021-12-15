package Home_work2.loops;
//  1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к
//          исполняемой программе. Есть нюанс с переполнением, можно добавить проверки
//          и сообщения пользователю. Пример: Ввели 5, должно получиться в
//          консоли: 1 * 2 * 3 * 4 * 5 = ответ
//          1.1.2. Используя рекурсию



public class Zad1_1_2 {
    public static void main(String[] args) {

        Long number;
        String expression = "1";




        try {
            number = Long.parseLong(args[0]);
        } catch (Exception e) {
            System.out.println("Вы ввели чето не то");
            return;
        }


        // переводим строку в число
        number = Long.parseLong(args[0]);

        System.out.println("аргумент = " + number);

        if (number < 0) {  // проверка на отрицатльность
            System.out.println("Вы запустили программу с отрицательным аргументом");
            return ;

        } else if (number == 0) { // проверка на ноль
            System.out.println("Вы запустили программу с аргументом равным нулю");
            return;
        }



        for (int i = 2; i <= number; i++) {  // собираем строку вида 1 * 2 * 3 * ,,,,
            expression += " * " + i;

        }

        System.out.println(expression + " = " + result(number));    // вывод результата в консоль
    }

    /**
     * result - вычисляет факториала
     * @param n - принимает число, факториал которого необходимо вычислить
     * @return - возвращает результат вычисления факториала
     */

    public static long result (Long n) {    // рекурсивная функция
        long chislo = 1L;


        if (n == 1){                    // условие выхода из рекурсии
            return chislo = 1;
        }
        if (chislo < 0 ){
            System.out.println("переполнение батенька");
            n = 1L;
            return chislo = 0;

        }
        return
                chislo = n * result(n-1);    // само рекурсивное выражение




    }

}
