import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HtmlPrinter implements Printer{

    private PrintWriter writer;

    public HtmlPrinter(String fileName) throws FileNotFoundException {
        writer = new PrintWriter(fileName);
    }

    @Override
    public void start(Vente v) {
        writer.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>");
        writer.println("<title>"+"Detail de la vente:"+"</title>");
        writer.println("</head>\n<body>");
    }

    @Override
    public void formatOrderNumber(Vente v) {
        writer.println("<h3>Vente id: "+v.getId()+"</h3>");
        writer.println("<p>Vente date: "+v.getDate()+"</p>");
    }

    @Override
    public void formatOrderItems(Vente v) {
        writer.println("<p>Articles</p>\n<ul>");
        for(String s: v.getItems().keySet()){
            writer.println("<li>"+s+" ==> "+v.getItems().get(s)+" dhs"+"</li>");
        }
        writer.println("</ul><hr>");
    }

    @Override
    public void formatOrderTotal(Vente v) {
        double total = 0.0;
        for(String s: v.getItems().keySet()){
            total += v.getItems().get(s);
        }
        writer.println("<p>Total avant remise: "+total+" dhs</p><hr>");
        total = total*(1-v.getRemise());
        writer.println("<p>Total: "+total+" dhs</p>");
    }

    @Override
    public void end() {
        writer.println("</body>\n</html>");
        writer.flush();
        writer.close();
    }
}
