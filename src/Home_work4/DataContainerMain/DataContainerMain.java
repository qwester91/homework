package Home_work4.DataContainerMain;

import Home_work4.DataContainer.DataContainer;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        String[] data = {";lkj;l",";lkj",null,null,"hjkll"};
        DataContainer<String> container = new DataContainer<>(data);

//        container.add("привет");
//        container.add("меня");
//        container.add("зовут");
//        container.add("Дмитрий");
//
//        System.out.println(Arrays.toString(container.getItems()));
//
//        System.out.println();
//        System.out.println(container.get(3));
//        System.out.println(container.get(4));
//
//        container.delete(0);
//        container.delete("дмитрий");
//        System.out.println();
//        System.out.println(Arrays.toString(container.getItems()));
//
//        container.delete(0);
//        container.delete("Дмитрий");
//        System.out.println();
//        System.out.println(Arrays.toString(container.getItems()));
//        container.delete(0);
//
//
////        int index1 = container.add("Привет");
////        int index2 = container.add("Как дела");
////        int index3 = container.add("Работаю");
////        int index4 = container.add("Давай потом");
////        String text1 = container.get(index1);
////        String text2 = container.get(index2);
////        String text3 = container.get(index3);
////        String text4 = container.get(index4);
////        System.out.println(text1); //Привет
////        System.out.println(text2); //Как дела
////        System.out.println(text3); //Работаю
////        System.out.println(text4); //Давай потом
////        container.delete(text1);
////        System.out.println(container.get(index1)); //Как дела
//        container.add("перед");
//        container.add(null);
//        container.add("перед");
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container);
    }
}
