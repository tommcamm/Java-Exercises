package Esercizio3;

import java.util.Arrays;

public class Metodi {

    public static boolean controllaValiditaEspressione(String[] expression){
        boolean isValid = true;
        for(int i=0; i<expression.length; i++){

            if(expression[i].length() != 1){
                isValid = false;
                break;
            } else if(((i%2) == 0) && (((int) expression[i].charAt(0) < 48) || ((int) expression[i].charAt(0) > 57))){
                isValid = false;
                break;
            } else if (((i%2) != 0) && (((int) expression[i].charAt(0) != 43) && ((int) expression[i].charAt(0) != 45))){
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static int valutaOperando(String charToStr){
        return ((int) charToStr.charAt(0) - 48);
    }

    public static int valutaEspressione(String[] expression){
        int result = 0;
        boolean add = true;
        for(int i=0; i<expression.length; i++){
            if(((i%2) != 0) && ((int) expression[i].charAt(0) == 43)){
                add = true;
            } else if (((i%2) != 0) && ((int) expression[i].charAt(0) == 45)){
                add = false;
            }

            if(add && ((i%2) == 0)){
                result = result + valutaOperando(expression[i]);
            } else if ((i%2) == 0){
                result = result - valutaOperando(expression[i]);
            }
        }
        return result;
    }
}
