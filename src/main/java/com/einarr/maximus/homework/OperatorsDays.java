package com.einarr.maximus.homework;

public class OperatorsDays {

    public static void main(String[] args) {
        int s = 10;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        System.out.println(h + " часов, " + min + " минут, " + sec + " секунд");

        //Продолжите приведенный пример, добавьте расчет и вывод суток и недель

        int d = h % 24;
        int dni = (h - d) / 24;
        int w = dni % 7;
        int week = (dni - w) / 7;
        System.out.println(d + " часов, " + w + " дней, " + week + " недель");
    }
}
