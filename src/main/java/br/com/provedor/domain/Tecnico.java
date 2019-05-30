package br.com.provedor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa {
	
	@Column
	private Cliente infoCliente;
	
	@Column
	private Endereco infoEndereco;
	

	@Override
	public String toString() {
		return "Tecnico [infoCliente=" + infoCliente + ", infoEndereco=" + infoEndereco + "]";
	}
	
}
