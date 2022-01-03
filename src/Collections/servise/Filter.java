package Collections.servise;
//3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
// Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.
//4. Вывести средний возраст отфильтрованных студентов
//5. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
//6. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
//7. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.

import Collections.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class Sort1 {
    public void Sort1(List<Student> list){
        int size = list.size();
        List<Student> listSorted1 = new ArrayList<>();
        int allAge = 0;
        for (Student student : list) {
            if (student.getAge() >= 12 && student.getGrade() >= 8){
                listSorted1.add(student);
                allAge += student.getAge();
                System.out.println(student);
            }
        }
        System.out.println("Средний возраст отфильтрованных студентов: " + allAge / listSorted1.size());
    }
}
