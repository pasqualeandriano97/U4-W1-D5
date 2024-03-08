package elementi_multimediali;

public class Video extends ElementoMultimediale {
    private String formato;
    private int durata;

    private int volume;

    private int luminosità;

    public Video(String nome ,int dimensione, String formato, int durata, int volume,int luminosità) {
        super(nome,dimensione);
        this.formato = formato;
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
        this.tipo=tipiDiMedia.VIDEO;
    }

    public void stampa() {
        System.out.println("The video " + this.nome + " format " + this.formato + " dimensione " + this.dimensione+"Mbs");
    }
    public int aumentaLuminosità() {
        this.luminosità += 10;
        return this.luminosità;
    }
    public int diminuisciLuminosità() {
        this.luminosità -= 10;    return this.luminosità;}

    public void aumentaVolume() {
        this.volume += 10;
    }
    public void diminuisciVolume() {
        this.volume -= 10;
    }
    public void play() {

            for (int i = 0; i < this.durata; i++) {
                System.out.print("Play " + this.nome + " volume: ");
                for (int j = 0; j < this.volume; j++) {
                    System.out.print("!");
                }
                System.out.print(" Luminosità: ");
                for(int k = 0; k < this.luminosità; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }

}
