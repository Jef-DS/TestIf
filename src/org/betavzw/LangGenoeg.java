package org.betavzw;

import java.util.Scanner;

public class LangGenoeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een tekst van minstens 8 karaketers: ");
        String tekst = scanner.nextLine();
        boolean isDommeGebruiker = false;
        while (tekst.length() < 8){
            System.out.print("Kieken, ik zei minstens 8. Opnieuw: ");
            tekst = scanner.nextLine();
            isDommeGebruiker = true;
        }
        if (! isDommeGebruiker) {
            System.out.println("Je tekst is " + tekst);
        }else {
            System.out.println("Eindelijk. De tekst is " + tekst);
        }
    }

}
