package com.tomm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int selNum = 0;
        StringBuilder result = new StringBuilder();
        Scanner scn = new Scanner(System.in);
        boolean error;

        do{
            error = false;
            try{

                System.out.print("\nInserisci un numero tra 0 e 127: ");
                selNum = Integer.parseInt(scn.nextLine()); //Workaround per evitare un loop nel caso di carattere non numerico

                if((selNum < 0) || (selNum > 127)){
                    System.out.println("Numero non compreso tra 0 e 127!");
                    error = true;
                }

            }catch (InputMismatchException e){
                System.out.println("Carattere inserito non valido!");
                error = true;
            }catch (NumberFormatException e){
                System.out.println("Carattere inserito non numerico!");
                error = true;
            }

        }while(error);
        //Per fare in fretta si potrebbe direttamente usare Integer.toBinaryString();

        for(int i=0; i < 7; i++){

            if(selNum%2 == 0){
                result.append("0");
            }else{
                result.append("1");
            }

            selNum = selNum/2;
        }

        //Il corrispettivo binario viene generato dal ciclo while al contrario!, per questo è fondamentale girare il risultato.
        System.out.println("Il risultato è: " + result.reverse());
    }
}
