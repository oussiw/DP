import Adapter.ClavierAdapter;
import Entities.JeuxVideo;
import Entities.ManetteSansFils;

public class Program {
    public static void main(String[] args) {
        JeuxVideo jeuxVideo = new JeuxVideo(new ManetteSansFils());
        jeuxVideo.showMenu();
        jeuxVideo.makeAction('l');
        jeuxVideo.makeAction('r');
        jeuxVideo.makeAction('p');
        jeuxVideo.setManette(new ClavierAdapter());
        jeuxVideo.makeAction('l');
        jeuxVideo.makeAction('r');
        jeuxVideo.makeAction('p');
    }
}
