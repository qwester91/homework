package Class_work;

public class ChetNechet {
    public static void main(String[] args) {
        int a = 13;
        int b = 15;
        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.println("оба числа четные ");

        } else {
            if ((a % 2 != 0) && (b % 2 != 0)) {
                System.out.println("оба числа нечетные ");
            } else {
                if (a % 2 != 0) {
                    System.out.println("нечетное число " + a);
                } else if (b % 2 != 0) {
                    System.out.println("нечетное число " + b);
                }


            }
        }
    }
}