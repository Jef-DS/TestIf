package org.betavzw;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate datum = LocalDate.now();
        int dag = datum.getDayOfMonth();
        int maand = datum.getMonthValue();
        int jaar = datum.getYear();
        String resultaat = String.format("%02d/%02d/%10d",
                dag, maand, jaar);
        System.out.println(resultaat);
    }
}
