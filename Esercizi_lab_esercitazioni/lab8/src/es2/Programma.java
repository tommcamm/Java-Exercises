package es2;

public class Programma {

    // Args: row, column, movement
    // Easy win args: 3 5 ssseeeee
    public static void main(String[] args) {
        int[][] world = Metodi.creaMondo();

        if(Metodi.aggiungiObiettivo(world, Integer.parseInt(args[0]), Integer.parseInt(args[1]))){
            for(int i=0; i<10; i++) Metodi.aggiungiOstacolo(world);
            int result = Metodi.aggiungiPosizioniRobot(world, args[2]);
            if(result == 1){
                System.out.println("Obiettivo Raggiunto!");
            }else if(result == 2){
                System.out.println("Ostacolo incontrato...");
            }else if(result == 3){
                System.out.println("Si è cercato di uscire dalla matrice...");
            }else if(result == 0){
                System.out.println("Obiettivo non raggiunto...");
            }
            Metodi.stampaMondo(world);
        } else {
            System.out.println("Posizione obiettivo non corretta!");
        }



    }
}
