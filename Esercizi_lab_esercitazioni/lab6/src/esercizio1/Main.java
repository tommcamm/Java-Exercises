package esercizio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean cycle = true;
        String result = "";
        String finalResult = "";
        int tnum, spaces = 0;

        do{
            System.out.print("Inserisci un numero:(Positivo) ");
            tnum = scn.nextInt();

            if(tnum<0){
                System.out.println("Hai inserito un numero minore-uguale a 0!");
            } else if (tnum == 0){
                cycle = false;
            }
            else {
                result = aggiornaStringa(tnum, result);
            }
        }while(cycle);

        for (int i=0; i<result.length(); i++){
            if(result.charAt(i) == ' '){
                spaces++;
                System.out.print(",");
            }else if((spaces % 2) == 0){
                System.out.print(result.charAt(i));
            }
        }
    }

    public static String aggiornaStringa(int num, String str){
        return str + ' ' + num;
    }
}
