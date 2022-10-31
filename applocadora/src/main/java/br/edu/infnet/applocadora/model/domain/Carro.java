package br.edu.infnet.applocadora.model.domain;

public class Carro extends Veiculo {
	
	private String placa;
	private String modelo;
	private char cambio;
	
	@Override
	public String toString() {
		
		return super.toString() + ";" + placa + ";" + modelo + ";" + cambio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getCambio() {
		return cambio;
	}

	public void setCambio(char cambio) {
		this.cambio = cambio;
	}
}