public class VooCarga extends Voo {

    private int pesoCarga;
    private int capacidadeMax;
    private String InspectionSituation;

    public VooCarga(int codigo, String origem,  String destino,  int distancia, int combustivelDisponivel, boolean situacaoDocumento, int pesoCarga, int pacidadeMax, String InspectionSituation) {}

    @Override
    void calculoCombustivel(double combustivelN, int distancia, int pesoCarga) {
        combustivelDisponivel = (distancia*0.15)+ (pesoCarga*0.02);
    }

    @Override
    void calculoValorFinal(int distancia, double valor, int qtdPassageiros) {}
}