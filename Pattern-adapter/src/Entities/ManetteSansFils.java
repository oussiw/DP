package Entities;

public class ManetteSansFils implements Manette {
    @Override
    public void toLeft() {
        System.out.println("Manette sans fils: Left\n");
    }

    @Override
    public void toRight() {
        System.out.println("Manette sans fils: Right\n");
    }

    @Override
    public void toPush() {
        System.out.println("Manette sans fils: Push\n");
    }
}
