package home_work5.main;

import home_work5.service.EasySearch;
import home_work5.service.RegExSearch;
import home_work5.service.SearchEngineCaseInsensitive;
import home_work5.service.SearchEnginePunctuationNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchEngineCaseInsensitiveMain {
    public static void main(String[] args) {

        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        RegExSearch search1 = new RegExSearch();;
        SearchEngineCaseInsensitive decoratorSearch1 = new SearchEngineCaseInsensitive(search1);
        System.out.println("поиск RegExSearch --");

        Long count1 = decoratorSearch1.search(warAndPiece, "война");
        Long count2 = decoratorSearch1.search(warAndPiece, "и");
        Long count3 = decoratorSearch1.search(warAndPiece, "мир");
        System.out.println("Количество слов \"война\" - " + count1);
        System.out.println("Количество слов \"и\" - " + count2);
        System.out.println("Количество слов \"мир\" - " + count3);

        EasySearch search2 = new EasySearch();
        SearchEngineCaseInsensitive decoratorSearch2 = new SearchEngineCaseInsensitive(search2);
        System.out.println("поиск EasySearch --");

        Long count4 = decoratorSearch2.search(warAndPiece, "война");
        Long count5 = decoratorSearch2.search(warAndPiece, "и");
        Long count6 = decoratorSearch2.search(warAndPiece, "мир");
        System.out.println("Количество слов \"война\" - " + count4);
        System.out.println("Количество слов \"и\" - " + count5);
        System.out.println("Количество слов \"мир\" - " + count6);
    }
}
