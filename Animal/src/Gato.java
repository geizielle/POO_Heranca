public class Gato extends Mamifero {
    private String raça;

    public Gato(String nome, int idade, boolean pelos, boolean amamenta, String raça) {
        super(nome, idade, pelos, amamenta);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
}