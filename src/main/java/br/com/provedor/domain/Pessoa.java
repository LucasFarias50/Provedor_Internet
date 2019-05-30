package br.com.provedor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Pessoas")
public abstract class Pessoa {
	
	@Column(nullable=false)
	private String nome;
	
	@Id
	private int cpf;
	
	@Column(nullable=false)
	private int telefone;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(nullable=false)
	private String senha;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean login (String email, String senha) {
		if (email == this.email && senha==this.senha) {
			return true; 
		}
		else return false;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}
	
}
