package Hanoy.service;

import java.util.Arrays;

public class HanoyMethods {

    private int[][] playingField;
    private int countMoves = 0;
    private int countRings;

    /**
     * Дефолтный конструктор, инициализирует игру с 8 кольцами
     */
    public HanoyMethods() {
        this.playingField = new int[3][8];
        this.countRings = 8;
    }

    /**
     * не дефолтный конструктор. инициализирует игру с переданным в конструктор количеством колец
     * @param countRings
     */
    public HanoyMethods(int countRings){
        this.playingField = new int[3][countRings];
        this.countRings = countRings;
    }

    /**
     * счетчик ходов. При вызове добавляет еденичку к countMoves
     */
    public void plusCountMoves() {
        countMoves++;
    }


    /**
     * создаем стартовое игровое поле
     * @return массив playingField
     */
    public int[][] getStartPlayingField() {
        for (int i = 0; i < playingField[0].length; i++) {
            playingField[0][i] = i+1;
            playingField[1][i] = 0;
            playingField[2][i] = 0;
        }
        return playingField;
    }


    /**
     * геттер количества ходов
     * @return
     */
    public int getCountMoves() {
        return countMoves;
    }

    /**
     * метод распечатывает текущее игровое поле(поле в текущем состоянии) преобразует цифры массива в псевдографику
     * (идею подсмотрел у Сергея, поклон ему))P.S. только идею, реализацию не смотрел .
     */
    public void print(){
        String[][]star = new String[3][countRings];

        for (int i = 0; i < countRings; i++) {
            for (int j = 0; j < 3; j++) {
                switch (playingField[j][i]){
                    case 0:
                        star [j][i] = "        |        ";
                        break;
                    case 1:
                        star [j][i] = "       █|█       ";
                        break;
                    case 2:
                        star [j][i] = "      ██|██      ";
                        break;
                    case 3:
                        star [j][i] = "     ███|███     ";
                        break;
                    case 4:
                        star [j][i] = "    ████|████    ";
                        break;
                    case 5:
                        star [j][i] = "   █████|█████   ";
                        break;
                    case 6:
                        star [j][i] = "  ██████|██████  ";
                        break;
                    case 7:
                        star [j][i] = " ███████|███████ ";
                        break;
                    case 8:
                        star [j][i] = "████████|████████";
                        break;
                }
                System.out.print( star[j][i]+ "\t");
            }
            System.out.println();
        }
        System.out.println("        1        "+"\t"+"        2        "+"\t"+"        3        ");
    }


    /**
     * метод проверяет выйграли ли мы. как условие выйгрыша проверяется наличие самого маленького колечка на вершине
     * (на самой верхней позиции) любого столбика кроме стартового
     * @return true в случае победы. false во всех других случаях
     */
    public boolean isWin(){
        boolean isWin = false;
        for (int i = 1; i < 3; i++) {
            if(playingField[i][0] == 1){
                isWin = true;
            }
        }
        return isWin;
    }

    /**
     * основной метод игры. передвигает колечко с одного столбика на другой, внутри есть проверка на невозможность хода,
     * нет проверки входных параметров на корректность, передовать нужно четко то что нужно.
     * (это для того чтобы метод был более универсальным, и была возможность вывода разных сообщений при невозможности хода и
     * при вводе некорректных параметров. печатать сообщения из движка не хочу.)
     *
     * @param from число от 1 до 3, с какого столбика снять кольцо
     * @param to число от 1 до 3, на какой столбик положить кольцо
     * @return true, если ход был совершен. False если данный ход недопустим.
     */
    public boolean move(int from, int to){
        int[][] arr = playingField;
        int e = 0;
        int k = 0;

        boolean isMove = false;
        int ringDiam = 0;
        for (int i = 0; i < countRings; i++) {
            if(arr[from-1][i] != 0){
                ringDiam = arr[from-1][i];
                e = from-1;
                k = i;
                // arr[from-1][i] = 0;
                break;
            }
        }
        if (ringDiam == 0 || from == to){
            plusCountMoves();
            return isMove;
        }
        if(arr[to-1][countRings-1] == 0){
            arr[to-1][countRings-1] = ringDiam;
            isMove = true;

        }else{
            for (int i = 0; i < countRings; i++) {
                if (arr[to-1][i] != 0 && arr[to-1][i] > ringDiam && arr[to-1][i-1] == 0) {
                    arr[to-1][i-1] = ringDiam;
                    isMove = true;

                    break;
                }
            }
        }
        if (isMove){
            arr[e][k] = 0;
            this.playingField = arr;
        }
        plusCountMoves();

        return isMove;

    }

}
