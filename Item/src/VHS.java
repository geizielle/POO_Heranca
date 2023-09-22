public class VHS extends Midia {
    private String titulo;

    public VHS(int codigo, String descricao, String gravadora, String titulo) {
        super(codigo, descricao, gravadora);
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTítulo: " + titulo;
    }
}
