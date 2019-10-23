import java.util.InputMismatchException;
import java.util.Scanner;

//Relativo al file CARTA ORO su e-learning unimib.

public class successioneDefinita{
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = 0;
        int i = 1;
        int result = 2;

        System.out.println("==Successione definita di un numero==");
        System.out.print("Inserisca un numero naturale(>0): ");
        try{
            n = scn.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Numero o Carattere inserito non valido!");
            System.exit(0);
        }
        scn.close();

        while(i <= n){
            result = 3*result-2;
            i++;
        }
        System.out.println("Il risultato è: " + result);
    }
}