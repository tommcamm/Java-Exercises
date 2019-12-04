package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stringa;
        char carattere;

        System.out.print("Inserisci stringa: ");
        stringa = scn.nextLine();

        System.out.print("Inserisci carattere: ");
        carattere = scn.nextLine().charAt(0);

        if(cercaCarattere(stringa, carattere)){
            System.out.println("Risultato senza " + carattere + " e': " + rimuoviCarattere(stringa, carattere));
        }else{
            System.out.println("Risultato: " + stringa);
        }

    }


    public static boolean cercaCarattere(String str, char c){
        return str.contains(Character.toString(c));
    }

    public static String rimuoviCarattere(String str, char c){
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != c){
                result = result + str.charAt(i);
            }
        }
        return  result;
    }

}
