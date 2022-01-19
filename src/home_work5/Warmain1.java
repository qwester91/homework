package home_work5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Warmain1 {
    public static void main(String[] args) {
        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
        System.out.println(warAndPiece);

       String[] arrWarAndPiece =  warAndPiece.split("[^А-яЁё]+");
        Set <String> setWarAndPiece = new HashSet<>();
        for (String s : arrWarAndPiece) {
            setWarAndPiece.add(s);
        }
        System.out.println("Использовано уникальных слов - " + setWarAndPiece.size());
        System.out.println(arrWarAndPiece.length);

    }
}
