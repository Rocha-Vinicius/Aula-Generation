package com.loja.game.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.game.model.Categoria;
import com.loja.game.model.Produto;
import com.loja.game.repository.CategoriaRepository;
import com.loja.game.repository.ProdutoRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	@Autowired
	private ProdutoRepository repositoryp;
	
	/**
	 * @author Vinicius Rocha
	 * O método cadastrará categorias que não tiverem descrição, caso tenha descrição não será criado
	 * @param newCategoria - objeto controller
	 * @param catExistente - Categoria Existente
	 * @param atualizarCat -  Atualizar Categoria
	 * @return Optional contem os dados cadastrtos, caso  não haja descrição o retorno será vazio 
	 */
	
	public Optional<Categoria> cadastroPostagem (Categoria newCategoria){
		Optional<Categoria> catExistente = repository.findByDescricao(newCategoria.getDescricao());
		
		if(catExistente.isEmpty()){
			return Optional.ofNullable(repository.save(newCategoria));
		}
		else {
			return Optional.empty();
		}
	
	}
	
	public Optional<Categoria> atualizarCat (Long id, Categoria dadosCategoria){
		Optional<Categoria> catExistente = repository.findById(id);
		if(catExistente.isPresent()) {
			catExistente.get().setDescricao(dadosCategoria.getDescricao());
			return Optional.ofNullable(repository.save(catExistente.get()));
		}
		else {
			return Optional.empty();
		}
	}
	
	public Optional <Produto> cadastrarProduto (Long idCategoria, Produto newProduto){
		Optional <Categoria> catExistente = repository.findById(idCategoria);
		
		if(catExistente.isPresent()) {
			newProduto.setCategoria(catExistente.get());
			return Optional.ofNullable(repositoryp.save(newProduto));
		}
		else {
			return Optional.empty();
		}
	}

	
}
