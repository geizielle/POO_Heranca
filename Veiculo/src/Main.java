public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(true, 6);
        System.out.println("Dados do caminhão:");
        System.out.println("Possui motor: " + caminhao.isMotor());
        System.out.println("Número de eixos: " + caminhao.getEixos());

        System.out.println();

        Carro carro = new Carro(true, 4);
        System.out.println("Dados do carro:");
        System.out.println("Possui motor: " + carro.isMotor());
        System.out.println("Número de portas: " + carro.getPortas());

        System.out.println();


        Moto moto = new Moto(true, 500);
        System.out.println("Dados da moto:");
        System.out.println("Possui motor: " + moto.isMotor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
