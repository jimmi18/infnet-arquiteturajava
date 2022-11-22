package br.edu.infnet.applocadora.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tcontrato")
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float valor;
	private int qtdDiarias;
	private LocalDateTime data;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idLocatario")
	private Locatario locatario;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Veiculo> veiculos;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Contrato() {
		data = LocalDateTime.now();
	}
	
	public Contrato (Locatario locatario) {
		this();
		this.locatario = locatario;
	}
	
	@Override
	public String toString() {
		
		return id + ";" + data + ";" + valor + ";" + qtdDiarias + ";" + locatario + ";" + veiculos.size();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}