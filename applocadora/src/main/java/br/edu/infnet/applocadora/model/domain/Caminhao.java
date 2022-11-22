package br.edu.infnet.applocadora.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcaminhao")
public class Caminhao extends Veiculo {
	
	private String tipoCaminhao;
	private float capacidadeCarga;
	private int qtdEixos;
	
	@Override
	public String toString() {
		
		return super.toString() + ";" + tipoCaminhao + ";" + capacidadeCarga + ";" + qtdEixos;
	}

	public String getTipoCaminhao() {
		return tipoCaminhao;
	}

	public void setTipoCaminhao(String tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}

	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getQtdEixos() {
		return qtdEixos;
	}

	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}
}