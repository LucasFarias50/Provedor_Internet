package br.com.provedor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tecnicos")
public class Tecnico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	private String cpf;
	
	@Column(length = 80, nullable = false)
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "Cliente_id")
	private Cliente Cliente;
	
	
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
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Informações do Cliente= " + this.Cliente.toString();
	}
	
}
