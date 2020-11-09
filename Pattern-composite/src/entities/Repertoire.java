package entities;

import abstract_classes.FileSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repertoire extends FileSystem {

    private List<FileSystem> content = new ArrayList<>();

    public Repertoire(String name, double taille, char[] permissions) {
        super(name, taille, permissions);
    }

    @Override
    public void ls() {
        this.calculateSize();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nRepertoire{\n" +
                "\tname='" + name + '\'' +
                "\n\ttaille=" + taille +
                "\n\tpermissions=" + Arrays.toString(permissions) +
                "\n\tcontent=" + content +
                "\n\t}\n";
    }

    private void calculateSize(){
        double new_size = taille;

        for(FileSystem f:content)
            new_size = new_size + f.getTaille();

        this.setTaille(new_size);
    }

    @Override
    public void addContent(FileSystem repertoire) {
        this.content.add(repertoire);
    }

    @Override
    public void removeContent(FileSystem repertoire) {
        this.content.remove(repertoire);
    }
}
