package br.com.provedor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	private String cpf;
	
	@Column(length = 80, nullable = false)
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "endereco_codigo")
	private Endereco Endereco;
	
	@ManyToOne
	@JoinColumn(name = "plano_codigo")
	private Plano Plano;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	public Plano getPlano() {
		return Plano;
	}
	public void setPlano(Plano plano) {
		Plano = plano;
	}
	
	@Override
	public String toString() {
		return "Cliente: nome=" + nome + " / " + this.Endereco.toString() + " / " + this.Plano.toString() + "]";
	}
	
}
