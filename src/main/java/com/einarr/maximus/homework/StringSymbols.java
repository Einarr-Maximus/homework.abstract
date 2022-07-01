package com.einarr.maximus.homework;

public class StringSymbols {
    public static void main(String[] args) {

        /*
        Ввести строку и подсчитать количество запятых в ней
        */

        String s = " Цели  никогда не должны быть простыми. Они должны быть неудобными, чтобы заставить вас работать.";
        int n = 0;
        int p = 0;
        while (p != -1) {
            p = s.indexOf(',', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        System.out.println("We have " + n + " commas");

        /*
        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
        */
        int m = 0;
        char[] marks = {'.', ',', ':', ';', '?', '!', '-', ' '};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < marks.length; j++) {
                if (s.charAt(i) == marks[j])
                    m++;
            }
        }
        System.out.println("We have " + m + " punctuation marks.");
    }
}
