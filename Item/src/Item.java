public class Item {
    private int codigo;
    private String descricao;

    public Item(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String toString() {
        return "Código: " + codigo + "\nDescrição: " + descricao;
    }
}
