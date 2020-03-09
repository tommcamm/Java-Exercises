package edu.tomm;

public class Metodi {

    public static double[][] InizializzaDati(int n, int m){
        double[][] dati = new double[n][m];
        for(int i=0; i<dati.length; i++){
            for(int ii=0; ii<dati[i].length; ii++){
                dati[i][ii] =  Math.random();
            }
        }
        return dati;
    }

}
