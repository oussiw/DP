package Entity;

public class CamionElectrique extends Camion{
    public CamionElectrique(int n) {
        super(n);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Camion electrique";
    }
}
