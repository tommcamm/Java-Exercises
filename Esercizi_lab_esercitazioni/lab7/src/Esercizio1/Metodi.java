package Esercizio1;

import java.util.Random;

public class Metodi {

    public static int estraiNumeroCasuale(){
        return (int) (Math.random() * 100);
    }

    public static byte confrontaNumeri(int InsertedNum, int numToGuess){
        if(InsertedNum < numToGuess){
            return -1;
        } else if (InsertedNum > numToGuess){
            return 1;
        } else {
            return 0;
        }
    }

    public static void aggiornaInformazioniPartite(int numInd, boolean win, int tentativi, int i){


    }
}
