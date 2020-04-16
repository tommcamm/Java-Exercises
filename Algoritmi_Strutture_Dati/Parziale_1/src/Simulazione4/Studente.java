package Simulazione4;

public class Studente {
    private String cognome;
    private int matricola;

    public Studente(String cognome, int matricola) {
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return matricola == studente.matricola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "cognome='" + cognome + '\'' +
                ", matricola=" + matricola +
                '}';
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }
}
