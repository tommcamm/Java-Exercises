import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ProblemaUno{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int hours = 0;
        int minutes = 0;
        long seconds = 0;
        double distance = 0;

        try{
            //Chiedo all'utente il tempo
            System.out.print("Ciao Stronzo, inserisci le ore: ");
            hours = scn.nextInt();

            System.out.print("\nOra i minuti: ");
            minutes = scn.nextInt();

            do{
                System.out.print("\nOra i secondi: ");
                seconds = scn.nextLong();
            }while(second < 61);


            System.out.print("\nInserisci la distanza: ");
            distance = scn.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Secondo te il tempo o la distanza si misura con lettere???");
        }catch(Exception e){
            System.out.println("Errore fatale, stacktrace: ");
            e.printStackTrace();
        }

        seconds = hours * 60*60 + minutes * 60 + seconds;

        double rithm = seconds / distance; //Ritmo in secondi al KM
        double minRithm = rithm/60; //Minuti al km (senza secondi)
        double secRithm = rithm%60; // secondi al km (tolti i minuti)
        
        System.out.println("Ritmo in secondi al KM" + rithm);
        System.out.println("Minuti: " + minRithm + " Secondi: " + secRithm);


    }
}