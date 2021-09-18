package com.br.marcusrolim.promoter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.marcusrolim.promoter.entities.Organizacao;

@Repository
public interface OrganizacaoRepository extends JpaRepository<Organizacao, Integer> {}
