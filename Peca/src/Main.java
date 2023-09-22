public class Main {
    public static void main(String[] args) {
        Peca rei = new Rei(1, 1, true);
        System.out.println("Movimento do Rei: " + rei.mover(2, 2));
        Peca rainha = new Rainha(4, 4, false);
        System.out.println("Movimento da Rainha: " + rainha.mover(6, 6));
        Peca cavalo = new Cavalo(2, 3, true);
        System.out.println("Movimento do Cavalo: " + cavalo.mover(4, 4));
        Peca bispo = new Bispo(3, 3, false);
        System.out.println("Movimento do Bispo: " + bispo.mover(5, 5));
        Peca peao = new Peao(2, 2, true);
        System.out.println("Movimento do Peão: " + peao.mover(3, 2));
        Peca torre = new Torre(5, 5, false);
        System.out.println("Movimento da Torre: " + torre.mover(5, 7));
    }
}
