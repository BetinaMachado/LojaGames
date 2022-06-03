package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	//PERGUNTAR PRO PROF COMO ORDENAR EM ORDEM ALFABÉTICA. SORT? ORDERBYALPHABETICAL?

	public List <Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produto> findAllByPrecoLessThanOrderByPreco(BigDecimal preco);

}
