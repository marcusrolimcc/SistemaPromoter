package com.br.marcusrolim.promoter.entities.enums;

public enum TipoStaff {

	GERÊNCIA(1, "Gerência"),
	ATRAÇÃO(2, "Atração"),
	BAR(3, "Bar"),
	SEGURANÇA(4, "Segurança"),
	ÁREA_PUBLICO(5, "Área publico"),
	ENTRADA(6, "Entrada"),
	LIMPEZA(7, "Limpeza");
	
	private int id;
	private String descricao;
	private TipoStaff(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoStaff toEnum(Integer id) {
		if(id == null)
			return null;
		for(TipoStaff x : TipoStaff.values()) {
			if(id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
