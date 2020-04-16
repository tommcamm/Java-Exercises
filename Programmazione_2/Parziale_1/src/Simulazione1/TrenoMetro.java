package Simulazione1;

public class TrenoMetro {
    private Passeggero passeggeri[];

    public TrenoMetro(){
        passeggeri = new Passeggero[50];
    }

    public int numeroPasseggeri(){
        int counter = 0;
        for(int i=0; i<passeggeri.length; i++){
            if (passeggeri[i] != null) counter++;
        }
        return counter;
    }

    public boolean salitaPasseggero(String destinazione, boolean inPossessoDiBiglietto){
        for(int i=0; i<passeggeri.length; i++){
            if (passeggeri[i] == null) {
                passeggeri[i] = new Passeggero(destinazione, inPossessoDiBiglietto);
                return true;
            }
        }
        return false;
    }

    public boolean salitaPasseggero(String destinazione){
        return salitaPasseggero(destinazione, true);
    }

    public Passeggero[] discesaPasseggeri(String destinazione){
        int daMultare = 0;
        for(int i=0; i<passeggeri.length; i++){
            if(passeggeri[i] != null){
                if(passeggeri[i].getDestinazione().equals(destinazione)){
                    if(!passeggeri[i].isInPossessoDiBiglietto()) daMultare++;
                }
            }
        }
        Passeggero multed[] = new Passeggero[daMultare];
        daMultare--;
        for(int i=0; i<passeggeri.length; i++){
            if(passeggeri[i] != null){
                if(passeggeri[i].getDestinazione().equals(destinazione)){
                    if(!passeggeri[i].isInPossessoDiBiglietto()){
                        multed[daMultare] = passeggeri[i];
                        daMultare--;
                    }
                    passeggeri[i] = null;
                }
            }
        }
        return multed;
    }
}
