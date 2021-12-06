package home_work_1;

import java.util.Scanner;

public class Zad_7 {
    public static void main(String[] args) {
        System.out.println("Цыферьку введите в диапазоне от -128 до 127");
        Scanner in = new Scanner(System.in);
        byte numberIn = in.nextByte();
        System.out.println(toBinaryString(numberIn));

    }
    public static String toBinaryString(byte number){
        byte[] binar = new byte[8];
        String toBinary = "";
        if (number >= 0 ) {
            for (byte i = 0; i < 8; i++) {
                binar[i] = (byte) (number % 2);
                number = (byte) (number / 2);
            }

        } else {
            number = (byte) (number * (-1) -1);
            for (byte i = 0; i < 8; i++) {
                binar[i] = (byte) (1- (number % 2));
                number = (byte) (number / 2);
            }


        }
        toBinary = toBinary + binar[7] +  binar[6]+ binar[5]+binar[4]+binar[3]+ binar[2]+binar[1]+binar[0];
        return toBinary;
    }
}
