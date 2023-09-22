public class Midia extends Item {
    private String gravadora;

    public Midia(int codigo, String descricao, String gravadora) {
        super(codigo, descricao);
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGravadora: " + gravadora;
    }
}
