package Collections.servise;

import java.util.Random;

public class RandomString1 {
    public static String getRandomString(int length){
        String str="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(33);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
