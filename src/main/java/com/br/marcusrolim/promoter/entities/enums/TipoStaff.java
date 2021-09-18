package com.br.marcusrolim.promoter.entities.enums;

public enum TipoStaff {

	GERÊNCIA(1, "Gerência", 500.00),
	ATRAÇÃO(2, "Atração", 150.00),
	BAR(3, "Bar", 250.00),
	SEGURANÇA(4, "Segurança", 250.00),
	ÁREA_PUBLICO(5, "Área publico", 1000.00),
	ENTRADA(6, "Entrada", 150.00),
	LIMPEZA(7, "Limpeza", 50.00);
	
	private int id;
	private String descricao;
	private double valor;
	
	private TipoStaff(int id, String descricao, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
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
