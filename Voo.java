abstract class Voo{

        protected int codigo;
        protected String origem;
        protected String destino;
        protected int distancia;
        protected double combustivelDisponivel;
        protected double combustivelNecessario;
        protected boolean situacaoDocumento;
        protected double valor;

        public Voo(int codigo, String origem, String destino, int distancia, double combustivelDisponivel, boolean situacaoDocumento) {
                this.codigo = codigo;
                this.origem = origem;
                this.destino = destino;
                this.distancia = distancia;
                this.combustivelDisponivel = combustivelDisponivel;
                this.situacaoDocumento = situacaoDocumento;
        }

        public abstract void calculoCombustivel();
        public abstract void calculoValorFinal();
        public int getCodigo() {
                return codigo;
        }

        public double getValor() {
                return valor;
        }
        @Override
        public String toString() {
                return "Codigo: " + codigo +
                        " | Origem: " + origem +
                        " | Destino: " + destino +
                        " | Distancia: " + distancia +
                        " km | Valor: R$ " + valor;
        }
}