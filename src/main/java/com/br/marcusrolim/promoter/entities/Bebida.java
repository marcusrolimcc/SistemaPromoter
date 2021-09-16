package com.br.marcusrolim.promoter.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.marcusrolim.promoter.entities.enums.TipoBebida;

@Entity
public class Bebida implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private Double teorAucoligo;
	private TipoBebida tipoBebida;
	
	public Bebida() {}
	
	public Bebida(Integer id, String nome, Double teorAucoligo, TipoBebida tipoBebida) {
		super();
		this.id = id;
		this.nome = nome;
		this.teorAucoligo = teorAucoligo;
		this.tipoBebida = tipoBebida;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTeorAucoligo() {
		return teorAucoligo;
	}

	public void setTeorAucoligo(Double teorAucoligo) {
		this.teorAucoligo = teorAucoligo;
	}
	
	public TipoBebida getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(TipoBebida tipoBebida) {
		this.tipoBebida = tipoBebida;
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
		Bebida other = (Bebida) obj;
		return Objects.equals(id, other.id);
	}
}
