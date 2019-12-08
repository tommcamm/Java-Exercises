package Esercizio4;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        int righe, colonne;
        int[][] matrix;
        Scanner scn = new Scanner(System.in);

        System.out.print("Inserisci il numero di righe: ");
        righe = scn.nextInt();

        System.out.print("Inserisci il numero di colonne: ");
        colonne = scn.nextInt();
        matrix = Metodi.generaMatriceCasuale(righe, colonne);

        System.out.println("Matrice non trasposta: ");
        Metodi.stampaMatrice(matrix); //Osservo la matrice 1
        System.out.println("\nMatrice trasposta: ");
        Metodi.stampaMatrice(Metodi.trasponiMatrice(matrix));
    }
}
