public class ContaSimples extends Contas {
    private boolean saldoPoupanca;
    private String estadoCivil;

    public ContaSimples(String banco, int agencia, int numeroconta, double saldo, boolean saldoPoupanca, String estadoCivil) {
        super(banco, agencia, numeroconta, saldo);
        this.saldoPoupanca = saldoPoupanca;
        this.estadoCivil = estadoCivil;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0 && saldoPoupanca) {
            return deposito(valor);
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && saldoPoupanca) {
            return saque(valor);
        }
        return false;
    }

    @Override
    public void toString0() {
        super.toString0();
        System.out.println("Saldo Poupança: " + saldoPoupanca);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
