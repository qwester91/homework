package home_work_1;

import java.util.Scanner;

import static home_work_1.Zad_5_1.jdal;

public class Zad_5_3 {
    public static void main(String[] args) {
        System.out.println("Мне нужно имя! Напиши же его немедля!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет");
                jdal();
                break;
            case "Анастасия":
                jdal();
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }

    }
}