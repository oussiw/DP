import pack.DataMiner;
import pack.PdfDataMiner;

public class Program {
    public static void main(String[] args) {
        DataMiner dataMiner = new PdfDataMiner();
        dataMiner.templateMethod("Test");

    }
}
