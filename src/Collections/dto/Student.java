package Collections.dto;
//1. Создать класс Student с полями
//	1.1 Порядковый номер (int)
//	1.2 Имя (Строка размером от 3 до 10 русских символов)
//	1.3 возраст (7-17)
//	1.4 оценка(0.0-10.0)
//	1.5 признак участия в олимпиадах (bool).

public class Student {
    private int number;
    private String name;
    private int age;
    private double grade;
    private boolean isOlympic;

    public Student(int number,String name, int age,double grade ,boolean isOlympic ){
        this.number = number;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isOlympic = isOlympic;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isOlympic() {
        return isOlympic;
    }

    public void setOlympic(boolean olympic) {
        isOlympic = olympic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", isOlympic=" + isOlympic +
                '}';
    }
}
