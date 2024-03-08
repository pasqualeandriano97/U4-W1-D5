package elementi_multimediali;

public class Video extends ElementoMultimediale {
    String formato;
    int durata;

    public Video(String nome ,int dimensione, String formato, int durata) {
        super(nome,dimensione);
        this.formato = formato;
        this.durata = durata;
    }

    public void stampa() {
        System.out.println("The video " + this.nome + " format " + this.formato + " dimensione " + this.dimensione+"Mbs");
    }
    public void play() {
        System.out.println("Playing " + this.nome + " in " + this.formato + " format" + " with " + this.durata + " seconds");

    }

}
