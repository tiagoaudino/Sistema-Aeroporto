public class VooNacional extends Voo {
    private int qtdPassageiros;
    private int qtdMaxPassageiros;


    public VooNacional(int qtdPassageiros, int qtdMaxPassageiros) {
        super();
        this.qtdPassageiros = qtdPassageiros;
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }
    @Override
    public void calculoCombustivel(double combustivelN, int distancia) {
        combustivelN = distancia*0.12;
    }
    @Override
    public void calculoValorFinal(int distancia, double valor, int qtdPassageiros) {
        valor = (distancia*8.5) + (qtdPassageiros*35);
    }

}
