package edu.tomm;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    /*
    Lezione sui metodi:
    intestazione:: public static void saluta() {
    Corpo :: ...
    }
    nota1: i metodi possono essere messi prima o dopo il main (non come il C/C++)
    nota2: Nel caso di uso di un metodo in una classe non instanziata sará necessario l'uso dell'attributo static
    nota3: Divisione e altri metodi si trovano in una altra classe, l'invocazione è possibile mediante il static
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inserisci Operatore 1 ed operatore 2: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println("Addizione: " + addizione(num1, num2) +
                "\nDivisione: " + StaticMethods.divisione(num1, num2));
    }

    private static int addizione(int op1, int op2){
        return op1+op2;
    }
}