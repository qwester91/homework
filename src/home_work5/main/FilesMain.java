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
        System.out.println("введите адрес папки с книжками, пожалуйста");
        String folderPath = scanner.nextLine();
        File reader = new File(folderPath);

        System.out.println("Вот что удалось найти в вашей папке - " + reader.getName());

        File [] listfiles = reader.listFiles();
        for (File file : listfiles) {
            System.out.println(file.getName());
        }
        File creator = new File(folderPath+"\\result.txt");


        if (creator.exists()) {
            creator.delete();
        }
        try {
            creator.createNewFile();
        } catch (IOException e) {
            System.out.println("не удалось создать файл result");
        }


        boolean work = true;
        String nameFile = null;
        while(work){
            System.out.println("Введите название файла, в котором вы хотите что-то искать, если хотите выйти - введите 1 ");
            nameFile = scanner.nextLine();
            String wordToSearch;
            Long count;
            SearchEngineCaseInsensitive search = new SearchEngineCaseInsensitive(
                    new RegExSearch()
            );
            if (nameFile.equals("1")){
                return;
            }

            String text = null;
            try {
                Path pathToFile = Path.of(folderPath + "\\" + nameFile);
                text = Files.readString(pathToFile);
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла");
                continue;
            }

            System.out.println("Введите слово для поиска");
            wordToSearch = scanner.nextLine();

            count = search.search(text, wordToSearch);
            FileWriter writer;
            String textLog;

            try {
                Path pathToFileLog = Path.of(folderPath + "\\result.txt");
                textLog = Files.readString(pathToFileLog);

                writer = new FileWriter(folderPath + "\\result.txt");
                writer.append(textLog + "\nИмя файла - ["+nameFile + "], слово для поиска - [" + wordToSearch + "], количество найденных слов - " + count);
                writer.close();
            } catch (IOException e) {
                System.out.println("АШИПКА ЛОГИРОВАНИЯ!!!");
            }
        }
    }
}
