import java.util.Scanner;

public class Modulo{

    //Calcolo del modulo di un numero (Lez. 9 Ott.)
    public static void main(String[] args){

        System.out.print("Benvenuto nel calcolatore del modulo,\n inserisci il primo numero: ");
        Scanner scn = new Scanner(System.in);

        double firstDoub = scn.nextDouble();

        System.out.print("\nSecondo numero: ");
        double seondDoub = scn.nextDouble();

        System.out.println("\nIl modulo è: " + firstDoub % secondDoub); 
    }   
}