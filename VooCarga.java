public class VooCarga extends Voo implements Autorizacao{

    private int pesoCarga;
    private int capacidadeMax;
    private boolean InspectionSituation;

    public VooCarga(int codigo, String origem,  String destino,  int distancia, int combustivelDisponivel, boolean situacaoDocumento, int pesoCarga, int pacidadeMax, boolean InspectionSituation) {
        super(codigo,origem,destino,distancia,combustivelDisponivel,situacaoDocumento);
        this.pesoCarga=pesoCarga;
        this.capacidadeMax=capacidadeMax;
        this.InspectionSituation=InspectionSituation;
    }

    @Override
    public void calculoCombustivel() {
        combustivelNecessario = (distancia * 0.15) + (pesoCarga * 0.02);
    }

    @Override
    public void calculoValorFinal() {
        valor=(10*distancia)+(1.5*pesoCarga);
    }
    @Override
    public boolean autorizacaoDecolagem() {

        return situacaoDocumento && InspectionSituation && pesoCarga <= capacidadeMax && combustivelDisponivel >= combustivelNecessario;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public boolean isInspectionSituation() {
        return InspectionSituation;
    }

    public void setInspectionSituation(boolean inspectionSituation) {
        InspectionSituation = inspectionSituation;
    }
}