import java.util.InputMismatchException;
import java.util.Scanner;

//Relativo al file CARTA ORO su e-learning unimib.

public class estremoSuperiore{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        double eps = 0;
        double n = 0;
        double res = 0;

        do{
            System.out.print("Inserisci Epsilon (0<x<1): ");
            try{
                eps = scn.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Carattere o numero inserito non corretto!");
                System.exit(0);
            }
        }while((eps <= 0) || (eps >= 1));
        scn.close();

        while((1-eps) > res){
            res = n/(n+1);
            n++;
        }

        System.out.println("Risultato (n che soddisfa): " + (int) n);
    }
}