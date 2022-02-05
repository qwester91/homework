package home_work5.service.runners;

import home_work5.service.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.Callable;

public class Job implements Callable {
   private final File file;
   private final String wordToSearch;
   private final ISearchEngine engine;

    public Job(File file, String wordToSearch, ISearchEngine engine) {
        this.file = file;
        this.wordToSearch = wordToSearch;
        this.engine = engine;
    }

    @Override
    public String call() {

        String text = null;
        try {
            text = Files.readString(file.toPath());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
         return "Ошибка чтения файла";
        }
        Long count = engine.search(text, wordToSearch);

         return ("\nИмя файла - [" + file.getName() + "], слово для поиска - [" + wordToSearch + "], количество найденных слов - " + count);
    }

}
