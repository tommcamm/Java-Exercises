package edu.tomm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Benvenuto al calcolo dell'indice IMC,\n Inserire il peso(usare'.' come virgola): ");
        double massa = scn.nextDouble();

        System.out.print("Inserire la altezza(in metri): ");
        double altezza = scn.nextDouble();

        double imc = massa/Math.pow(altezza, 2);

        if(imc<18.5){
            System.out.println("Sottopeso!");
        }else if((imc>=18.5) && (imc<25)){
            System.out.println("Peso normale!");
        }else if((imc>=25) && (imc<30)){
            System.out.println("Sovrappeso!");
        }else if(imc>=30){
            System.out.println("Obeso!");
        }
        System.out.println("imc = " + imc);
    }
}
