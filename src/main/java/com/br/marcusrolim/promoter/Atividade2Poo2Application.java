package com.br.marcusrolim.promoter;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.marcusrolim.promoter.entities.Bebida;
import com.br.marcusrolim.promoter.entities.Estado;
import com.br.marcusrolim.promoter.entities.Organizacao;
import com.br.marcusrolim.promoter.entities.Pagamento;
import com.br.marcusrolim.promoter.entities.enums.TipoBebida;
import com.br.marcusrolim.promoter.entities.enums.TipoPagamento;
import com.br.marcusrolim.promoter.entities.enums.TipoStaff;
import com.br.marcusrolim.promoter.repositories.BebidaRepository;
import com.br.marcusrolim.promoter.repositories.EstadoRepository;
import com.br.marcusrolim.promoter.repositories.OrganizacaoRepository;
import com.br.marcusrolim.promoter.repositories.PagamentoRepository;

@SpringBootApplication
public class Atividade2Poo2Application implements CommandLineRunner{

	@Autowired
	private BebidaRepository bebidaRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private OrganizacaoRepository organizacaoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Atividade2Poo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Bebida bebida1 = new Bebida(null, "Smirnoff", 37.5, TipoBebida.VODKA);
		Bebida bebida2 = new Bebida(null, "Grey Goose", 40.0, TipoBebida.VODKA);
		Bebida bebida3 = new Bebida(null, "Stolichnaya", 40.0, TipoBebida.VODKA);
		Bebida bebida4 = new Bebida(null, "SKY", 40.0, TipoBebida.VODKA);
		
		bebidaRepository.saveAll(Arrays.asList(bebida1, bebida2, bebida3, bebida4));
		
		Pagamento pag1 = new Pagamento(null, TipoPagamento.DINHEIRO);
		Pagamento pag2 = new Pagamento(null, TipoPagamento.CARTÃO_CRÉDITO);
		
		pagamentoRepository.saveAll(Arrays.asList(pag1, pag2));
		
		Organizacao org1 = new Organizacao(null, "Gerencia Bilheteria", 1, TipoStaff.ENTRADA);
		Organizacao org2 = new Organizacao(null, "Hostess", 3, TipoStaff.ENTRADA);
		Organizacao org3 = new Organizacao(null, "Garçom", 8, TipoStaff.BAR);
		
		organizacaoRepository.saveAll(Arrays.asList(org1, org2, org3));
		
		Estado est1 = new Estado(null, "Mato Grosso do Sul", "MS");
		
		estadoRepository.saveAll(Arrays.asList(est1));
	}
}
