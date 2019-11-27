package esercizio2;

import java.util.Scanner;

//Ho dovuto usare sempre il metodo scn.nextLine per ovviare ad un problema durante le selezioni del menu successive
//alla prima.

public class Programma {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char sel;
        boolean cycle = true;
        int n1, n2;

        do{
            System.out.println("Benevenuto al programma stupido: " +
                    "\na) somma di due numeri interi" +
                    "\nb) divisione intera e resto tra due numeri interi" +
                    "\nc) media tra due numeri double" +
                    "\nd) valore assoluto di un numero intero" +
                    "\ne) lunghezza della stringa che rappresenta un numero intero" +
                    "\nt) termina il programma");
            sel = scn.nextLine().charAt(0);

            switch (sel){
                case 'a':
                    System.out.println("Inserisci due numeri: ");
                    System.out.println("Somma: " + Metodi.sommaDueInteri(Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine())));
                    break;
                case 'b':
                    System.out.print("Inserisci n1: " );
                    n1 = Integer.parseInt(scn.nextLine());
                    System.out.print("Inserisci n2: ");
                    n2 = Integer.parseInt(scn.nextLine());
                    if(n2==0){
                        System.out.println("sei stronzo");
                    }else{
                        System.out.println("Risultato divisione: " + Metodi.divisioneIntera(n1, n2));
                        System.out.println("Resto: " + Metodi.restoDivisioneIntera(n1, n2));
                    }
                    break;
                case 'c':
                    System.out.println("Inserisci due double: ");
                    System.out.println("Risultato double: " + Metodi.mediaTraDueDouble(Double.parseDouble(scn.nextLine()), Double.parseDouble(scn.nextLine())));
                    break;
                case 'd':
                    System.out.println("Inserisci un valore: ");
                    System.out.println("Il valore assoluto e': " + Metodi.valoreAssolutoIntero(Integer.parseInt(scn.nextLine())));
                    break;
                case 'e':
                    System.out.println("Inserisci un numero: ");
                    System.out.println("La stringa rapp. del numero e' lunga: " + Metodi.lunghezzaStringaIntero(Integer.parseInt(scn.nextLine())));
                    break;
                case 't':
                    System.out.println("Good bye!");
                    cycle = false;
                    break;
                default:
                    System.out.println("//SELEZIONE NON VALIDA//");
            }
        }while(cycle);
    }
}
