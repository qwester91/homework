package Collections.servise.comparators;

import Collections.dto.Student;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        double grade1 = o1.getGrade();
        double grade2 = o2.getGrade();



        return Double.compare(grade2,grade1);

        }

    }

