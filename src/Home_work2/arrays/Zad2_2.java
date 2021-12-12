package Home_work2.arrays;

public class Zad2_2 {
    public static void main(String[] args) {
        printToConsole();
        printToConsoleTroughOne();
        printToConsoleRevers();

    }

    public static void printToConsole () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = 0;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);

        // while метод
        System.out.println( "while метод" );

        int j = 0;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }

        // foreach метод
        System.out.println( "foreach метод" );

        for (int l : arr
             ) {
            System.out.println(l);

        }

    }


    public static void printToConsoleTroughOne () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = 1;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i += 2;
        } while (i < arr.length);

        // while метод
        System.out.println( "while метод" );

        int j = 1;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j += 2;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = 1; k < arr.length; k += 2) {
            System.out.println(arr[k]);

        }

        // foreach метод , боюсь что в данном случае не применим



    }

    public static void printToConsoleRevers () {
        int [] arr = ArraysUtils.arrayFromConsole();
        int i = arr.length -1 ;

        // do ... while метод
        System.out.println( "do ... while метод" );

        do {
            System.out.println(arr[i]);
            i--;
        } while (i > -1);

        // while метод
        System.out.println( "while метод" );

        int j = arr.length - 1;
        while (j > -1) {
            System.out.println(arr[j]);
            j--;
        }

        // for метод
        System.out.println( "for метод" );

        for (int k = arr.length -1; k > -1; k--) {
            System.out.println(arr[k]);

        }

        // foreach метод не применим


    }

}
