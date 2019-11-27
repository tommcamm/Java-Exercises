package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mese = 0;
        int anno = 0;
        boolean error, bisestile = false;

        Scanner scn = new Scanner(System.in);

        do{
            error = false;
            try{
                System.out.println("Inserisci mese: ");
                mese = Integer.parseInt(scn.nextLine());

                System.out.println("Inserisci anno: ");
                anno = Integer.parseInt(scn.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Non hai inserito un numero!");
                error = true;
            }
            if((mese < 1) || (mese > 12)){
                System.out.println("Mese non valido!");
                error = true;
            }else if((anno < 1900) || (anno > 2099)){
                System.out.println("Anno non valido");
                error = true;
            }
        }while(error);

        if(((anno % 4) == 1) && ((anno % 100) != 1)){
            bisestile = true;
        }
        if((mese == 2) && bisestile){
            System.out.println("29 giorni!");
        } else if(mese ==2){
            System.out.println("28 giorni!");
        } else if((mese == 11) || (mese == 4) || (mese == 6) || (mese == 9)){
            System.out.println("30 giorni!");
        } else {
            System.out.println("31 giorni!");
        }
    }
}
