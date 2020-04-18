package Simulazione6;

public class Corsa {
    private String destinazione;
    private double costoKm;
    private int kmPercorsi;

    public Corsa(String destinazione, double costoKm) {
        this.kmPercorsi = 0;
        this.destinazione = destinazione;
        this.costoKm = costoKm;
    }

    public Corsa(String destinazione) {
        this.kmPercorsi = 0;
        this.destinazione = destinazione;
        this.costoKm = 0.5;
    }

    public void aggiungiKm(int kmPercorsi){
        if (kmPercorsi > 0) this.kmPercorsi += kmPercorsi;
    }

    public double calcolaTariffa(){
        return calcolaTariffa(0);
    }

    public double calcolaTariffa(double supplemento){
        return (costoKm*kmPercorsi) + supplemento;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public double getCostoKm() {
        return costoKm;
    }

    public int getKmPercorsi() {
        return kmPercorsi;
    }
}
