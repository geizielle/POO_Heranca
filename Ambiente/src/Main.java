public class Main {
    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente(50.0f);
        System.out.println("Área do Ambiente: " + ambiente.getArea() + " metros quadrados");
        Quarto quarto = new Quarto(20.0f, 2);
        System.out.println("\nÁrea do Quarto: " + quarto.getArea() + " metros quadrados");
        System.out.println("Capacidade do Quarto: " + quarto.getCapacidade() + " pessoas");
        Sala sala = new Sala(30.0f, true);
        System.out.println("\nÁrea da Sala: " + sala.getArea() + " metros quadrados");
        System.out.println("A Sala possui TV? " + (sala.temTV() ? "Sim" : "Não"));
        Banheiro banheiro = new Banheiro(10.0f, false);
        System.out.println("\nÁrea do Banheiro: " + banheiro.getArea() + " metros quadrados");
        System.out.println("O Banheiro possui banheira? " + (banheiro.temBanheira() ? "Sim" : "Não"));
        Cozinha cozinha = new Cozinha(15.0f, true);
        System.out.println("\nÁrea da Cozinha: " + cozinha.getArea() + " metros quadrados");
        System.out.println("A Cozinha possui microondas? " + (cozinha.temMicroondas() ? "Sim" : "Não"));
    }
}
