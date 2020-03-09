package edu.tomm;

import java.util.Scanner;

public class Programma {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m, n;
        System.out.print("Inserisci dimensione matrice[M]: ");
        m = scn.nextInt();
        System.out.print("Inserisci dimensione matrice[N]: ");
        n = scn.nextInt();

        double[][] dati = Metodi.InizializzaDati(m, n);

        System.out.println("Matrice di dati generata: ");
        for (double[] doubles : dati) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }

    }
}
