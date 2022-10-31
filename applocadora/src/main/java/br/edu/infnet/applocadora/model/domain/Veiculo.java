package br.edu.infnet.applocadora.model.domain;

public abstract class Veiculo {
	
	private double peso;
	private String cor;
	private String marca;
	private boolean temSeguro;

	@Override
	public String toString() {
		return peso + ";" + cor + ";" + marca + ";" + temSeguro;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isTemSeguro() {
		return temSeguro;
	}

	public void setTemSeguro(boolean temSeguro) {
		this.temSeguro = temSeguro;
	}
}