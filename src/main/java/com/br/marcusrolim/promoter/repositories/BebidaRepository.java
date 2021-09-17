package com.br.marcusrolim.promoter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.marcusrolim.promoter.entities.Bebida;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Integer> {}
