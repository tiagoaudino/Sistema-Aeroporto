abstract class Voo{

        protected int codigo;
        protected String origem;
        protected String destino;
        protected int distancia;
        protected double combustivelDisponivel;
        protected double combustivelN;
        protected boolean situacaoDocumento;
        protected double valor;

        abstract void calculoCombustivel(double combustivelN, int distancia);

        abstract void calculoCombustivel(double combustivelN, int distancia, int pesoCarga);

        abstract void calculoValorFinal(int distancia, double valor, int qtdPassageiros);
    }