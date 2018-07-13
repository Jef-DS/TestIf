package org.betavzw;

import java.util.Scanner;

public class Tafelvan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = 42;
        double waarde = Math.PI;
        String naam = "Joske";
        String resultaat = String.format("%d %.4f %s",
                getal, waarde, naam);
        System.out.println(resultaat);
        System.out.printf("%d %.4f %s\n",
                getal, waarde,naam);
    }
}
