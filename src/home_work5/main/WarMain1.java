package home_work5.main;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
//		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
//		текстовый файл и поместить текст из данного текстового файла в строку. Далее данную строку необходимо обработать
//		таким образом чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить в Set.
//		Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов который был использован при
//		написании данного текста. В конце выводим в консоль количество использованных слов.
public class WarMain1 {
    public static void main(String[] args) {
        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Ввели неверный адрес");
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
       // System.out.println(warAndPiece);

        Pattern p = Pattern.compile("[0-9a-zA-ZА-яЁё]+-?[0-9a-zA-ZА-яЁё]*");
        Matcher m = p.matcher(warAndPiece);
        Set <String> setWarAndPiece = new HashSet<>();
        int countFindWords = 0;

        while (m.find()){
            countFindWords++;
            setWarAndPiece.add(m.group());}


        System.out.println("Список уникальных слов" + setWarAndPiece);
        System.out.println("Использовано уникальных слов - " + setWarAndPiece.size());
        System.out.println("Всего нашлось слов - " + countFindWords);


    }
}
