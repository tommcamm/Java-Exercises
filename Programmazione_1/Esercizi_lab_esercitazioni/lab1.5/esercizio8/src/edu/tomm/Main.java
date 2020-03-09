package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero = 0;
        int risultato = 0;

        do{
            try {
                numero = Integer.parseInt(scn.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Inserito un non numero!");
            }
        }while(numero<=0);

        for(int i=1; numero>=i;i++) {
            risultato = risultato + (int) Math.pow(i, 2);
        }

        System.out.println("Il risultato è: " + risultato);
    }
}
