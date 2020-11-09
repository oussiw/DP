package metier;

public class Pizza {
    protected char taille;
    protected double prix;
    protected String type;

    @Override
    public String toString() {
        return "Pizza{" +
                "taille=" + taille +
                ", prix=" + prix +
                ", type='" + type + '\'' +
                '}';
    }
}
