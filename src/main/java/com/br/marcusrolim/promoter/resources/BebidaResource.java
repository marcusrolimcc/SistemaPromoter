package com.br.marcusrolim.promoter.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.marcusrolim.promoter.entities.Bebida;
import com.br.marcusrolim.promoter.entities.enums.TipoBebida;

@RestController
@RequestMapping(value="/bebidas")
public class BebidaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Bebida> listar() {
		
		Bebida bebida1 = new Bebida(1, "Smirnoff", 37.5, TipoBebida.VODKA);
		Bebida bebida2 = new Bebida(2, "Grey Goose", 40.0, TipoBebida.VODKA);
		Bebida bebida3 = new Bebida(3, "Stolichnaya", 40.0, TipoBebida.VODKA);
		Bebida bebida4 = new Bebida(4, "SKY", 40.0, TipoBebida.VODKA);
		
		List<Bebida> bebida = new ArrayList<>();
		bebida.add(bebida1);
		bebida.add(bebida2);
		bebida.add(bebida3);
		bebida.add(bebida4);
		
		return bebida;
	}
}
