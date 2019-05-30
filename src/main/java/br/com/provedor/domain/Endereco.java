package br.com.provedor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Endereco {
	
	@Column(nullable=false)
	private String logradouro;
	
	@Column(nullable=false)
	private int numero;
	
	@Column(nullable=false)
	private int cep;
	
	@Column
	private String complemento;
	
	@Column(nullable=false)
	private String bairro;
	
	@Column(nullable=false)
	private String cidade;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

}
