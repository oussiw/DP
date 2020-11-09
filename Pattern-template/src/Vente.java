import java.util.HashMap;

public class Vente {
    private String id;
    private String date;
    private double remise;
    private HashMap<String,Double> items;

    public Vente(String id, String date,double remise) {
        this.id = id;
        this.date = date;
        this.remise = remise;
        items = new HashMap<>();
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
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

}
