public class CD extends Midia {
    private String faixas;
    private String artista;
    private String album;

    public CD(int codigo, String descricao, String gravadora, String faixas, String artista, String album) {
        super(codigo, descricao, gravadora);
        this.faixas = faixas;
        this.artista = artista;
        this.album = album;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFaixas: " + faixas + "\nArtista: " + artista + "\nÁlbum: " + album;
    }
}
