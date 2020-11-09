import java.time.LocalDate;
import java.util.HashMap;

public class Vente {
    private String id;
    private String date = LocalDate.now().toString();
    private HashMap<String,Double> items;
    private CalculTotal calculTotal;

    public Vente(String id, CalculTotal calculTotal) {
        this.id = id;
        this.calculTotal = calculTotal;
        items = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String, Double> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Double> items) {
        this.items = items;
    }

    public void addItem(String name, double prix){
        items.put(name,prix);
    }

    public double getPreDisc(){
        double pdt = 0.0;
        for(Double value:items.values()){
            pdt+=value;
        }
        return pdt;
    }

    public double getTotal(){
        return calculTotal.getTotal(this);
    }
}
