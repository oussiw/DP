import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Vente {
    private int id;
    private LocalDate date = LocalDate.now();
    private Map<String,Double> produits;
    private DiscountStrategy strategy;

    public Vente(DiscountStrategy strategy) {
        this.id = 100;
        this.strategy = strategy;
        produits = new HashMap<>();
    }

    public double getPreDisc(){
        double somme = 0.0;
        for(String name: produits.keySet())
            somme +=produits.get(name);
        return somme;
    }

    public double getDiscount(){
        return strategy.getDiscount(this);
    }

    public void addProduit(String name,double prix){
        produits.put(name,prix);
    }

}
