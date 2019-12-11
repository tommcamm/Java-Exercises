package es1;

import java.util.Scanner;

public class Programma {

    public static void main(String[] args) {
        int elmNumb = 0;
        int[] array = Metodi.creaArray();
        boolean cycle = true;

        Scanner scn = new Scanner(System.in);

        do{
            System.out.println("-MENU-\n" +
                    "1 - Aggiungi elemento\n" +
                    "2 - Elimina elemento\n" +
                    "0 - Esci");

            switch (scn.nextLine().charAt(0)){
                case '1':
                    System.out.print("Inserisci elemento: ");
                    if(Metodi.aggiungiElemento(array, elmNumb, Integer.parseInt(scn.nextLine()))){
                        elmNumb++;
                    }else{
                        System.out.println("Elemento giá presente!");
                    }
                    break;
                case '2':
                    System.out.print("Elimina elemento: ");
                    if(Metodi.rimuoviElemento(array, elmNumb, Integer.parseInt(scn.nextLine()))){
                        elmNumb--;
                    }else {
                        System.out.println("Elemento non presente!");
                    }
                    break;
                case'0':
                    System.out.println("Bye!");
                    cycle = false;
                    break;
                default:
                    System.out.println("Selezione errata...");
            }
        }while(cycle);
    }
}
