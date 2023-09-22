public class InstrumentoMusical {
    private String nome;
    private String categoria;

    public InstrumentoMusical(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void tocar() {
        System.out.println("Tocando:  " + nome);
    }
}