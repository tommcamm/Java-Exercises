package esercizio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean cycle = true;
        char selezione;

        do{
            selezione = menu();

            switch (selezione){
                case 'a':
                    System.out.print("Inserisci Temperatura in Fahrenheit: ");
                    System.out.println("Corrispettivo Celsius: " + convertiFinC(Double.parseDouble(scn.nextLine())));
                    break;
                case 'b':
                    System.out.print("Inserisci Temperatura in Celsius: ");
                    System.out.println("Corrispettivo in Fahrenheit: " + convertiCinF(Double.parseDouble(scn.nextLine())));
                    break;
                case 't':
                    System.out.println("Good Bye!");
                    cycle = false;
                default:
                    System.out.println("Selezione Errata!");
            }
        }while(cycle);
    }
    public static char menu(){
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Selezione: " +
                "\na) Fahrenheit -> Celsius" +
                "\nb) Celsius -> Fahrenheit" +
                "\nt) Termina");
        return scn2.nextLine().charAt(0);
    }

    public static double convertiFinC(double tempF){
        return ((tempF - 32) / 1.8);
    }

    public static double convertiCinF(double tempC){
        return ((1.8*tempC) + 32);
    }
}
