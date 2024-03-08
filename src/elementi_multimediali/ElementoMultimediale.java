package elementi_multimediali;

public abstract class ElementoMultimediale {
    String nome;
    int dimensione;

    public ElementoMultimediale(String nome, int dimensione) {
        this.nome = nome;        this.dimensione = dimensione;
    }

    public ElementoMultimediale(String titolo) {
    }
}
