package home_work5.main;

import home_work5.service.EasySearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EasySearchMain {
    public static void main(String[] args) {
        String str = "012345678901234567890123456789012012012";
        EasySearch search = new EasySearch();
        Long count = search.search(str, "012");
        System.out.println(count);

        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        EasySearch search1 = new EasySearch();

        count = search1.search(warAndPiece, "война");
        System.out.println(count);
    }
}
