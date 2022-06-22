package br.com.sistemadeenergia;

public class UC {
	private int ucId;
	private Cliente cliente;
	private int leituraAnterior;
	private int leituraAtual;
	private Endereco endereco;

	public String toString() {
		return "ID uc: " + ucId + "Cliente: " + cliente.toString() + "Leitura anterior: " + leituraAnterior + "Leitura atual: "
				+ leituraAtual + "Endereço: " + endereco.toString();
	}

	//- O método "faturar(leitura: int): int" recebe por parâmetro um valor correspondente a leitura corrente. 
	//O valor da leitura anterior vai receber o atual e o atual passa a receber o corrente. 
	//Este método ainda retorna o consumo, que é a diferença entre o atual e o anterior.
	
	public int faturar(int leitura) {
		leituraAnterior = leituraAtual;
		leituraAtual = leitura;
		return pegarConsumo();
	}

	public int pegarConsumo() {
    return leituraAtual - leituraAnterior;
    
	}

	public int getUcId() {
		return ucId;
	}

	public void setUcId(int ucId) {
		this.ucId = ucId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
