package com.br.marcusrolim.promoter.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.marcusrolim.promoter.entities.Organizacao;
import com.br.marcusrolim.promoter.repositories.OrganizacaoRepository;

@Service
public class OrganizacaoService {
	
	@Autowired
	private OrganizacaoRepository repo;
	
	public Organizacao buscar(Integer id) {
		Optional<Organizacao> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
