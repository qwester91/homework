package Collections.servise.comparators;

import Collections.dto.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int lengh1 = name1.length();
        int lengh2 = name2.length();
        int iter = 0;
        while (iter < lengh1 && iter < lengh2 && (name1.charAt(iter) - name2.charAt(iter) == 0)){
            iter++;
        }
        if (iter == lengh1 || iter == lengh2){
            return 0;
        }
        return name1.charAt(iter) - name2.charAt(iter);

//            if (name1.charAt(iter) > name2.charAt(iter)){
//                return 1;
//            }else if(name1.charAt(iter) < name2.charAt(iter)){
//                return -1;
//            }else{
//        while ((name1.charAt(iter) == name2.charAt(iter)) && iter < lengh1 && iter < lengh2 ){
//
//            if (name1.charAt(iter) > name2.charAt(iter)){
//                return 1;
//            }else if(name1.charAt(iter) < name2.charAt(iter)){
//                return -1;
//            }
//            iter++;
//        }}

        }

    }

