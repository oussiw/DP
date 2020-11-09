package entities;

import abstract_classes.FileSystem;

import java.util.Arrays;

public class Fichier extends FileSystem {

    @Override
    public double getTaille() {
        return this.taille;
    }

    public Fichier(String name, double taille, char[] permissions) {
        super(name, taille, permissions);
    }

    @Override
    public void ls() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nFichier{" +
                "name='" + name + '\'' +
                ", taille=" + taille +
                ", permissions=" + Arrays.toString(permissions) +
                '}';
    }

    @Override
    public void addContent(FileSystem repertoire) {
        throw new UnsupportedOperationException("Can't add content, not allowed.\n");
    }

    @Override
    public void removeContent(FileSystem repertoire) {
        throw new UnsupportedOperationException("Can't remove content, not allowed.\n");
    }
}
