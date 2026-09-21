
public class VooNacional extends Voo implements Autorizacao{
    private int qtdPassageiros;
    private int qtdMaxPassageiros;


    public VooNacional(int codigo, String origem, String destino, int distancia, double combustivelDisponivel, boolean situacaoDocumento, int qtdPassageiros, int qtdMaxPassageiros) {

        super(codigo, origem, destino, distancia, combustivelDisponivel, situacaoDocumento);
        this.qtdPassageiros = qtdPassageiros;
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }
    @Override
    public void calculoCombustivel() {

        combustivelNecessario= distancia*0.12;
    }
    @Override
    public void calculoValorFinal() {
        valor = (distancia*8.5) + (qtdPassageiros*35);
    }
    @Override
    public boolean autorizacaoDecolagem() {

        return situacaoDocumento && combustivelDisponivel >= combustivelNecessario && qtdPassageiros <= qtdMaxPassageiros && qtdPassageiros >= 10;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdMaxPassageiros() {
        return qtdMaxPassageiros;
    }

    public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }
}
