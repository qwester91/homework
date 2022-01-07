package Hanoy.service;

import java.util.Scanner;

public class HanoyLogic {
    public static void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру! Чтобы начать, скажи, ты будешь играть сам или смотреть как все делают за тебя?");
        System.out.println("если сам - введи 1, если любишь смотреть - введи 2");
        int isManual = scan.nextInt();
        boolean isManualBool;
        switch (isManual){
            case 1:
                isManualBool = true;
                break;
            case 2:
                isManualBool = false;
                break;
            default:
                System.out.println("Я сожалею, но похоже, что твои пальчики не попали по нужным циферкам(((, будь другом" +
                        " - перезапусти игру и, в следующий раз, целься лучше!");
                return;

        }
        System.out.println("В общем Ханойские башни, да... введи количество колечек от 3 до 8");
        int countRings = scan.nextInt();
        if (countRings < 3 || countRings > 8 ){
            System.out.println("Я сожалею, но похоже, что твои пальчики не попали по нужным циферкам(((, будь другом" +
                    " - перезапусти игру и, в следующий раз, целься лучше!");
            return;
        }

        HanoyMethods hanoy = new HanoyMethods(countRings, isManualBool);
        int from;
        int to;
        boolean isMove;
        hanoy.getStartPlayingField();


            do{
                hanoy.print();
            System.out.println("с какой башенки снять колечко?");
            from = scan.nextInt();
            System.out.println("на какую башенку положить колечко?");
            to = scan.nextInt();
            if (!(from > 0 && from < 4 && to > 0 && to < 4)){
                System.out.println("Нету таких башенок! еще раз пробуй! ");
            }
           isMove= hanoy.move(from, to);
            if (!isMove){
                System.out.println("этот ход недопустим! Еще раз!");
            }
            }
            while (from > 0 && from < 4 && to > 0 && to < 4 && isMove && !hanoy.isWin());


       hanoy.print();
        System.out.println("Поздравляю! Ты выйграл всего за " + hanoy.getCountMoves()+ " ходов!");

    }

}
