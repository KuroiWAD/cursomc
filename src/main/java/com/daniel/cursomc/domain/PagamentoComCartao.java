package com.daniel.cursomc.domain;

import javax.persistence.Entity;

import com.daniel.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido,Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParelas() {
		return numeroDeParelas;
	}

	public void setNumeroDeParelas(Integer numeroDeParelas) {
		this.numeroDeParelas = numeroDeParelas;
	}

	
	
}
