package com.br.marcusrolim.promoter.entities.enums;

public enum TipoConsumo {
	
	TEEN(1, "Teen"),
	NORMAL(2, "Normal"),
	OPEN(3, "Open Bar");
	
	private int id;
	private String descricao;
	
	private TipoConsumo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoConsumo toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoConsumo x : TipoConsumo.values()) {
			if(id.equals(x.getId()))
				return x;
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
