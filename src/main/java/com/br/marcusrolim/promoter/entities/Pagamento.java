package com.br.marcusrolim.promoter.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.marcusrolim.promoter.entities.enums.TipoPagamento;

@Entity
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer tipoPagamento;
	
	public Pagamento() {}

	public Pagamento(Integer id, TipoPagamento tipoPagamento) {
		super();
		this.id = id;
		this.tipoPagamento = tipoPagamento.getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoPagamento getTipoPagamento() {
		return TipoPagamento.toEnum(tipoPagamento);
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}
}
