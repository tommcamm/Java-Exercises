package es2;

public class Metodi {
    public static int[][] creaMondo(){
        return new int[20][20];
    }

    public static boolean aggiungiObiettivo(int[][] world, int row, int column){
        if((row > 19) || (column > 19) || (row <= 0) || (column <= 0)){
            return false;
        } else {
            world[row][column] = 1;
            return true;
        }
    }

    public static void aggiungiOstacolo(int[][] world){
        int row, column;
        while(true){
            row = (int) (Math.random()*19);
            column = (int) (Math.random()*19);
            if(world[row][column] == 0){
                world[row][column] = 2;
                break;
            }
        }
    }

    public static int aggiungiPosizioniRobot(int[][] world, String path){
        int currRow = 0, currColumn = 0;
        world[currColumn][currRow] = 3;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'n') currRow--;
            if(path.charAt(i) == 's') currRow++;
            if(path.charAt(i) == 'e') currColumn++;
            if(path.charAt(i) == 'o') currColumn--;

            if((currRow < 0) || (currColumn < 0) || (currRow > 19) || (currColumn > 19)) return 3;
            if (world[currRow][currColumn] == 2) return 2;
            if (world[currRow][currColumn] == 1) return 1;

            world[currRow][currColumn] = 3;
        }
        return 0;
    }

    public static void stampaMondo(int[][] world){
        System.out.println("**********************");
        for(int i=0; i<world.length; i++){
            System.out.print("*");
            for(int ii=0; ii<world[0].length; ii++){
                if(world[i][ii] == 1) System.out.print("X");
                else if(world[i][ii] == 2) System.out.print("#");
                else if(world[i][ii] == 3) System.out.print("O");
                else System.out.print(" ");
            }
            System.out.print("*\n");
        }
        System.out.println("**********************");
    }
}
