package pack;

public class PdfDataMiner extends DataMiner {
    @Override
    protected void openFile(String message) {
        System.out.println("Open pdf file: "+message);

    }

    @Override
    protected void extractData(String message) {
        System.out.println("Extract pdf file: "+message);

    }

    @Override
    protected void parseData(String message) {
        System.out.println("Parse pdf file: "+message);

    }
}
