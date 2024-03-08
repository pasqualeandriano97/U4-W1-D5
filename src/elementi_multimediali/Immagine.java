package elementi_multimediali;

public class Immagine extends ElementoMultimediale {
   private int luminosità;

    public Immagine(String nome, int dimensione, int luminosità) {
        super(nome,dimensione);
        this.tipo=tipiDiMedia.IMMAGINE;
        this.luminosità = luminosità;
}
public int aumentaLuminosità() {
    this.luminosità += 10;
    return this.luminosità;
}
public int diminuisciLuminosità() {
        this.luminosità -= 10;    return this.luminosità;
}


    @Override
    public void play() {
        System.out.print(this.nome+" Luminosità: ");
        for(int k = 0; k < this.luminosità; k++) {
            System.out.print("*");
        }
    }
}
