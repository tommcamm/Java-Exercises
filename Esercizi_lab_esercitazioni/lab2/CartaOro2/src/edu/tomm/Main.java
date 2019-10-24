package edu.tomm;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String input1 = "";
        String input2 = "";
        boolean error;

        do {
            try {
                error = false;
                System.out.print("Inserisci prima stringa (minuscole): ");
                input1 = scn.nextLine();
                System.out.print("Inserisci la seconda stringa (maiuscole): ");
                input2 = scn.nextLine();

                for(int i=0; input1.length() > i; i++){
                    if(!((input1.charAt(i) >= 97) && (input1.charAt(i) <= 122))){
                        System.out.println("Prima stringa contiene caratteri non validi (solo minuscole)");
                        error = true;
                        break;
                    }
                }
                for(int i=0; input2.length() > i; i++){
                    if(!((input2.charAt(i) >= 65) && (input2.charAt(i) <= 90))){
                        System.out.println("Seconda stringa contiene caratteri non validi (solo maiuscole)");
                        error = true;
                        break;
                    }
                }

            }catch (NoSuchElementException e){
                System.out.println("Errore input stringa, ritenta...");
                error = true;
            }
        }while(error);

        for(int i=0; input1.length() > i; i++){
            for(int ii=0; input2.length() > ii; ii++){
                System.out.println("Coppia: <" + input1.charAt(i) + "," + input2.charAt(ii)  + ">");
            }
        }
    }
}
