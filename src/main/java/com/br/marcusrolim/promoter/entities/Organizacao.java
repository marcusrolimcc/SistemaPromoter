package com.br.marcusrolim.promoter.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.marcusrolim.promoter.entities.enums.TipoStaff;

@Entity
public class Organizacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer quantidade;
	private Integer tipoStaff;
	
	public Organizacao() {}

	public Organizacao(Integer id, String descricao, Integer quantidade, TipoStaff tipoStaff) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.tipoStaff = tipoStaff.getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public TipoStaff getTipoStaff() {
		return TipoStaff.toEnum(tipoStaff);
	}

	public void setTipoStaff(TipoStaff tipoStaff) {
		this.tipoStaff = tipoStaff.getId();
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
		Organizacao other = (Organizacao) obj;
		return Objects.equals(id, other.id);
	}
	
	public double calcCustos(Integer quantidade, TipoStaff tipoStaff) {
		double custo = tipoStaff.getValor() * quantidade;
		return custo;
	}
}
