package home_work5.main;

import home_work5.service.EasySearch;
import home_work5.service.RegExSearch;
import home_work5.service.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegExSearchMain {
    public static void main(String[] args) {


        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        ISearchEngine search1 = new RegExSearch(true);
        Long count1 =search1.search(warAndPiece, "война");
        Long count2 =search1.search(warAndPiece, "и");
        Long count3 =search1.search(warAndPiece, "мир");
        System.out.println("Количество слов \"война\" - " + count1);
        System.out.println("Количество слов \"и\" - " + count2);
        System.out.println("Количество слов \"мир\" - " + count3);

    }
}
