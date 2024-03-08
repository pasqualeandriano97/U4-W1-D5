package elementi_multimediali;


public abstract class ElementoMultimediale {
    protected String nome;
    protected int dimensione;

    protected tipiDiMedia tipo;



    public ElementoMultimediale(String nome, int dimensione) {
        this.nome = nome;        this.dimensione = dimensione;


    }

    public ElementoMultimediale(String titolo) {
    }

    public abstract void play();

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "nome='" + nome + '\'' +
                ", dimensione=" + dimensione +
                " tipo=" + tipo +
                '}';
    }
}
