public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
        super(nome, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        return super.toString() + "\nCPF: " + cpf + "\nEstado Civil: " + estadoCivil;
    }
}
