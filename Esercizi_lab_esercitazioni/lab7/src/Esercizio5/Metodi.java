package Esercizio5;

import java.util.Scanner;

public class Metodi {
    public static char sceltaMenu(){
        Scanner scn1 = new Scanner(System.in);

        System.out.println("-MENU-\n" +
                "1 - Inserisci/cambia la parola chiave\n" +
                "2 - Cifra un messaggio\n" +
                "3 - Decifra un messaggio\n" +
                "0 - Esci dal programma");
        return scn1.nextLine().charAt(0);
    }

    public static String cambiaParolaChiave(String key){
        for(int i=0; i<key.length(); i++){
            if(((int) key.charAt(i) < 97) || ((int) key.charAt(i) > 122)){
                System.out.println("Parola chiave non valida!");
                key = "";
                break;
            }
        }
        return key;
    }

    public static char[][] creaMatrice(){
        char[][] matrix = new char[26][26];
        int charLevel = 97; // Carattere inziale
        int charRow = 0; // Offset dei caratteri per ogni riga

        for(int i=0; i<matrix.length; i++){
            for(int ii=0; ii<matrix[0].length; ii++){
                if(charLevel > 122) charLevel = 97;
                matrix[i][ii] = (char) charLevel;
                charLevel++;
            }
            charRow++;
            charLevel = 97 + charRow;
        }
        return matrix;
    }

    public static char cifraLettera(char toC, char key){
        char[][] matrix = creaMatrice();
        return matrix[((int) toC) - 97][((int) key) - 97];
    }

    public static char decifraLettera(char toD, char key){
        char[][] matrix = creaMatrice();
        char result = 'a';

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][((int) key) - 97] == (int) toD){
                result = matrix[i][0];
                break;
            }
        }
        return result;
    }

    public static String cifraMessaggio(String toC, String key){
        String result = "";
        int k = 0;
        for(int i=0; i<toC.length(); i++){
            if(k>=key.length()){
                k = 0;
            }
            result = result + cifraLettera(toC.charAt(i), key.charAt(k));
            k++;
        }
        return result;
    }

    public static String decifraMessaggio(String toD, String key){
        String result = "";
        int k=0;
        for(int i=0; i<toD.length(); i++){
            if(k>=key.length()){
                k = 0;
            }
            result = result + decifraLettera(toD.charAt(i), key.charAt(k));
            k++;
        }
        return result;
    }


}
