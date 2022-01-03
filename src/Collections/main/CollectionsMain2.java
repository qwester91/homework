package Collections.main;
//3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
// Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.
//4. Вывести средний возраст отфильтрованных студентов
//5. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
//6. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
//7. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.

import Collections.dto.Student;
import Collections.servise.CollectionComparator;
import Collections.servise.Collections1;
import Collections.servise.Filter;
import Collections.servise.comparators.AgeGradeComparator;
import Collections.servise.comparators.GradeComparator;
import Collections.servise.comparators.NameComparator;

import java.util.Comparator;
import java.util.List;

public class CollectionsMain2 {
    public static void main(String[] args) {
       Collections1 collection = new Collections1();
       List<Student> list =  collection.run();
        System.out.println();

        Filter sort = new Filter();
        List<Student> listSort = sort.Sort1(list);
        System.out.println("Отфильтрованный список : ");
        System.out.println(listSort);


    }
}
