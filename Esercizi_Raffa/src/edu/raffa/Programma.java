package edu.raffa;
import java.util.Scanner;

public class Programma {

    public static void main(String[] args) {


     Scanner tastiera = new Scanner(System.in);
     String chiave = " ";
     String scelta1 = " ";
     String scelta2 = "si";
     boolean cond = true;
     int x = 5;

     do {
         x = Metodi.sceltaMenu();

         switch (x) {
             case 1:
                 if (cond == true) {
                     System.out.println("Inserisci la parola chiave");
                     chiave = tastiera.nextLine();
                     cond = false;
                 } else if (cond == false) {
                     System.out.println("Vuoi cambiare la parola chiave?");
                     scelta1 = tastiera.nextLine();
                     if (scelta1.equalsIgnoreCase(scelta2)) {
                         System.out.println("Ok che parola vuoi usare?");
                         chiave = tastiera.nextLine();
                     }

                 }
                 break;

             case 2:

         }
     }while((x == 1) || (x == 2) || (x == 3));




    }


}
