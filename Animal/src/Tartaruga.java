public class Tartaruga extends Reptil {
    private String espécie;

    public Tartaruga(String nome, int idade, boolean escamas, boolean oviparidade, String espécie) {
        super(nome, idade, escamas, oviparidade);
        this.espécie = espécie;
    }

    public String getEspécie() {
        return espécie;
    }

    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }
}