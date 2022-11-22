package br.edu.infnet.applocadora.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "taviao")
public class Aviao extends Veiculo {
	
	private String tipoMotor;
	private String combustivel;
	private int qtdPessoas;
	
	@Override
	public String toString() {
		
		return super.toString() + ";" + tipoMotor + ";" + combustivel + ";" + qtdPessoas;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	

}