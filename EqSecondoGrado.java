import java.util.Scanner;

public class EqSecondoGrado{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int valA = 0;
        int valB = 0;
        int valC = 0;

        try{
            System.out.print("\nInserisci a(x^2): ");
            valA = scn.nextInt();

            System.out.print("\nInserisci b(x): ");
            valB = scn.nextInt();

            System.out.print("\nInserisci c: ");
            valC = scn.nextInt();                       

        }catch(InputMismatchException e){
            System.out.println("Errore inserimento valori!");
        }

    }
}