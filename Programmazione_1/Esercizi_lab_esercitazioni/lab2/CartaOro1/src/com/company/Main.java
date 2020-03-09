package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        String espressione = "";
        Integer chiave;
        HashMap<Integer, Integer> mappa = new HashMap<>();
        ArrayList<Integer> numeri = new ArrayList<>();
        boolean errorLevel;
        AtomicReference<Integer> risultato = new AtomicReference<>(0);
        AtomicReference<Boolean> primo = new AtomicReference<>(true);

        try{

            do{
                chiave = 0;
                errorLevel = false;
                espressione = scn.nextLine();

                for(int i=0; espressione.length() > i; i++){

                    if(espressione.charAt(i) == '+'){
                        mappa.put(chiave, 1);
                        chiave++;
                    }   else if(espressione.charAt(i) == '-'){
                        mappa.put(chiave, 0);
                        chiave++;
                    } else if(!Character.isDigit(espressione.charAt(i))){
                        System.out.println("errore! ritenta e sarai piú fortunato");
                        errorLevel = true;
                    }
                }

            }while(errorLevel);

        }catch (java.util.InputMismatchException e){
            System.out.println("Carattere illegare...");
            System.exit(0);
        }

        String[] espressioneSplit = espressione.split("[+\\-]");
        for(int i=0; espressioneSplit.length > i; i++){
            numeri.add(Integer.valueOf(espressioneSplit[i]));
        }

        mappa.forEach((k, v) -> {
            if(primo.get()){
                if(v == 1){
                    risultato.set(numeri.get(k) + numeri.get(k + 1));
                } else {
                    risultato.set(numeri.get(k) - numeri.get(k+1));
                }
                primo.set(false);
            }else {
                if(v == 1){
                    risultato.set(risultato.get() + numeri.get(k+1));
                } else {
                    risultato.set(risultato.get() - numeri.get(k+1));
                }
            }
        });



        System.out.println(risultato);


    }
}
