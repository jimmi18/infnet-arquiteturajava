package br.edu.infnet.applocadora.model.domain;

public class Locatario {
	
	private String nome;
	private String cpf;
	private String telefone;
	
	@Override
	public String toString() {
		
		return nome + ";" + cpf + ";" + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}