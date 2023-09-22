public class Banheiro extends Ambiente {
    private boolean temBanheira;

    public Banheiro(float area, boolean temBanheira) {
        super(area);
        this.temBanheira = temBanheira;
    }

    public boolean temBanheira() {
        return temBanheira;
    }
}
