package Entity;

public class VoitureHybride extends Voiture {
    public VoitureHybride(int n) {
        super(n);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Voiture hybride";
    }
}
