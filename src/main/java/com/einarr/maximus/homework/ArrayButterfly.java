package com.einarr.maximus.homework;

public class ArrayButterfly {

    public static void main(String[] args) {


        /* Создать двухмерный квадратный массив и заполнить его "бабочкой" */

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < i || j >= array[i].length - i)
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > i || j < array[i].length - 1 - i)
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
