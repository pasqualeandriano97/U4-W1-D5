package elementi_multimediali;

public class RegistrazioneAudio extends ElementoMultimediale {
    private String formato;
    private int durata;
    private int volume;


    public RegistrazioneAudio(String nome, int dimensione, String formato, int durata, int volume) {
        super(nome, dimensione);
        this.formato = formato;
        this.durata = durata;
        this.volume = volume;
        this.tipo=tipiDiMedia.REGISTRAZIONE_AUDIO;
    }

    public void stampa() {
        System.out.println("The audio " + this.nome + " format " + this.formato + " dimensione " + this.dimensione + "Mbs" + " with " + this.durata + " seconds" + " and volume " + this.volume);
    }
    public void aumentaVolume() {
        this.volume += 10;
    }
    public void diminuisciVolume() {
        this.volume -= 10;
    }
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.print("Play " + this.nome + " ");
            for (int j = 0; j < this.volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }


}




