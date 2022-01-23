package home_work5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
//	Отсортировать по количеству. Распечатать в консоль.
//		Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
//		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
//		текстовый файл  и поместить текст из данного текстового файла в строку.  Далее данную строку необходимо обработать
//		таким образом чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить как ключ в Map,
//		 а количество повторений в тексте ставить как значение. Для того чтобы это работало вам необходимо постоянно
//		 проверять наличие ключа в Map, и если нужный нам ключ уже присутсвует в нашей коллекции то мы должны увеличить
//		 уже имеющееся значение в коллекции на еденицу. После наполнения данной коллекции мы получим набор слов и их
//		 количество в тексте. Далее нам нужно придумать как отсортировать получившуюся коллекцию но к сожалению
//		 непосредственно эту коллекцию отсортировать не получится, придётся создавать для этого List и наполнять лист
//		  Entry из Map. В итоге из получившегося отсортированного набора данных вывести первые N записей.

public class WarMain2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String warAndPiece = null;
        try {
            Path reader = Path.of("Война и мир_книга.txt");
            warAndPiece = Files.readString(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Ввели неверный адрес");
        }catch (IOException e){
            System.out.println("Какая-то ошибка");
        }
      //  System.out.println(warAndPiece);
        Pattern p = Pattern.compile("[0-9a-zA-ZА-яЁё]+-?[0-9a-zA-ZА-яЁё]*");
        Matcher m = p.matcher(warAndPiece);
        Map<String, Integer> mapWarAndPiece = new HashMap<>();
        int count;
        String word;
       while (m.find()){
           count = 0;
           word = m.group();
           if(mapWarAndPiece.containsKey(word)){
               count =  mapWarAndPiece.get(word) +1;
               mapWarAndPiece.put(word, count);
           }else {
               mapWarAndPiece.put(word, 1);
           }
       }

        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(mapWarAndPiece.entrySet());

       sort(listMap);

        System.out.println("введите топ сколько слов вы хотите увидеть?");
        int countTop = console.nextInt();

        for (int i = 0; i < countTop; i++) {
            System.out.println("" + (i + 1) +". "+ listMap.get(i));
        }
    }


    public static void sort (List<Map.Entry<String, Integer>> listMap){
        Map.Entry<String, Integer> buffer ;
        boolean stop;
        int size = listMap.size();
        for (int i = 0; i < size; i++) {
            stop = false;
            for (int j = 1; j < size - i; j++) {

                if (listMap.get(j-1).getValue().compareTo(listMap.get(j).getValue()) < 0){

                    buffer = listMap.get(j);
                    listMap.set(j, listMap.get(j - 1));
                    listMap.set(j - 1,buffer);
                    stop = true;
                }
            }
            if (!stop) {
                break;
            }
        }
    }
}
