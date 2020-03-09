package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = 0;
        int s = 0;
        int max = 0, min = 0, prod = 0;
        boolean exit = true;


        do{
            System.out.print("Inserisci il primo numero (n): ");
            n = scn.nextInt();
        }while(n <= 0);

        do{
            System.out.print("Inserisci numero: ");
            s = scn.nextInt();
            exit = (s != n); //identico a dire se s == n allora exit = true -> exit = (s == n ? false : true)
            if((exit) && (s>0)){
                prod = (prod > 0 ?  prod*s : s);
                max = (s>max ? s : max); //Rimpiazzabile con Math.max()

                if(min == 0) min = s+1;
                min = (s<min ? s : min); //Rimpiazzabile con Math.min()
            }else if(s<=0) System.out.println("Valore inserito non valido");
        }while(exit);

        int sum = 0, cont = 0;
        double media;
        int i = max;
        int j = min;

        while(i<=prod){
            while(j<=max){
                sum += i+j;
                cont++;
                j++;
            }
            i++;
        }

        media = (double) sum / (double) cont;


        System.out.println("Prodotto: " + prod
        + "\nMin: " + min
        + "\nMax: " + max
        + "\nMedia: " + media);
    }
}
