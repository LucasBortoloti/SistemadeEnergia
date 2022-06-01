package br.com.sistemadeenergia;

public class PessoaFisica extends Cliente {
	private String cpf;

	public String toString() {
		return "CPF: " + cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
