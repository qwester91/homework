package Collections.servise.comparators;

import Collections.dto.Student;

import java.util.Comparator;

public class AgeGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        double grade1 = o1.getGrade();
        double grade2 = o2.getGrade();
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        if (Integer.compare(age2,age1) == 0) {
            return Double.compare(grade2, grade1);
        }
        return Integer.compare(age2,age1);
    }

}

