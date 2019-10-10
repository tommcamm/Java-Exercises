import java.util.Scanner;
import java.util.InputMismatchException;

//During this exercise I cannot use OOP as is outside the scope of the course

public class EqSecondoGrado{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        Integer valA = 0;
        Integer valB = 0;
        Integer valC = 0;

        Integer numer1 = 0;
        Integer denom = 0;
        Integer numer2 = 0;

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
        scn.close();

        Integer discriminante = (int) Math.pow(valB, 2) - (4*valA*valC);
        denom = 2*valA;

        if (discriminante < 0){
            System.out.println("Discriminante negativo!");
        } else if(discriminante == 0){
            if((-valB%denom) == 0){
                System.out.println("x (discriminante = 0) = " + -valB/denom  );
            } else {
                System.out.println("x (discriminante = 0) = " + -valB + "/" + denom);
            }
        }else{
            if((Math.sqrt(discriminante) - Math.floor(Math.sqrt(discriminante))) == 0){
                discriminante = (int) Math.sqrt(discriminante);

                numer1 = -valB + discriminante;

                numer2 = -valB - discriminante;

                if((numer1%denom) == 0){
                    System.out.println("x1 = " + numer1/denom);
                }else{
                    System.out.println("x1 = " + numer1 + "/" + denom);
                }

                if((numer2%denom) == 0){
                    System.out.println("x2 = " + numer2/denom);
                }else{
                    System.out.println("x2 = " + numer1 + "/" + denom);
                }
                    
            }else{
                System.out.println("x1 = " + -valB + "+sqrt(" + discriminante + ")/" + denom);
                System.out.println("x2 = " + -valB + "-sqrt(" + discriminante + ")/" + denom);
            }
        }

    }
}