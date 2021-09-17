package com.br.marcusrolim.promoter.entities.enums;

public enum TipoEntrada {

	POPULAR(1, "Popular"),
	NORMAL(2, "Normal"),
	VIP(3, "Vip");
	
	private int id;
	private String descricao;
	
	private TipoEntrada(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoEntrada toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoEntrada x : TipoEntrada.values()) {
			if(id.equals(x.getId()))
				return x;
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
