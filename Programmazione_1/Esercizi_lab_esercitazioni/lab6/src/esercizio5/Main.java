package esercizio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char selezione;
        boolean cycle = true;

        do{
            selezione = menu();

            switch (selezione){
                case 'a':
                    System.out.println("Inserisci un numero decimale: ");
                    System.out.println("Il corrispettivo binario e': " + convertiDecInBin(Integer.parseInt(scn.nextLine())));
                    break;
                case 'b':
                    System.out.println("Inserisci un numero binario: ");
                    System.out.println("Il corrispettivo decimale e': " + convertiBinDec(Integer.parseInt(scn.nextLine())));
                    break;
                case 't':
                    System.out.println("Good Bye!");
                    cycle = false;
                    break;
                default:
                    System.out.println("//SELEZIONE ERRATA//");
            }

        }while(cycle);
    }

    public static char menu(){
        Scanner scn2 = new Scanner(System.in);

        System.out.println("Selezione: " +
                "\na) Decimale -> Binario " +
                "\nb) Binario  -> Decimale" +
                "\nt) Termina");
        return scn2.nextLine().charAt(0);
    }

    public static String convertiDecInBin(int numDec){
        StringBuilder result = new StringBuilder();
        while(numDec != 0){
            if((numDec % 2) == 0){
                result.append(0);
            } else {
                result.append(1);
            }
            numDec = numDec / 2;
        }
        return result.reverse().toString();
    }

    public static int convertiBinDec(int numBin){
        String numStrBin = String.valueOf(numBin);
        int result = 0;
        int counter = 0;

        for(int i=numStrBin.length(); i>0; i--){
            if(numStrBin.charAt(i-1) == '1'){
                result = result + (int) Math.pow(2, counter);
            }
            counter++;
        }

        return result;
    }
}
