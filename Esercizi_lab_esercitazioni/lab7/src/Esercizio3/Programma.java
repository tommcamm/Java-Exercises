package Esercizio3;

import java.util.Arrays;

public class Programma {
    public static void main(String[] args) {
        if(!Metodi.controllaValiditaEspressione(args)) {
            System.out.println("Errore: argomento non valido!");
        } else{
            System.out.println("Risultato operazione: " + Metodi.valutaEspressione(args));
        }
        // System.out.println(Arrays.toString(args)); Printo gli argomenti...
        // System.out.println((int) '+' + " " + (int) '-' + " " + (int) '0' + " " + (int) '9'); || +: 43 || -: 45 || 0->9: 48->57    (Codici unicode da annotare)
    }
}
