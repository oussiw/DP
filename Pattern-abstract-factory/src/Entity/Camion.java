package Entity;

public class Camion extends Vehicule{

    public Camion(int n) {
        numero = n;
    }

    @Override
    public String getInfo() {
        return "Camion";
    }
}
