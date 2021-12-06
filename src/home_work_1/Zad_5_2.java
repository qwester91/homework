package home_work_1;

import java.util.Objects;
import java.util.Scanner;

import static home_work_1.Zad_5_1.jdal;

public class Zad_5_2 {
    public static void main(String[] args) {
        System.out.println("Мне нужно имя! Напиши же его немедля!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();


        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет");
            jdal();

        } else if (Objects.equals(name, "Анастасия")){
            jdal();
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
