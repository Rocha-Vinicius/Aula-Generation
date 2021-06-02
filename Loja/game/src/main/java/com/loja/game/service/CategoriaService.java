package com.loja.game.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.game.model.Categoria;
import com.loja.game.model.Produto;
import com.loja.game.repository.CategoriaRepository;



@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	/**
	 * @author Vinicius Rocha
	 * O método cadastrará categorias que não tiverem descrição, caso tenha descrição não será criado
	 * @param newCategoria - objeto controller
	 * @param catExistente - Categoria Existente
	 * @param atualizarCat -  Atualizar Categoria
	 * @return Optional contem os dados cadastrtos, caso  não haja descrição o retorno será vazio 
	 */
	
	public Optional<Object> cadastroCategoria (Categoria newCategoria){
		Optional<Object> catExistente = repository.findByNomeCategoria(newCategoria.getNomeCategoria());
		
		if(catExistente.isEmpty()){
			return Optional.ofNullable(repository.save(newCategoria));
		}
		else {
			return Optional.empty();
		}
	
	}
	
	public Optional<Object> atualizarCat (Long idCategoria, Categoria atualizacaoCat){
		Optional<Categoria> idCategoriaExistente = repository.findById(idCategoria);
		Optional<Object> nomeCategoriaExistente = repository.findByNomeCategoria(atualizacaoCat.getNomeCategoria());
		if(idCategoriaExistente.isPresent() && nomeCategoriaExistente.isEmpty()) {
			idCategoriaExistente.get().setNomeCategoria(atualizacaoCat.getNomeCategoria());
			idCategoriaExistente.get().setDescricao(atualizacaoCat.getDescricao());
			return Optional.ofNullable(repository.save(idCategoriaExistente.get()));
		}
		else {
			return Optional.empty();
		}
	}

	public Optional<Produto> cadastroCat(Long idCategoria, @Valid Produto newProduto) {
		// TODO Auto-generated method stub
		return null;
	}


}
