public class Main {
    public static void main(String[] args) {
        BombaGasolina bombaGasolina = new BombaGasolina(1000.0, 4.5f);
        if (bombaGasolina.abastecerPorLitros(20)) {
            System.out.println("Abastecimento de gasolina realizado com sucesso.");
        } else {
            System.out.println("Não foi possível abastecer 20 litros de gasolina.");
        }
        System.out.println();
        BombaEtanol bombaEtanol = new BombaEtanol(800.0, 3.8f);
        if (bombaEtanol.abastecerPorValor(50.0f)) {
            System.out.println("Abastecimento de etanol realizado com sucesso.");
        } else {
            System.out.println("Não foi possível abastecer R$ 50,00 de etanol.");
        }
        BombaDiesel bombaDiesel = new BombaDiesel(500.0, 4.0f);
       
        System.out.println();
        if (bombaDiesel.abastecerPorLitros(50)) {
            System.out.println("Abastecimento de Diesel realizado com sucesso.");
        } else {
            System.out.println("Não foi possível abastecer 50 litros de Diesel.");
        }
    }
}