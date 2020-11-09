package abstract_classes;


import java.util.Arrays;

public abstract class FileSystem {

    protected String name;
    protected double taille;
    protected char[] permissions;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPermissions() {
        return permissions;
    }

    public void setPermissions(char[] permissions) {
        this.permissions = permissions;
    }

    public FileSystem(String name, double taille, char[] permissions) {
        this.name = name;
        this.taille = taille;
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "FileSystem{" +
                "name='" + name + '\'' +
                ", taille=" + taille +
                ", permissions=" + Arrays.toString(permissions) +
                '}';
    }

    public abstract void ls();
    public abstract void addContent(FileSystem repertoire);
    public abstract void removeContent(FileSystem repertoire);
}
