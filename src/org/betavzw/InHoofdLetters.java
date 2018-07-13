package org.betavzw;

import java.util.Scanner;

public class InHoofdLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String tekst = scanner.nextLine();
        while (tekst.length() < 8) {
            System.out.print("Kieken, ik zei minstens 8. Opnieuw: ");
            tekst = scanner.nextLine();
        }
        String tekstInHoofdLetters = tekst.toUpperCase();
        System.out.println("De tekst in hoofdletters is \""+ tekstInHoofdLetters + "\"");
    }

}
