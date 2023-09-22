public class Apolo11 extends NaveEspacial {
    private String tipoCombustivel;

    public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
        super(velocidadeMaxima);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}