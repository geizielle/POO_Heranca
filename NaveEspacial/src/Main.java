public class Main {
    public static void main(String[] args) {
        Apolo11 apolo11 = new Apolo11(40000.0, "Hidrogênio Líquido");
        System.out.println("Apolo 11:");
        System.out.println("Velocidade Máxima: " + apolo11.getVelocidadeMaxima() + " km/h");
        System.out.println("Tipo de Combustível: " + apolo11.getTipoCombustivel());
        System.out.println();
        MillenniumFalcon millenniumFalcon = new MillenniumFalcon(100000.0, 0.5f);
        System.out.println("Millennium Falcon:");
        System.out.println("Velocidade Máxima: " + millenniumFalcon.getVelocidadeMaxima() + " km/h");
        System.out.println("Classe do Hiperpropulsor: " + millenniumFalcon.getClasseHiperpropulsor());
    }
}