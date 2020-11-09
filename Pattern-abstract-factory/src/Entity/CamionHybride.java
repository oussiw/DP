package Entity;

public class CamionHybride extends Camion{

    public CamionHybride(int n) {
        super(n);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Camion hybride";
    }
}
