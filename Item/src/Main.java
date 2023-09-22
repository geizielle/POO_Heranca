public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "Livro de Ficção", "Autor Fantástico");
        System.out.println("Dados do Livro:");
        System.out.println(livro.toString());
        System.out.println();
        CD cd = new CD(2, "Álbum de Música", "Gravadora Records", "Faixa 1, Faixa 2", "Artista Musical", "Álbum Musical");
        System.out.println("Dados do CD:");
        System.out.println(cd.toString());
        System.out.println();
        VHS vhs = new VHS(3, "Filme em VHS", "Cinema VHS", "Título do Filme");
        System.out.println("Dados do VHS:");
        System.out.println(vhs.toString());
    }
}
