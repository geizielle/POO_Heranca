public class Peca {
    protected int linha;
    protected int coluna;
    protected boolean cor;
    protected int movimentos;

    public Peca(int linha, int coluna, boolean cor) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = 0;
    }

    public boolean mover(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        movimentos++;
        return true;
    }
}
