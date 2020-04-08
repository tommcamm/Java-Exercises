package PrimoCompitino;

public class Auto {
    private String targa;
    private int km;

    public Auto(String targa, int km) {
        super();
        this.targa = targa;
        this.km = km;
    }

    public Auto(String targa) {
        this(targa, 0);
    }

    public boolean aggiornaKm(int kmAggiuntivi){
        if(kmAggiuntivi < 0){
            return false;
        } else {
            km += kmAggiuntivi;
            return true;
        }
    }

    public String getTarga() {
        return targa;
    }

    public int getKmPercorsi() {
        return km;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return targa.equals(auto.targa);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", km=" + km +
                '}';
    }
}
