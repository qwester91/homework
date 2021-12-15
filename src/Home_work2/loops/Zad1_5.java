package Home_work2.loops;
 // 1.5. Вывести таблицу умножения в консоль.
public class Zad1_5 {
    public static void main(String[] args) {
        for (int i = 2; i < 11; i++) {
            for (int j = 2; j < 6; j++){
                System.out.print(j + "*" + i + "=" + i * j + "\t");

            }
            System.out.println();

        }
        System.out.println();


        for (int i = 2; i < 11; i++) {
            for (int j = 6; j < 10; j++){
                System.out.print(j + "*" + i + "=" + i * j + "\t");

            }
            System.out.println();

        }

    }
}
