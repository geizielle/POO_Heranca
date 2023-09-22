public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Silvana", "Rua Alamenda Julia, 123", "123.456.789-99", "Viuva");
        System.out.println("Dados da Pessoa Física:");
        System.out.println(pessoaFisica.toString());
        System.out.println();
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Amaterasu", "Avenida Portugal, 888", "12.345.678/0001-08", "LTDA");
        System.out.println("Dados da Pessoa Jurídica:");
        System.out.println(pessoaJuridica.toString());
    }
}
