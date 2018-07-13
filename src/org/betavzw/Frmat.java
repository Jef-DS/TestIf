package org.betavzw;

import java.time.LocalDate;

public class Frmat {
    public static void main(String[] args) {
        int getal1 = 40;
        int getal2 = 2;
        int som = getal1 + getal2;
        String resultaat = String.format("%d + %d = %d", getal1, getal2, som);
        System.out.println(resultaat);
        LocalDate vandaag = LocalDate.now();
        int dag = vandaag.getDayOfMonth();
        int maand = vandaag.getMonthValue();
        int jaar = vandaag.getYear();
        String datum = String.format("%02d/%02d/%04d", dag, maand, jaar);
        System.out.println(datum);
    }
}
