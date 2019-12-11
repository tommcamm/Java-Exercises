package teoria;

public class Ricorsione {

    /*
        La idea è che si arriva ad un caso base, e chiamo ricorsivamente lo stesso metodo finché non termina
        il problema.
        il caso base è quando non devo piú chiamare ricorsivamente il metodo.

        Grazie alla ricorsione si crea uno stack, FILO, il controllo arrivato al caso base torna indietro.

        Se la ricorsione è illimitata, Java ad un certo punto dara un errore StackOveflow, avendo terminato lo
        spazio di memoria.
     */

    public static void main(String[] args) {
        contoAllaRovescia(5); // Chiamo conto alla rovescia per 5 volte
    }

    public static void contoAllaRovescia(int n){
        // Nei metodi ricorsivi c'é sempre una espressione condizionale che differenzia il caso base con quello passo
        if(n==0){
            System.out.println("0 (Terminato)"); // Caso base (finale), termina la ricorsione
        }else{
            System.out.println(n); // Caso passo, richiama se stesso diminuendo n ricorsivamente
            contoAllaRovescia(n-1);
        }
    }
}   
