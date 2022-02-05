package home_work5.service;

import home_work5.service.runners.Job;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsService {
    public void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите адрес папки с книжками, пожалуйста");
        String folderPath = scanner.nextLine();
        File reader = new File(folderPath);

        File[] listAllfiles = reader.listFiles();
        List<File> listfiles = new ArrayList<>();

        for (File file : listAllfiles) {
            if (file.getName().endsWith(".txt")){
                listfiles.add(file);
            }
        }

        File creator = new File(folderPath + "\\result.txt");


        if (creator.exists()) {
            creator.delete();
        }
        try {
            creator.createNewFile();
        } catch (IOException e) {
            System.out.println("не удалось создать файл result");
            return;
        }
        boolean work = true;
        String nameFile = null;
        ExecutorService threads = Executors.newFixedThreadPool(5);
        String wordToSearch;
        FileWriter writer = null;
        List<Future<String>> futures = new ArrayList<>();
        SearchEngineCaseInsensitive search = new SearchEngineCaseInsensitive(
                new RegExSearch());

        try {
            writer = new FileWriter(folderPath + "\\result.txt");
        } catch (IOException e) {
            System.out.println("Ошибка с логом, прастити");
            return;
        }
        while (work) {
            System.out.println("Введите слово для поиска, если хотите выйти - нажмите Enter");
            wordToSearch = scanner.nextLine();
            if (wordToSearch.equals("")) {
                break;
            }

            for (File listfile : listfiles) {


                futures.add(threads.submit(new Job(listfile, wordToSearch, search)));

            }
        }
        threads.shutdown();
        String textLog;
        try {
            Path pathToFileLog = Path.of(folderPath + "\\result.txt");
            textLog = Files.readString(pathToFileLog);
            for (Future<String> future : futures) {
                writer.append(future.get());
            }
            writer.flush();
            writer.close();
        } catch(InterruptedException e){
            System.out.println("ошибка в потоках");
            return;
        } catch(ExecutionException e){
            System.out.println("ошибка");
            return;
        }catch(IOException e){
            System.out.println("АШИПКА ЛОГИРОВАНИЯ!!!");
            return;

        }
    }
}


