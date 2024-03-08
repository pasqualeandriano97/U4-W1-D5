
import elementi_multimediali.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Immagine immagine = new Immagine("immagine.jpg", 10, 10);
        Video video = new Video("video.mp4", 10, "mp4", 100);
       immagine.stampa();
       video.stampa();
       video.play();
       immagine.aumentaLuminosità();
       immagine.stampa();
       immagine.diminuisciLuminosità();
       immagine.stampa();

    }
}