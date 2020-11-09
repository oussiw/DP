import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Simulation {
    public static void main(String[] args) throws FileNotFoundException {
        //la remise est de 30% == 0.3
        Vente v = new Vente("#78420",new RemiseEmploye(0.05));
        v.addItem("Smart tv",4900.90);
        v.addItem("Pc portable",8000.80);
        v.addItem("Console XBox",3500.0);

        System.out.println("Detail vente 1(Employe):");
        System.out.println("Vente id: "+v.getId());
        System.out.println("Vente date: "+v.getDate());
        System.out.println("Articles:\n--------------------------");
        for(String s:v.getItems().keySet()){
            System.out.println(s+" ----> "+v.getItems().get(s));
        }
        System.out.println("------------------------------");
        System.out.println("Total avant remise: \t\t"+v.getPreDisc());
        System.out.println("------------------------------");
        System.out.println("Total:\t\t"+v.getTotal());

        System.out.println("------------------------------------------------------------------------------------------");

        Vente v2 = new Vente("#78420",new RemiseClient(1000.0,15000.0));
        v2.addItem("Smart tv",4900.90);
        v2.addItem("Pc portable",8000.80);
        v2.addItem("Console XBox",3500.0);

        System.out.println("Detail vente 2(Client):");
        System.out.println("Vente id: "+v2.getId());
        System.out.println("Vente date: "+v2.getDate());
        System.out.println("Articles:\n--------------------------");
        for(String s:v2.getItems().keySet()){
            System.out.println(s+" ----> "+v2.getItems().get(s));
        }
        System.out.println("------------------------------");
        System.out.println("Total avant remise: \t\t"+v2.getPreDisc());
        System.out.println("------------------------------");
        System.out.println("Total:\t\t"+v2.getTotal());
    }
}
