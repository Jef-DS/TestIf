package org.betavzw;

import java.util.Scanner;

public class Alfabetisch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord1 = scanner.nextLine();
        System.out.print("Geef een woord dat alfabetisch na dit woord komt: ");
        String woord2 = scanner.nextLine();
        while(woord1.compareTo(woord2) >= 0){
            System.out.println("\""+woord2 + "\" komt niet na \"" + woord1 + "\"");
            System.out.print("Geef een woord dat alfabetisch na dit woord komt: ");
            woord2 = scanner.nextLine();
        }

        System.out.println("Inderdaad, \"" + woord2 + "\" komt na \"" + woord1 + "\"");
    }

}
