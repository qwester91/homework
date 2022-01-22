package home_work5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Warmain1 {
    public static void main(String[] args) {
        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
       // System.out.println(warAndPiece);

        Pattern p = Pattern.compile("\\w*[А-яЁё]*-?\\w*[А-яЁё]*");
        Matcher m = p.matcher(warAndPiece);
        Set <String> setWarAndPiece = new HashSet<>();
        int countFindWords = 0;

        while (m.find()){
            countFindWords++;
            setWarAndPiece.add(m.group());}


        System.out.println("Список уникальных слов" + setWarAndPiece.toString());
        System.out.println("Использовано уникальных слов - " + setWarAndPiece.size());
        System.out.println("Всего нашлось слов - " + countFindWords);


    }
}
