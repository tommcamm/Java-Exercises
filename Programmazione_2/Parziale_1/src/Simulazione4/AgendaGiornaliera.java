package Simulazione4;

public class AgendaGiornaliera {
    private int giorno;
    private String docente;
    private Studente[] appuntamenti;

    public AgendaGiornaliera(String docente, int giorno, int numeroAppuntamentiGiornalieri){
        this.docente = docente;
        this.giorno = giorno;
        appuntamenti = new Studente[numeroAppuntamentiGiornalieri];
    }

    public AgendaGiornaliera(String docente, int giorno){
        this.docente = docente;
        this.giorno = giorno;
        appuntamenti = new Studente[6];
    }

    public Studente getStudente(int slot){
        return appuntamenti[slot];
    }

    public boolean isLibero(int slot){
        if((slot < 0) || (slot >= appuntamenti.length)) return false;
        return appuntamenti[slot] == null;
    }

    private boolean esisteAppuntamento(Studente studente){
        for(int i=0; i<appuntamenti.length; i++){
            if(studente.equals(appuntamenti[i])) return true;
        }
        return false;
    }

    public boolean prenota(Studente studente){
        if (studente == null) return false;
        if (esisteAppuntamento(studente)) return false;
        for(int i=0; i<appuntamenti.length; i++){
            if(appuntamenti[i] == null){
                appuntamenti[i] = studente;
                return true;
            }
        }
        return false;
    }

    public boolean prenota(Studente studente, int orario){
        if (studente == null)  return false;
        if (esisteAppuntamento(studente)) return false;
        if (appuntamenti[orario] != null) return false;
        appuntamenti[orario] = studente;
        return true;
    }

    public boolean annulla(Studente studente){
        if (studente == null) return false;
        for(int i=0; i<appuntamenti.length; i++){
            if (studente.equals(appuntamenti[i])){
                appuntamenti[i] = null;
                return true;
            }
        }
        return false;
    }

    public int getNumeroAppuntamentiGiornalieri(){
        /*int numAppuntamenti = 0;
        for(int i = 0; i<appuntamenti.length; i++){
            if(appuntamenti[i] != null) numAppuntamenti++;
        }
        return numAppuntamenti;*/
        return appuntamenti.length;
    }


    public int getGiorno() {
        return giorno;
    }

    public String getDocente() {
        return docente;
    }
}
