package Entities;

public class Clavier {

    public void keyPressed(Keys key){
        switch (key){
            case SPACEBAR:
                System.out.println("Clavier: Push\n");
                break;
            case ARROW_LEFT:
                System.out.println("Clavier: Turn left\n");
                break;
            case ARROW_RIGHT:
                System.out.println("Clavier: Turn right\n");
                break;
        }
    }
}
