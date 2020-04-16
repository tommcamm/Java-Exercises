package Simulazione2;

public class PlayList {
    private Brano[] brani;
    private String titolo;

    public PlayList(String titolo, int numeroBrani){
        if(numeroBrani < 1) numeroBrani = 1;
        brani = new Brano[numeroBrani];
        this.titolo = titolo;
    }

    public PlayList(String titolo){
        brani = new Brano[20];
        this.titolo = titolo;
    }

    public int posizioneBrano(Brano brano){
        for(int i=0; i<brani.length; i++){
            if (brano.equals(brani[i])) return i;
        }
        return -1;
    }

    public boolean aggiungiBrano(Brano brano){
        if (posizioneBrano(brano) != -1) return false;
        for(int i=0; i<brani.length; i++){
            if(brani[i] == null){
                brani[i] = brano;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiBrano(String titolo, int durataInSecondi){
        return aggiungiBrano(new Brano(titolo, durataInSecondi));
    }

    public Brano rimuoviBrano(Brano brano){
        for(int i=0; i<brani.length; i++){
            if(brano.equals(brani[i])){
                brani[i] = null;
                return brano;
            }
        }
        return null;
    }

    public int play(){
        int durata = 0;
        for(int i=0; i<brani.length; i++){
            if(brani[i] != null){
                System.out.println("- " + brani[i].getTitolo());
                durata += brani[i].getDurataInSecondi();
            }
        }
        return durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
