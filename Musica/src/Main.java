public class Main {
    public static void main(String[] args) {  
        InstrumentoMusical saxofone = new Saxofone();
        InstrumentoMusical tambor = new Tambor();
        InstrumentoMusical piano = new Piano();
        InstrumentoMusical trompete = new Trompete();
        InstrumentoMusical violao = new Violao();

        saxofone.tocar();
        tambor.tocar();
        piano.tocar();
        trompete.tocar();
        violao.tocar();
    }
}
