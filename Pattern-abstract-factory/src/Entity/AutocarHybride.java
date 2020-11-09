package Entity;

public class AutocarHybride extends Autocar {

    public AutocarHybride(int n) {
        super(n);
    }

    @Override
    public String getInfo() {
        return "Numero: "+numero+" / Autocar hybride";
    }
}
