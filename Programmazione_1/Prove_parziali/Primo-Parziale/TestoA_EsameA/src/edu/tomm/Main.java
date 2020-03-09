package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int sum = 0, min = 0, max = 0, crr;
        boolean exitcond = true;

        do {
            System.out.print("Inserisci un  numero (0 per terminare): ");
            crr = scn.nextInt();
            if(min == 0) min = crr;

            if(crr>0){
                sum = crr + sum;
                if(crr<min) min = crr;
                if(crr>max) max = crr;
            }else if(crr==0){
                exitcond = false;
            }
        } while (exitcond);

        int somma = 0;
        int contatore = 0;
        int j;

        for(int i=max;i<=sum;i++){
            j = min;
            while(j <= min){
                somma += i*j;
                contatore++;
                j++;
            }
        }

        double media = (double) somma / contatore;

        System.out.println("Somma totale: " + sum
        + "\nMinimo: " + min
        + "\nMassimo: " + max
        +  "\nMedia: " + media);


    }
}
