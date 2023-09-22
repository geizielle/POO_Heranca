public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Sofia", 3, true, true, "SRD");
        System.out.println("Nome do Gato: " + gato.getNome());
        System.out.println("Idade do Gato: " + gato.getIdade());
        System.out.println("Tem Pelos: " + gato.temPelos());
        System.out.println("Amamenta: " + gato.amamenta());
        System.out.println("Raça do Gato: " + gato.getRaça());

        System.out.println();

        Tartaruga tartaruga = new Tartaruga("Bolota", 10, true, true, "Mar");
        System.out.println("Nome da Tartaruga: " + tartaruga.getNome());
        System.out.println("Idade da Tartaruga: " + tartaruga.getIdade());
        System.out.println("Tem Escamas: " + tartaruga.temEscamas());
        System.out.println("É Ovipara: " + tartaruga.éOviparo());
        System.out.println("Espécie da Tartaruga: " + tartaruga.getEspécie());
    }
}
