package Home_work2.arrays;

import Home_work2.utils.ArraysUtils;

//2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
//        2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
//        2.3.2. WhileOperation - во всех методах можно использовать только while
//        2.3.3. ForOperation - во всех методах можно использовать только for
//        2.3.4. ForEachOperation - во всех методах можно использовать только foreach
public interface IArraysOperation {
    int[] arr = ArraysUtils.arrayFromConsole();

    void printToConsole ();
    void printToConsoleTroughOne ();
    void printToConsoleRevers ();


}

class DoWhileOperation implements IArraysOperation {



    @Override
    public void printToConsole() {
        System.out.println("Печатаем массив в консоль");
        int i = 0;

        do {
            System.out.print(arr[i]);
            i++;
        } while (i < arr.length);
    }


    @Override
    public void printToConsoleTroughOne() {
        System.out.println("Выводим каждый второй");

        int i = 1;
        do {
            System.out.println(arr[i]);
            i += 2;
        } while (i < arr.length);

    }

    @Override
    public void printToConsoleRevers() {

        System.out.println("Обратный порядок");

        int i = arr.length - 1;

        do {
            System.out.println(arr[i]);
            i--;
        } while (i > -1);

    }

    class WhileOperation implements IArraysOperation{

        @Override
        public void printToConsole() {
            System.out.println("Печатаем массив в консоль");

            int j = 0;
            while (j < arr.length) {
                System.out.println(arr[j]);
                j++;
            }


        }

        @Override
        public void printToConsoleTroughOne() {
            System.out.println("Выводим каждый второй");

            int j = 1;

            while (j < arr.length) {
                System.out.println(arr[j]);
                j += 2;
            }

        }

        @Override
        public void printToConsoleRevers() {
            System.out.println("Обратный порядок");
            int j = arr.length - 1;
            while (j > -1) {
                System.out.println(arr[j]);
                j--;
            }

        }
    }

    class ForOperation implements IArraysOperation{

        @Override
        public void printToConsole() {
            System.out.println("Печатаем массив в консоль");

            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k]);

            }

        }

        @Override
        public void printToConsoleTroughOne() {
            System.out.println("Выводим каждый второй");
            for (int k = 1; k < arr.length; k += 2) {
                System.out.println(arr[k]);

            }

        }

        @Override
        public void printToConsoleRevers() {
            System.out.println("Обратный порядок");
            for (int k = arr.length -1; k > -1; k--) {
                System.out.println(arr[k]);

            }

        }
    }
    class ForEachOperation implements IArraysOperation{

        @Override
        public void printToConsole() {
            System.out.println("Печатаем массив в консоль");
            for (int l : arr) {
                System.out.println(l);

            }


        }

        @Override
        public void printToConsoleTroughOne() {
            System.out.println("Выводим каждый второй");
            int m = 0;

            for (int l : arr) {

                if (m % 2 != 0) {
                    System.out.println(l);
                }
                m++;
            }
        }

        @Override
        public void printToConsoleRevers() {
            System.out.println("Обратный порядок");

            int n = arr.length-1;

            int [] array = new int [arr.length];
            for (int l : arr) {

                array [n] = l;
                System.out.println(array[n]);
                n--;

            }

        }
    }

    public static void main(String[] args) {
        DoWhileOperation doWhile = new DoWhileOperation();
        doWhile.printToConsole();
        doWhile.printToConsoleRevers();
        doWhile.printToConsoleTroughOne();
    }
}
