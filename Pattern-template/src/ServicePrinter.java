public class ServicePrinter {
    private Printer printer;

    public ServicePrinter(Printer printer) {
        this.printer = printer;
    }

    public void printOrder(Vente v){
        printer.print(v);
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
