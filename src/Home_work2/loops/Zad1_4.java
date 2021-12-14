package Home_work2.loops;

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
