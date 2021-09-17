package com.br.marcusrolim.promoter.entities.enums;

public enum TipoPagamento {

	DINHEIRO(1, "Dinheiro"),
	PIX(2, "Pix"),
	CARTÃO_CRÉDITO(3, "Cartão de crédito"),
	CARTÃO_DÉBITO(4, "Cartão de débito");
	
	private int id;
	private String descricao;
	
	private TipoPagamento(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPagamento toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoPagamento x : TipoPagamento.values()) {
			if(id.equals(x.getId()))
				return x;
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
