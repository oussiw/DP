import abstract_classes.FileSystem;
import entities.Fichier;
import entities.Repertoire;

public class Program {
    public static void main(String[] args) {
        char[] permissions1 = {'R', 'W', 'X'};
        char[] permissions2 = {'R', 'W'};
        char[] permissions3 = {'R'};
        FileSystem file1 = new Fichier("file1",5.3, permissions1);
        FileSystem file2 = new Fichier("file2",6.3, permissions2);
        FileSystem file3 = new Fichier("file3",5.7, permissions3);
        FileSystem file4 = new Fichier("file4",10.0, permissions1);

        FileSystem rep0 = new Repertoire("rep0",0.0, permissions1);
        FileSystem rep1 = new Repertoire("rep1",0.0, permissions2);
        FileSystem rep2 = new Repertoire("rep2",2.0, permissions3);

        FileSystem[] files = {file1,file2,file3,file4,rep2,rep1,rep0};
        rep1.addContent(file4);
        rep1.addContent(rep2);
        rep0.addContent(file1);
        rep1.addContent(file2);
        rep0.addContent(file3);
        rep0.addContent(rep1);

        System.out.println(">> Affichage ls:\n");
        for(FileSystem f : files){
            f.ls();
        }
    }
}
