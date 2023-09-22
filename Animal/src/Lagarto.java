public class Lagarto extends Reptil {
    private String cor;

    public Lagarto(String nome, int idade, boolean escamas, boolean oviparidade, String cor) {
        super(nome, idade, escamas, oviparidade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
