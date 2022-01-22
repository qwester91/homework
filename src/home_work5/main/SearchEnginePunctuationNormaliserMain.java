package home_work5.main;

import home_work5.service.RegExSearch;
import home_work5.service.SearchEnginePunctuationNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchEnginePunctuationNormaliserMain {
    public static void main(String[] args) {
        String str = "012345678901234567890123456789012012012";
        RegExSearch search = new RegExSearch();
        SearchEnginePunctuationNormalizer decoratorSearch = new SearchEnginePunctuationNormalizer(search);
        Long count = decoratorSearch.search(str, "012");
        System.out.println(count);

        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        RegExSearch search1 = new RegExSearch();;
        SearchEnginePunctuationNormalizer decoratorSearch1 = new SearchEnginePunctuationNormalizer(search1);

        Long count1 = decoratorSearch1.search(warAndPiece, "война");
        Long count2 = decoratorSearch1.search(warAndPiece, "и");
        Long count3 = decoratorSearch1.search(warAndPiece, "мир");
        System.out.println("Количество слов \"война\" - " + count1);
        System.out.println("Количество слов \"и\" - " + count2);
        System.out.println("Количество слов \"мир\" - " + count3);
    }
}
