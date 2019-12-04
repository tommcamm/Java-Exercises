package Esercizio1;

import java.util.Scanner;

public class Programma {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean cycle = true, win;
        int randomNum;
        int selNum;
        int numMin, numMax;
        int tentativi;
        int counter = 1;

        do{
            System.out.println("Inizio partita!");
            randomNum = Metodi.estraiNumeroCasuale();
            tentativi = 0;
            numMin = 0;
            numMax = 100;
            win = false;
            do{
                System.out.print("Che numero è? ");
                selNum = Integer.parseInt(scn.nextLine());

                if(Metodi.confrontaNumeri(selNum, randomNum) == 1){
                    if(selNum >= numMax){
                        System.out.println("Il numero " + selNum + " é troppo grosso!, ti ho giá detto che " + numMax + " é piu grande...");
                    } else {
                        System.out.println("Il numero " + selNum + " é troppo grande!");
                        numMax = selNum;
                    }
                } else if (Metodi.confrontaNumeri(selNum, randomNum) == -1){
                    if(selNum <= numMin){
                        System.out.println("Il numero " + selNum + " é troppo piccolo!, ti ho giá detto che " + numMin + " é piu piccolo...");
                    }else{
                        System.out.println("Il numero " + selNum + " é troppo piccolo!");
                        numMin = selNum;
                    }
                } else if (Metodi.confrontaNumeri(selNum, randomNum) == 0){
                    win = true;
                    break;
                }

                tentativi++;
            }while(tentativi < 10);

            if(win){
                System.out.println("hai vinto!!, hai usato " + (tentativi+1) + " tentativi");
            }else{
                System.out.println("non hai vinto...");
            }
            System.out.println("Analytics: \n" +
                    "Numero da indovinare ["+randomNum+"]\n");

            System.out.println("Vuoi fare una altra partita[y/n]? ");
            if(scn.nextLine().charAt(0) != 'y'){
                System.out.println("good bye!");
                cycle = false;
            }

            //TODO: Missing last part of exercise (take note of the last 5 matches)
            counter++;
        }while(cycle);
    }
}
