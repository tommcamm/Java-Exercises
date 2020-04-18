package Simulazione6;

public class Taxi {
    private final Corsa[] corseEffettuate;
    private Corsa corsaInSvolgimento;
    private int totaleCorseEffettuate;

    public Taxi(){
        this.corseEffettuate = new Corsa[5];
        this.corsaInSvolgimento = null;
        totaleCorseEffettuate = 0;
    }

    public boolean nuovaCorsa(String destinazione){
        if((destinazione == null) || (destinazione.isEmpty())) return false;
        if(!isLibero()) return false;
        for (int i=0; i<corseEffettuate.length; i++){
            if(corseEffettuate[i] ==  null){
                corseEffettuate[i] = new Corsa (destinazione);
                corsaInSvolgimento = corseEffettuate[i];
                return true;
            }
        }
        return false;
    }

    public boolean isLibero(){
        return corsaInSvolgimento == null;
    }

    public int getTotaleCorseEffettuate() {
        return totaleCorseEffettuate;
    }

    public void terminaCorsa(int kmPercorsi){
        if(corsaInSvolgimento == null) return;
        corsaInSvolgimento.aggiungiKm(kmPercorsi);
        totaleCorseEffettuate++;
        corsaInSvolgimento = null;
    }

    public Corsa trovaCorsaConCostoMaggiore(String destinazione){
        double costo = 0;
        Corsa toReturn = null;
        for (Corsa corsa : corseEffettuate) {
            if (corsa != null) {
                if (corsa.getDestinazione().equals(destinazione)) {
                    if (corsa.calcolaTariffa() > costo) {
                        costo = corsa.calcolaTariffa();
                        toReturn = corsa;
                    }
                }
            }
        }
        return toReturn;
    }
}
