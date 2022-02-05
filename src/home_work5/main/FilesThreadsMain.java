package home_work5.main;

import home_work5.service.RegExSearch;
import home_work5.service.SearchEngineCaseInsensitive;
import home_work5.service.ThreadsService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesThreadsMain {
    public static void main(String[] args){
        ThreadsService service = new ThreadsService();
        service.run();

    }
}
