import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextPrinter implements Printer{

    private PrintWriter writer;

    public TextPrinter(String fileName) throws FileNotFoundException {
        writer = new PrintWriter(fileName);
    }

    @Override
    public void start(Vente v) {
        writer.println("Detail de la vente:");
    }

    @Override
    public void formatOrderNumber(Vente v) {
        writer.println("Vente id: "+v.getId());
        writer.println("Vente date: "+v.getDate());
    }

    @Override
    public void formatOrderItems(Vente v) {
        writer.println("Articles\n----------------------------");
        for(String s: v.getItems().keySet()){
            writer.println(s+" ==> "+v.getItems().get(s)+" dhs");
        }
    }

    @Override
    public void formatOrderTotal(Vente v) {
        double total = 0.0;
        for(String s: v.getItems().keySet()){
            total += v.getItems().get(s);
        }
        writer.println("----------------------------\nTotal avant remise: "+total+" dhs");
        total = total*(1-v.getRemise());
        writer.println("----------------------------\nTotal:              "+total+" dhs");
    }

    @Override
    public void end() {
        writer.println("----------------------------");
        writer.flush();
        writer.close();
    }
}
