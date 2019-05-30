package br.com.provedor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
public class Cliente extends Pessoa {
	
	@Column
	private Plano tipoPlano;
	@Column
	private Endereco endCliente;
	@Column
	private Pagamento situacaoPag;
	
	
	
	public Plano getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(Plano tipoPlano) {
		this.tipoPlano = tipoPlano;
	}

	public Endereco getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(Endereco endCliente) {
		this.endCliente = endCliente;
	}

	public Pagamento getSituacaoPag() {
		return situacaoPag;
	}

	public void setSituacaoPag(Pagamento situacaoPag) {
		this.situacaoPag = situacaoPag;
	}

	public void cadastrar() {
		
	}
	
	public void pedirInstalacao() {
		
	}
	
	public void pagarConta() {
		
	} 
	
	public void trocarPlano() {
		
	}
	
	public void cancelarPlano() {
		
	}
	
}
