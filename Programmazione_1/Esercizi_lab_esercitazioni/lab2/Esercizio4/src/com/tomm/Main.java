package com.tomm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String KbInput = "";
        Scanner scn = new Scanner(System.in);
        boolean error;

        try{
            do {
                error = false;

                System.out.print("\nInserimento: ");
                KbInput = scn.nextLine();

                if(KbInput.length() != 4){
                    System.out.println("Lunghezza non valida! (4 caratteri)");
                    error = true;
                }
                for(int i=0; KbInput.length()>i; i++){
                    if(!Character.isDigit(KbInput.charAt(i))){
                        System.out.println("Caratteri non validi! (solo numeri permessi)");
                        error = true;
                        break;
                    }
                }

            }while(error);

        }catch (InputMismatchException e){
            System.out.println("Input non valido!");
            System.exit(0);
        }

        System.out.println("Il numero corrispondente è: " + Integer.parseInt(KbInput));

    }
}
