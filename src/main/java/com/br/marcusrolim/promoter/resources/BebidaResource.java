package com.br.marcusrolim.promoter.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.marcusrolim.promoter.entities.Bebida;
import com.br.marcusrolim.promoter.services.BebidaService;

@RestController
@RequestMapping(value="/bebidas")
public class BebidaResource {

	@Autowired
	private BebidaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar(Integer id){
		List<Bebida> obj = service.listar(id);
		return ResponseEntity.ok().body(obj);
		}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> Find(@PathVariable Integer id) {
		Bebida obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
