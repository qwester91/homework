package home_work5.main;

import home_work5.service.RegExSearch;
import home_work5.service.SearchEngineCaseInsensitive;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите адрес папки с книжками пожалуйста");
        String folderPath = scanner.nextLine();
        File reader = new File(folderPath);

        System.out.println("Вот что удалось найти в вашей папке - " + reader.getName());

        File [] listfiles = reader.listFiles();
        for (File file : listfiles) {
            System.out.println(file.getName());
        }
        File creator = new File(reader.getName()+"\\result.txt");
        if (!creator.exists()){
            try {
                creator.createNewFile();
            } catch (IOException e) {
                System.out.println("не удалось создать файл result");
            }
        }


        System.out.println("Введите название файла, в котором вы хотите что-то искать");
        String nameFile = scanner.nextLine();
        String wordToSearch;
        Long count;
        SearchEngineCaseInsensitive search = new SearchEngineCaseInsensitive(
                new RegExSearch()
        );

        String text = null;
        try {
            Path pathToFile = Path.of(folderPath + "\\" + nameFile);
            text = Files.readString(pathToFile);
        } catch (IOException e) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }

        System.out.println("Введите слово для поиска");
        wordToSearch = scanner.nextLine();

        count = search.search(text, wordToSearch);
        FileWriter writer;
        try {
             writer = new FileWriter(creator.getName());
            writer.write("Имя файла - "+nameFile + ", слово для поиска -  " + wordToSearch + ", количество найденных слов - " + count);
        } catch (IOException e) {
            System.out.println("АШИПКА!!!");
        }


    }
}
