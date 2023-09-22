public class Sala extends Ambiente {
    private boolean temTV;

    public Sala(float area, boolean temTV) {
        super(area);
        this.temTV = temTV;
    }

    public boolean temTV() {
        return temTV;
    }
}