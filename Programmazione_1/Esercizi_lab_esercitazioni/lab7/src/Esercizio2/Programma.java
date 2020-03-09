package Esercizio2;

import java.util.Arrays;
import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean cycle = true;
        boolean win;
        char currentLetter;
        int tentativi;
        char[] solutionWord;
        char[] result;

        do{
            //Inizializzazione pre partita
            win = true;
            tentativi = 0;
            solutionWord = Metodi.estraiStringaCasuale().toCharArray();
            result = new char[solutionWord.length];
            Arrays.fill(result, '-'); // Sto riempendo l'array con - (con questo metodo evito di usare un for)

            do{
                System.out.print("\nInserisci lettera: ");
                currentLetter = scn.nextLine().charAt(0);
                Metodi.scopriLettera(solutionWord, result, currentLetter);
                Metodi.stampaLettereIndovinate(result);

                win = true;
                for (char c : result) {
                    if (c == '-') {
                        win = false;
                        break;
                    }
                }
                if(win) break;


                tentativi++;
            }while(tentativi < 20);

            if(win){
                System.out.println("\nHai vinto!\n" +
                        "Numero di tentativi: " + (tentativi + 1));
            }else{
                System.out.println("Hai perso...\n" +
                        "La parola era: " + Arrays.toString(solutionWord)); //Arrays.toString sempre per evitare un for per stampare il risultato
            }

            System.out.println("Partita terminata, vuoi farne una altra?[y/n] ");
            if(scn.nextLine().charAt(0) != 'y'){
                System.out.println("Good bye!");
                cycle = false;
            }
        }while(cycle);
    }
}
