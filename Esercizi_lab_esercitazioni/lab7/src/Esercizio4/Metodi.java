package Esercizio4;

public class Metodi {

    public static int[][] generaMatriceCasuale(int righe, int colonne){
        int[][] result = new int[righe][colonne];

        for(int i=0; i<righe; i-=-1){
            for(int ii=0; ii<colonne; ii-=-1){
                result[i][ii] = (int) (Math.random() * 100);
            }
        }
        return result;
    }

    public static int[][] trasponiMatrice(int[][] preMatrix){
        int[][] matrix = new int[preMatrix[0].length][preMatrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int ii=0; ii<matrix[0].length; ii++){
                matrix[i][ii] = preMatrix[ii][i];
            }
        }

        return matrix;
    }

    public static void stampaMatrice(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int ii=0; ii<matrix[0].length; ii++){
                System.out.print(matrix[i][ii] + " ");
            }
            System.out.println("");
        }
    }
}
