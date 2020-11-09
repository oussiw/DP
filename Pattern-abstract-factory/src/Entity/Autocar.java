package Entity;

public class Autocar extends Vehicule{

    public Autocar(int n) {
        numero = n;
    }

    @Override
    public String getInfo() {
        return "Autocar";
    }
}
