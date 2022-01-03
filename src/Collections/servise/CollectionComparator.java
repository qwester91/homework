package Collections.servise;

import Collections.dto.Student;
import oop.dto.figure.Shape;

import java.util.Comparator;
import java.util.List;

public class CollectionComparator {
    public List<Student> run(List<Student> students, Comparator<Student> comparator){

        students.sort(comparator);

        for (int i = 0; i < 10; i++) {
            System.out.println(students.get(i));
        }
        System.out.println();
        return students;

    }
}


