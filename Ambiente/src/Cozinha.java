public class Cozinha extends Ambiente {
    private boolean temMicroondas;

    public Cozinha(float area, boolean temMicroondas) {
        super(area);
        this.temMicroondas = temMicroondas;
    }

    public boolean temMicroondas() {
        return temMicroondas;
    }
}