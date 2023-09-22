public class Cao extends Mamifero {
    private String raça;

    public Cao(String nome, int idade, boolean pelos, boolean amamenta, String raça) {
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
