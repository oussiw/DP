package pack;

public class CSVDataMiner extends DataMiner{
    @Override
    protected void openFile(String message) {
        System.out.println("Open csv file: "+message);
    }

    @Override
    protected void extractData(String message) {
        System.out.println("Extract csv file: "+message);
    }

    @Override
    protected void parseData(String message) {
        System.out.println("Parse csv file: "+message);
    }
}
