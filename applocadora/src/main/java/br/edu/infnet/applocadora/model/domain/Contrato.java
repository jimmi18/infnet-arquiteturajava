package br.edu.infnet.applocadora.model.domain;

import java.time.LocalDateTime;

public class Contrato {
	
	private float valor;
	private int qtdDiarias;
	private LocalDateTime data;	
	
	public Contrato() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		return data + ";" + valor + ";" + qtdDiarias;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQtdDiarias() {
		return qtdDiarias;
	}

	public void setQtdDiarias(int qtdDiarias) {
		this.qtdDiarias = qtdDiarias;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData() {
		this.data = LocalDateTime.now();
	}
}