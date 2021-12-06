package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class Zad_5_1 {
    public static void main(String[] args) {
        System.out.println("Мне нужно имя! Напиши же его немедля!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();


        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет");
            jdal();

        }
        if (Objects.equals(name, "Анастасия")) {
            jdal();
        }

        if (!(Objects.equals(name, "Анастасия") | Objects.equals(name, "Вася"))){
            System.out.println("Добрый день, а вы кто?");
        }

    }


    public static void jdal () {
        System.out.println("Я тебя так долго ждал");

    }
}
