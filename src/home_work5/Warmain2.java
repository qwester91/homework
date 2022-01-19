package home_work5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Warmain2 {
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
        Map<String, Integer> mapWarAndPiece = new HashMap<>();
        Integer count = 0;
        for (String s : arrWarAndPiece) {

            if(mapWarAndPiece.containsKey(s)){
               count =  mapWarAndPiece.get(s) +1;
               mapWarAndPiece.put(s, count);
            }else {
                mapWarAndPiece.put(s, 1);
            }
        }
        List <Map.Entry<String,Integer>> listMap = new LinkedList<>();
        listMap.addAll(mapWarAndPiece.entrySet());

        for (int i = 1; i < listMap.size(); i++) {
            listMap.get(i).getValue().compareTo(listMap.get(i-1).getValue());
        }

        System.out.println("Использовано уникальных слов - " + setWarAndPiece.size());
        System.out.println(arrWarAndPiece.length);

    }
}
