package Home_work2.loops;
//1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//        1.4.1. 3
//        1.4.2. 188
//        1.4.3. -19
//        1.4.4. Да и вообще на любое целочисленное

import java.util.Scanner;

public class Zad1_4 {
    public static void main(String[] args) {
        overflowLong(3L);
        overflowLong(188L);
        overflowLong(-19L);

        Scanner multiply = new Scanner(System.in);
        System.out.println("введите число на которое умножать до переполнения ");
        Long n = multiply.nextLong();
        overflowLong(n);
    }

    /**
     * выводит в консоль результат умножения (Long) = 1 на некий множитель, до переполнения и после
     * @param multiplier  - множитель на который будем умножать еденичку
     */
    private static void overflowLong(long multiplier) {
        long a = 1L;
        try {
            for(;;) {
                a = Math.multiplyExact(a, multiplier);
            }
        } catch (ArithmeticException ae) {
            System.out.println("до переполнения " + a);
            System.out.println("после переполнения " + a * multiplier);
        }
    }
}
