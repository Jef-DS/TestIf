package org.betavzw;

import java.util.Scanner;

public class HoofdLetterOnafhankelijk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een naam, 'Stop' om te stoppen: ");
        String naam = scanner.nextLine();
        while (!naam.toUpperCase().equals("STOP")){
            System.out.println("Dag " + naam);
            System.out.print("Geef een naam. 'Stop om te stoppen: ");
            naam = scanner.nextLine();
        }

    }

}
