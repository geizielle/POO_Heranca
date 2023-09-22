public class Bomba {
    private double totalLitros;
    private float valorLitros;

    public Bomba(double totalLitros, float valorLitros) {
        this.totalLitros = totalLitros;
        this.valorLitros = valorLitros;
    }

    public boolean abastecerPorLitros(int litros) {
        if (litros > 0 && litros <= totalLitros) {
            totalLitros -= litros;
            return true;
        }
        return false;
    }

    public boolean abastecerPorValor(float valor) {
        if (valor > 0 && valor / valorLitros <= totalLitros) {
            totalLitros -= valor / valorLitros;
            return true;
        }
        return false;
    }
}