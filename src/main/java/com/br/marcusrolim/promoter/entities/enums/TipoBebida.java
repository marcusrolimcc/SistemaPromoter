package com.br.marcusrolim.promoter.entities.enums;

public enum TipoBebida {

	CERVEJA(1, "Cerveja"),
	VODKA(2, "Vodka"),
	WHISKY(3, "Whisky"),
	GIN(4, "Gin"),
	ESPUMANTE(5, "Espumante"), 
	REFRIGERANTE(6, "Refrigerante"), 
	AGUA(7, "Água"),
	ENERGETICO(8, "Energético"), 
	AGUA_DE_COCO(9, "Água de Coco");
	
	private int id;
	private String descricao;
	private TipoBebida(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoBebida toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoBebida x : TipoBebida.values()) {
			if(id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
