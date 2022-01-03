package Collections.servise;

import Collections.dto.Student;
import Collections.servise.RandomString1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.
//	2.1 Заполнять имя рандомными русскими символами
//	2.2* Заполнять имя рандомными понятными именами
//	2.3** Заполнять имя рандомными понятными именами загруженными из файла.
public class Collections1 {
    public List run() {

        List<Student> list = new ArrayList<>(10_000);
        Random rnd = new Random();
        for (int i = 0; i < 10_000; i++) {
            list.add(new Student(i, RandomString1.getRandomString(3 + rnd.nextInt(8)), 7 + rnd.nextInt(11), rnd.nextDouble() * 10.0, rnd.nextBoolean()));
            System.out.println(list.get(i));
        }
        return list;
    }
}
