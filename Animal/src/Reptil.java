public class Reptil extends Animal {
    private boolean escamas;
    private boolean oviparidade;

    public Reptil(String nome, int idade, boolean escamas, boolean oviparidade) {
        super(nome, idade);
        this.escamas = escamas;
        this.oviparidade = oviparidade;
    }

    public boolean temEscamas() {
        return escamas;
    }

    public boolean éOviparo() {
        return oviparidade;
    }
}
