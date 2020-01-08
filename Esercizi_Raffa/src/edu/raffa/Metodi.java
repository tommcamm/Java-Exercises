package edu.raffa;

import java.util.Scanner;

public class Metodi {

public static int sceltaMenu(){
    Scanner tastiera = new Scanner(System.in);

    System.out.println("1 - Inserisci/cambia la parola chiave" + "\n" +
                       "2 - Cifra un messaggio" + "\n" + "3 - Decifra un messaggio" + "\n" +
                       "0 - Esci dal programma");

    int scelta = tastiera.nextInt();
return scelta;
}

public static String cambiaParolaChiave(){
    Scanner tastiera = new Scanner(System.in);
    boolean f = true;
    String chiave = " ";

    do{
        System.out.println("Specifica una parola chiave");
        chiave = tastiera.nextLine();

        for(int i = 0; i<chiave.length(); i++){
          if(((int)chiave.charAt(i) < 'a') || ((int)chiave.charAt(i) > 'z')){
              System.out.println("Errore lettere minuscole");
              f = false;
              i = chiave.length();
          }



        }
    }while(f == false);

    return chiave;


}

public static char creaMatrice(){
    char [][] Matrice = new char [25][25];

}





}