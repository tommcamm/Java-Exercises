package es1;

public class Metodi {

    public static int[] creaArray(){
        return new int[100];
    }

    public static boolean aggiungiElemento(int[] array, int elmNum, int numb){
        boolean status = true;
        for(int i=0; i<elmNum; i++){
            if(array[i] == numb){
                status = false;
                break;
            }
        }
        if(status){
            array[elmNum] = numb;
        }
        return status;
    }

    public static boolean rimuoviElemento(int[] array, int elmNum, int numb){
        int elPos = -1;

        for(int i=0; i<elmNum; i++){
            if(array[i] == numb){
                elPos = i;
                break;
            }
        }

        if(elPos >= 0){
            array[elPos] = 0;
            for(int i=elPos; i<elmNum; i++){
                array[i] = array[i+1];
            }
            return true;
        }else{
            return false;
        }   //ECLIPSE E MEGLIOOOO
    }
}

//INTELLIGEI CUUULOOOOOO
//
//  Con Affetto
//      Antonio ;)
