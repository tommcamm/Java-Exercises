package es1;

public class Metodi {

    public static int[] creaArray(){
        return new int[100];
    }

    public static boolean aggiungiElemento(int[] array, int elmNum, int numb){
        for(int i=0; i<elmNum; i++) if(array[i] == numb) return false; //Lo so è la cosa più antipatica che esiste ;-)
        array[elmNum] = numb;
        return true;
    }

    public static boolean rimuoviElemento(int[] array, int elmNum, int numb){
        boolean isOk = false;

        for(int i=0; i<elmNum; i++){
            if(array[i] == numb){
                for(int ii=i; ii<elmNum; ii++){
                    array[ii] = array[i+1];
                }
                isOk = true;
                break;
            }
        }
        //ECLIPSE E MEGLIOOOO
        return isOk;
    }
}

//INTELLIGEI CUUULOOOOOO
//
//  Con Affetto
//      Antonio ;)
