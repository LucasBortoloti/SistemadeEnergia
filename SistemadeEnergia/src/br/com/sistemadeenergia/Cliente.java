package br.com.sistemadeenergia;

public class Cliente {

	private int clienteId;
	private String nome;
	private Endereco endereco;
	
	public String toString() {
		return "nome:  " + nome + "endereco: " + endereco + "ID CLIENTE: " + clienteId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

