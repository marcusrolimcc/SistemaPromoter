package com.br.marcusrolim.promoter.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.marcusrolim.promoter.entities.Bebida;
import com.br.marcusrolim.promoter.repositories.BebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	private BebidaRepository repo;
	
	public Bebida buscar(Integer id) {
		Optional<Bebida> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
