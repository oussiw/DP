package pack;

public abstract class DataMiner {
    public void templateMethod(String message){
        openFile(message);
        parseData(message);
        extractData(message);
    }
    protected abstract void openFile(String message);

    protected abstract void extractData(String message);

    protected abstract void parseData(String message);
}
