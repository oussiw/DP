package Entity;

public class AutocarElectrique extends Autocar{
    public AutocarElectrique(int n) {
        super(n);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Autocar electrique";
    }
}
