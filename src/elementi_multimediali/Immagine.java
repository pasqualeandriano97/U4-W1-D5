package elementi_multimediali;

public class Immagine extends ElementoMultimediale {
   private int luminosità;
    public Immagine(String nome, int dimensione, int luminosità) {
        super(nome,dimensione);
        this.luminosità = luminosità;
}
public int aumentaLuminosità() {
    this.luminosità += 10;
    return this.luminosità;
}
public int diminuisciLuminosità() {
        this.luminosità -= 10;    return this.luminosità;
}
public void stampa() {
            System.out.println("Immagine: " + this.nome + " - dimensione: " + this.dimensione+"Mbs"+" - luminosità: " + this.luminosità);
}

}
