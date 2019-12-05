package Esercizio2;

public class Metodi {

    public static String estraiStringaCasuale(){
        String[] words = {"telolo", "alberto", "orologio", "esplosione"};
        return words[(int) (Math.random()*4)];
    }

    public static void scopriLettera(char[] solution, char[] result, char answer){
        char lastchar = ' ';
        for(int i = 0; i<solution.length; i++){
            if((solution[i] == answer) && (solution[i] != result[i])){
                if(lastchar != result[i]){
                    System.out.println("Trovata nuova lettera " + answer + "!"); // Evitiamo ripetizioni quando ha trovato la lettera
                    lastchar = result[i];
                }
                result[i] = solution[i];
            } else if ((solution[i] == answer) && (solution[i] == result[i])){
                System.out.println("Lettera " + answer + " già trovata!" );
                break;
            }
        }
    }

    public static void stampaLettereIndovinate(char[] result){
        for (char c : result) {  // Questo è una versione particolare di ciclo for chiamato foreach... (si potrebbe usare tranquillamente un for classico), oppure il metodo Array.toString [usato dopo]
            System.out.print(c);
        }
    }
}
