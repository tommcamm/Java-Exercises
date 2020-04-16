package PrimoCompitino;

public class ParcoAuto {
    private Auto[] autoAziendali;

    public ParcoAuto(int maxAuto){
        super();
        autoAziendali = new Auto[maxAuto];
    }

    public Auto trovaAuto(Auto auto){
        if (auto == null) return null;
        for(int i=0; i<autoAziendali.length; i++){
            if(autoAziendali[i] == null) return null;
            if(autoAziendali[i].equals(auto)){
                return autoAziendali[i];
            }
        }
        return null;
    }

    public boolean inserisciNuovaAuto(String targa){
        if (targa == null) return false;
        Auto auto = new Auto(targa);
        if(trovaAuto(auto) != null) return false;
        for(int i=0; i<autoAziendali.length; i++){
            if(autoAziendali[i] == null){
                autoAziendali[i] = auto;
                return true;
            }
        }
        return false;
    }

    public boolean rientroAuto(Auto autoRientrata){
        if(trovaAuto(autoRientrata) == null) return false;
        return trovaAuto(autoRientrata).aggiornaKm(autoRientrata.getKmPercorsi()-trovaAuto(autoRientrata).getKmPercorsi());
    }

    public boolean rientroAuto(String targa, int kmAlRientro){
        Auto auto = new Auto(targa);
        if(trovaAuto(auto) == null) return false;
        return trovaAuto(auto).aggiornaKm(kmAlRientro-trovaAuto(auto).getKmPercorsi());
    }


}
