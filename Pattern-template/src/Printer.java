import java.io.FileNotFoundException;

public interface Printer {
    default void print(Vente v){
        start(v);
        formatOrderNumber(v);
        formatOrderItems(v);
        formatOrderTotal(v);
        end();
    }

    void start(Vente v);
    void formatOrderNumber(Vente v);
    void formatOrderItems(Vente v);
    void formatOrderTotal(Vente v);
    void end();
}
