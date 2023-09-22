public class Mamifero extends Animal {
    private boolean pelos;
    private boolean amamenta;

    public Mamifero(String nome, int idade, boolean pelos, boolean amamenta) {
        super(nome, idade);
        this.pelos = pelos;
        this.amamenta = amamenta;
    }

    public boolean temPelos() {
        return pelos;
    }

    public boolean amamenta() {
        return amamenta;
    }
}
