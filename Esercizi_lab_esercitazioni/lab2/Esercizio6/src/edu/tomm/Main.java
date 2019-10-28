package edu.tomm;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String input1 = "";
        String input2 = "";

        int a = 0;
        int b = 4;

        try{
            System.out.print("Inserisci prima stringa: ");
            input1 = scn.nextLine();
            System.out.print("\nInserisci seconda stringa: ");
            input2 = scn.nextLine();

            if((input1.length() != 5) || (input2.length() != 5)){
                System.out.println("Numero non corretto di caratteri!");
                System.exit(0);
            }
            for(int i=0; 4 >= i; i++){
                if((input1.charAt(i) != '+') && (input1.charAt(i) != '-')){
                    System.out.println("Nella prima stringa sono presenti caratteri non permessi");
                    System.exit(0);
                } else if ((input2.charAt(i) != '+') && (input2.charAt(i) != '-')){
                    System.out.println("Nella seconda stringa sono presenti caratteri non permessi");
                    System.exit(0);
                }
            }

        }catch (NoSuchElementException e){
            System.out.println("Errore di inserimento");
            System.exit(0);
        }

        for(int i=0; i < 5; i++){
            if(input1.charAt(i) == '+') a++;
            else a--;
            if(input2.charAt(i) == '+') b++;
            else b--;

            if(a==b){
                System.out.println("a e b si equivalgono! val= " + a );
                System.exit(0);
            }else{
                System.out.println("Valore di a= " + a + " ,Valore di b= " + b);
            }
        }

    }
}
