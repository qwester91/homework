package Hanoy.service;

import java.util.Arrays;

public class HanoyMethods {

    private int[][] playingField;
    private int countMoves = 0;
    private boolean isManual = true;
    private int countRings;


    public HanoyMethods(int countRings, boolean isManual){
        this.playingField = new int[3][countRings];
        this.isManual = isManual;
        this.countRings = countRings;
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

    public int getCountMoves() {
        return countMoves;
    }

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
    }
    public boolean isWin(){
        boolean isWin = false;
        for (int i = 1; i < 3; i++) {
            if(playingField[i][0] == 1){
                isWin = true;
            }
        }
        return isWin;
    }


    public boolean move(int from, int to){
        int[][] arr = playingField;

       boolean isMove = false;
       int ringDiam = 0;
        for (int i = 0; i < countRings; i++) {
            if(arr[from-1][i] != 0){
                ringDiam = arr[from-1][i];
                arr[from-1][i] = 0;
                break;
            }
        }
        if(arr[to-1][countRings-1] == 0){
            arr[to-1][countRings-1] = ringDiam;
            isMove = true;

        }else{
            for (int i = 0; i < countRings; i++) {
                if (arr[to-1][i] != 0 && arr[to-1][i] > ringDiam) {
                 arr[to-1][i - 1] = ringDiam;
                isMove = true;

                break;
                }
            }
        }
        if (isMove){
            countMoves++;
            this.playingField = arr;
        }

        return isMove;

    }
    
}
