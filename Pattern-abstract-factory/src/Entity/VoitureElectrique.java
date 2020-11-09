package Entity;

public class VoitureElectrique extends Voiture{
    public VoitureElectrique(int i) {
        super(i);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Voiture Electrique";
    }
}
