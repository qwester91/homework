package Home_work2.loops;

public class Zad1_1_1 {
    public static void main(String[] args) {
        int product = 1;
        int number = 0;
        String expression = "1";
        for (String arg: args) {
            number = Integer.parseInt(arg);

        }
        if (number < 0) {
            System.out.println("Вы запустили программу с отрицательным аргументом");
            return;

        } else if (number == 0) {
            System.out.println("Вы запустили программу с аргументом равным нулю");
            return;
        }
        for (int i = 2; i <= number; i++) {
            expression += " * " + i;


        }
         do {
             product *= number;
             number--;
         } while (number > 1);


         System.out.println(expression + " = " + product);





    }
}
