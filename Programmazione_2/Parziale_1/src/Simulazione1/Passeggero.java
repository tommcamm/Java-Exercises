package Simulazione1;

public class Passeggero {
    private String destinazione;
    private boolean inPossessoDiBiglietto;

    public Passeggero(String destinazione, boolean inPossessoDiBiglietto) {
        if(destinazione == null) destinazione = "CAPOLINEA";
        this.destinazione = destinazione;
        this.inPossessoDiBiglietto = inPossessoDiBiglietto;
    }

    public Passeggero(String destinazione) {
        if(destinazione == null) destinazione = "CAPOLINEA";
        this.inPossessoDiBiglietto = true;
        this.destinazione = destinazione;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public boolean isInPossessoDiBiglietto() {
        return inPossessoDiBiglietto;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    @Override
    public String toString() {
        return "Passeggero{" +
                "destinazione='" + destinazione + '\'' +
                ", inPossessoDiBiglietto=" + inPossessoDiBiglietto +
                '}';
    }
}
