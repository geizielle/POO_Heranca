public class Contas {
    private String banco;
    private int agencia;
    private int numeroconta;
    protected double saldo;

    public Contas(String banco, int agencia, int numeroconta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void toString0() {
        System.out.println("Banco: " + banco);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroconta);
        System.out.println("Saldo: " + saldo);
    }
}
