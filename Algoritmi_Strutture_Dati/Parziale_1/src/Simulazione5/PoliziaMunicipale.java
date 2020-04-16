package Simulazione5;

public class PoliziaMunicipale {
    private String comune;
    private Multa multe[];

    public PoliziaMunicipale(String comune, int multeMax){
        this.comune = comune;
        multe = new Multa[multeMax];
    }

    public PoliziaMunicipale(String comune){
        this.comune = comune;
        multe = new Multa[1000];
    }

    public boolean multaInserita(Multa multa){
        if (multa == null) return false;
        for(int i=0; i<multe.length; i++){
            if(multa.equals(multe[i])) return true;
        }
        return false;
    }

    public boolean aggiungiMulta(Multa multa){
        if (multa == null) return false;
        if (multaInserita(multa)) return false;
        for(int i=0; i<multe.length; i++){
            if(multe[i] == null) {
                multe[i] = multa;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiMulta(String numeroVerbale, int importo){
        if(numeroVerbale == null) return false;
        if(numeroVerbale.isEmpty()) return false;
        if(importo<=0) return false;
        return aggiungiMulta(new Multa(numeroVerbale, importo));
    }

    public Multa rimuoviMulta(Multa multa){
        if(multa == null) return null;
        for(int i=0; i<multe.length; i++){
            if(multa.equals(multe[i])){
                multa = multe[i];
                multe[i] = null;
                return multa;
            }
        }
        return null;
    }

    public int fatturato(){
        int FF = 0;
        for(int i=0; i<multe.length; i++){
            if(multe[i] != null){
                if(multe[i].isPagata()) FF++;
            }
        }
        return FF;
    }
}
