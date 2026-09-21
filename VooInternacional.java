public class VooInternacional extends Voo implements Autorizacao{

    private int qtdPassageiros;
    private int qtdMaxPassageiros;
    private boolean autorizacaoInternacional;


    public VooInternacional(int codigo, String origem, String destino, int distancia, double combustivelDisponivel, boolean situacaoDocumento, int qtdPassageiros, int qtdMaxPassageiros, boolean autorizacaoInternacional) {

        super(codigo, origem, destino, distancia, combustivelDisponivel, situacaoDocumento);

        this.qtdPassageiros = qtdPassageiros;
        this.qtdMaxPassageiros = qtdMaxPassageiros;
        this.autorizacaoInternacional = autorizacaoInternacional;
    }


    @Override
    public void calculoCombustivel() {
        combustivelNecessario = distancia * 0.12 * 1.20;
    }


    @Override
    public void calculoValorFinal() {
        valor = (distancia * 12) + (qtdPassageiros * 60) + 8000;
    }
    @Override
    public boolean autorizacaoDecolagem() {

        return situacaoDocumento && autorizacaoInternacional && combustivelDisponivel >= combustivelNecessario && qtdPassageiros <= qtdMaxPassageiros && qtdPassageiros >= 20;
    }

    public boolean isAutorizacaoInternacional() {
        return autorizacaoInternacional;
    }

    public void setAutorizacaoInternacional(boolean autorizacaoInternacional) {
        this.autorizacaoInternacional = autorizacaoInternacional;
    }

    public int getQtdMaxPassageiros() {
        return qtdMaxPassageiros;
    }

    public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
