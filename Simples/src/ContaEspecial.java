public class ContaEspecial extends Contas {
    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
        super(banco, agencia, numeroconta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void toString0() {
        super.toString0();
        System.out.println("Dias Sem Juros: " + diasSemJuros);
        System.out.println("Limite: " + limite);
    }
}
