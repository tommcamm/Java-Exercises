import java.util.Scanner;
public class esercizio5{
  public static void main(String[] args) {
    int x,y;
    Scanner scn = new Scanner(System.in);

    System.out.println("Inserisci x: ");
    x = scn.nextInt();
    System.out.println("Inserisci y: ");
    y = scn.nextInt();

    System.out.println("Lato 1 = " + x + " ,Lato 2 = " + y +
                       "\nArea = " + (x*y));
  }
}
