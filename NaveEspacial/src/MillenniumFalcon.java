public class MillenniumFalcon extends NaveEspacial {
    private float classeHiperpropulsor;

    public MillenniumFalcon(double velocidadeMaxima, float classeHiperpropulsor) {
        super(velocidadeMaxima);
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    public float getClasseHiperpropulsor() {
        return classeHiperpropulsor;
    }
}
