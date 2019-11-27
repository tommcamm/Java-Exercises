package esercizio2;

public class Metodi {

    public static int sommaDueInteri(int n1, int n2){
        return n1+n2;
    }

    public static int divisioneIntera(int n1, int n2){
        return  n1/n2;
    }

    public static int restoDivisioneIntera(int n1, int n2){
        return n1%n2;
    }

    public static double mediaTraDueDouble(double n1, double n2){
        return ((n1+n2)/2);
    }

    public static int valoreAssolutoIntero(int n1){
        return Math.abs(n1);
    }

    public static int lunghezzaStringaIntero(int n1){
        return String.valueOf(n1).length();
    }
}
