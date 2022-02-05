package home_work5.main;

import home_work5.service.RegExSearch;
import home_work5.service.SearchEnginePunctuationNormalizer;
import home_work5.service.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchEnginePunctuationNormaliserMain {
    public static void main(String[] args) {

        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        ISearchEngine search1 = new RegExSearch();;
        SearchEnginePunctuationNormalizer decoratorSearch1 = new SearchEnginePunctuationNormalizer(search1);

        Long count1 = decoratorSearch1.search(warAndPiece, "война");
        Long count2 = decoratorSearch1.search(warAndPiece, "и");
        Long count3 = decoratorSearch1.search(warAndPiece, "мир");
        System.out.println("Количество слов \"война\" - " + count1);
        System.out.println("Количество слов \"и\" - " + count2);
        System.out.println("Количество слов \"мир\" - " + count3);
    }
}
