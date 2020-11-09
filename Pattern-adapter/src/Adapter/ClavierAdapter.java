package Adapter;

import Entities.Clavier;
import Entities.Keys;
import Entities.Manette;

public class ClavierAdapter implements Manette {

    private Clavier clavier = new Clavier();


    @Override
    public void toLeft() {
        clavier.keyPressed(Keys.ARROW_LEFT);
    }

    @Override
    public void toRight() {
        clavier.keyPressed(Keys.ARROW_RIGHT);
    }

    @Override
    public void toPush() {
        clavier.keyPressed(Keys.SPACEBAR);
    }
}
