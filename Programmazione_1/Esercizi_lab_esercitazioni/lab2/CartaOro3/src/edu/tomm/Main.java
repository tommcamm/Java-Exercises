package edu.tomm;

import java.util.Scanner;

//Programma NON completato, (Da terminare, con  test non ancora eseguiti)
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String KbInput = "", result = "";
        int m=0, n=0;
        boolean error;

        do{
            error = false;
            try{
                System.out.print("Inserisca una stringa di lettere minuscole: ");
                KbInput = scn.nextLine();

                System.out.print("Inserisca primo numero: ");
                m = Integer.parseInt(scn.nextLine());

                System.out.println("Inserisca secondo numero: ");
                n = Integer.parseInt(scn.nextLine());


                for (int i=0; KbInput.length() > i; i++){
                    if((KbInput.charAt(i) <  97) || (KbInput.charAt(i) > 122)){
                        System.out.println("Carattere inserito non valido!");
                        error = true;
                        break;
                    }
                }

                if((m > KbInput.length()-1) || (m < 0)){
                    System.out.println("Primo numero non compreso tra 0 e k-1!");
                    error = true;
                } else if((n > KbInput.length()-1) || (n < 0)){
                    System.out.println("Secondo numero non compreso tra 0 e k-1!");
                    error = true;
                }
            }catch(NumberFormatException e) {
                System.out.println("Non è stato inserito un numero");
            }
        }while(error);

        for(int i=0; true; i++){
            if(i==0){
                KbInput = KbInput.substring(0, m-1) + Character.toUpperCase(KbInput.charAt(m)) + KbInput.substring(m+1);
            } else{
                if(Character.isUpperCase(KbInput.charAt((m+(n*i))%KbInput.length()))){
                    System.out.println("Cambiando un carattere gia modificato, Terminando...");
                    break;
                }else{
                    KbInput = KbInput.substring(0, (((m+(n*i))%KbInput.length())-1)) + Character.toUpperCase(KbInput.charAt((m+(n*i))%KbInput.length())) + KbInput.substring(((m+(n*i))%KbInput.length())+1);
                }
            }

        }

        System.out.println("Risultato" + result);
    }
}
