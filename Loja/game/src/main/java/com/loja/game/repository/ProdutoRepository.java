package com.loja.game.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.game.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public Optional<Produto> findByTitulo (String titulo);

}