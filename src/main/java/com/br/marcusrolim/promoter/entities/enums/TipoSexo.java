package com.br.marcusrolim.promoter.entities.enums;

public enum TipoSexo {
	
	MASCULINO(1, "Masculino"),
	FEMININO(2, "Feminino");
	
	private int id;
	private String descricao;
	
	private TipoSexo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoSexo toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoSexo x : TipoSexo.values()) {
			if(id.equals(x.getId()))
				return null;
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
