package esercizio0;

public class Macchina {
    private int route;
    private int cilindrata;

    public Macchina(int route, int cilindrata) {
        this.route = route;
        this.cilindrata = cilindrata;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Macchina sample = (Macchina) obj;
        return sample.cilindrata == cilindrata && sample.route == route;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
