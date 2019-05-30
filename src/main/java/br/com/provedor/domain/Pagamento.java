package br.com.provedor.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pagamento {
	
	@Column
	private Plano infoPlano;
	@Column(nullable=false)
	
	private float valorMensal;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date vencimento;
	
	@Column(nullable=false)
	private String formaPag;
	
	
	
	public float getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public String getFormaPag() {
		return formaPag;
	}
	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}
	
}
