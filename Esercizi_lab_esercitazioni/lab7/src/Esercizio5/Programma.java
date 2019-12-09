package Esercizio5;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        boolean cycle = true;
        String key = "";
        char[][] matrix = Metodi.creaMatrice();

        Scanner scn = new Scanner(System.in);


        do{
            switch (Metodi.sceltaMenu()){
                case '1':
                    //Cambia parola chiave
                    System.out.print("Inserisci parola chiave: ");
                    key = Metodi.cambiaParolaChiave(scn.nextLine());
                    break;
                case '2':
                    //Cifra il messaggio
                    if(key.equals("")){
                        System.out.println("Chiave non impostata!");
                    } else {
                        System.out.print("Messaggio da cifrare: ");
                        System.out.println("Messaggio cifrato: " + Metodi.cifraMessaggio(scn.nextLine(), key));
                    }
                    break;
                case '3':
                    //Decifra il messaggio
                    if(key.equals("")){
                        System.out.println("Chiave non impostata!");
                    } else {
                        System.out.print("Messaggio da decifrare: ");
                        System.out.println("Messaggio decifrato: " + Metodi.decifraMessaggio(scn.nextLine(), key));
                    }
                    break;
                case '0':
                    System.out.println("Bye!");
                    cycle = false;
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        }while(cycle);
    }
}
