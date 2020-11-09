package Entity;

public class Voiture extends Vehicule{

    public Voiture(int n) {
        numero = n;
    }

    @Override
    public String getInfo() {
        return "Voiture";
    }
}
