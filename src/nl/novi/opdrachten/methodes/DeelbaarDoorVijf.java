package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void devidedByFive (int chosenNumber) {
        if (chosenNumber % 5 == 0) {
            System.out.println("Dit getal is deelbaar door vijf.");
        } else {
            System.out.println("Dit getal is niet deelbaar door vijf.");
        }
    }

    public static void main(String[] sammieKijkOmhoog) {


        Scanner input = new Scanner(System.in);
        System.out.println("Geef een nummer op: ");
        int chosenNumber = input.nextInt();

        devidedByFive(chosenNumber);
    }
}
