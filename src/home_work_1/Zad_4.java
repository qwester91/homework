package home_work_1;

public class Zad_4 {
    public static void main(String[] args) {

        boolean weekday = true;
        boolean vakation = true;
       if (sleepIn(weekday, vakation)) {
           System.out.println("дальше спи");


       }   else System.out.println("работать иди");
    }

    public static boolean sleepIn ( boolean a,boolean b){
            boolean c;
        c = (!a | b);
            return c;
    }



}




