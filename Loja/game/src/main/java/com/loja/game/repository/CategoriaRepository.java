package com.loja.game.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.game.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public Optional<Object> findByNomeCategoria(String nomeCategoria);
	
	public List<Categoria> findAllByNomeCategoriaContaining(String nomeCategoria);

}
