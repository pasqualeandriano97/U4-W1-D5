package elementi_multimediali;

public class RegistrazioneAudio extends ElementoMultimediale {
    String formato;    int durata;   int volume;


    public RegistrazioneAudio(String nome, int dimensione, String formato, int durata, int volume) {
        super(nome, dimensione);        this.formato = formato;
        this.durata = durata;
        this.volume = volume;
    }


}
