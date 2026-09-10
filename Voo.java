public abstract class Voo implements Autorizacao {

	private int codigo;

	private String origem;

	private String destino;

	private int distancia;

	private int combustivelDisponivel;

	private boolean situacaoDocumento;

	public abstract void calculoCombustivel();

	public abstract void calculoValorFinal();


	/**
	 * @see Autorizacao#autorizacaoDecolagem()
	 */
	public boolean autorizacaoDecolagem() {
		return false;
	}


	/**
	 * @see Autorizacao#getMotivoPend()
	 */
	public String getMotivoPend() {
		return null;
	}

}
