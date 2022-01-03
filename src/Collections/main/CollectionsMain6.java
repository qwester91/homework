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

import java.util.Comparator;
import java.util.List;

public class CollectionsMain6 {
    public static void main(String[] args) {
       Collections1 collection = new Collections1();
       List<Student> list =  collection.run();
        System.out.println();

        Filter sort = new Filter();
        List<Student> listSort = sort.Sort1(list);



        Comparator<Student> comparator2 = new AgeGradeComparator();
        CollectionComparator serv2 = new CollectionComparator();
        List<Student> listSort1 = serv2.run(listSort, comparator2);
        int size = listSort1.size();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;



        for (int i = 1; i < size; i++) {
            if (listSort1.get(i).getAge() != listSort1.get(i-1).getAge() ){
                if(a1 == 0){
                    a1 = i;
                } else if(a2 == 0){
                    a2 = i;
                } else if (a3 == 0){
                    a3 = i;
                } else if (a4 == 0){
                    a4 = i;
                } else if (a5 == 0){
                    a5 = i;
                }


            }
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        print(listSort1, 0);
        print(listSort1, a1);
        print(listSort1, a2);
        print(listSort1, a3);
        print(listSort1, a4);
        print(listSort1, a5);




    }
    public static void print(List<Student> listSort1, int a){
        System.out.println();

        for (int i = a; i <a+10 ; i++) {
            System.out.println(listSort1.get(i));
        }
    }
}
