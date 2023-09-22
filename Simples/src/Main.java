public class Main {
    public static void main(String[] args) {
        
        ContaSimples contaSimples = new ContaSimples("Banco Nacional", 1234, 3333, 8880.0, true, "Viuvo");
        System.out.println("Dados da Conta Simples:");
        contaSimples.toString0();

        System.out.println();

        ContaEspecial contaEspecial = new ContaEspecial("Banco do Brasil", 4321, 6667, 3456.0, 30, 1900.0);
        System.out.println("Dados da Conta Especial:");
        contaEspecial.toString0();
    }
}
