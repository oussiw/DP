import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Simulation {
    public static void main(String[] args) throws FileNotFoundException {
        ServicePrinter printer = new ServicePrinter(new TextPrinter("text.txt"));

        //la remise est de 30% == 0.3
        Vente v = new Vente("#78420", LocalDate.now().toString(),0.3);

        v.addItem("stylot",2.0);
        v.addItem("colle",3.0);

        printer.printOrder(v);

        printer.setPrinter(new HtmlPrinter("commande.html"));
        printer.printOrder(v);
    }
}
