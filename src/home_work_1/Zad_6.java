package home_work_1;

public class Zad_6 {
    public static void main(String[] args) {
        byte number [] = {9,4,5,3,5,6,4,3,4,1};
        System.out.println(createPhoneNumber(number));
    }
    public static String createPhoneNumber (byte[] numbers) {
        String format = "("+numbers[0]+ numbers[1] + numbers[2] +") " +numbers[3] + numbers[4]
                +numbers[5]+ "-"+numbers[6]+ numbers[7]+ numbers[8]+ numbers[9] ;
        return format ;
     }
}
