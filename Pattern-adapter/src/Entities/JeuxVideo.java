package Entities;

public class JeuxVideo {
    Manette manette;

    public void setManette(Manette manette) {
        this.manette = manette;
    }

    public JeuxVideo(Manette manette) {
        this.manette = manette;
    }

    public void showMenu(){
        System.out.printf("To left type l\nTo right type r\nTo push type p\n");
    }

    public void makeAction(char action){
        if(action == 'l') manette.toLeft();
        else if(action=='r') manette.toRight();
        else if(action=='p') manette.toPush();
    }
}
