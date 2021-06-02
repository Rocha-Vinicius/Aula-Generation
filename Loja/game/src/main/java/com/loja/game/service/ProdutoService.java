package com.loja.game.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.game.model.Categoria;
import com.loja.game.model.Produto;
import com.loja.game.repository.CategoriaRepository;
import com.loja.game.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repositoryP;
	
	@Autowired
	private CategoriaRepository repositoriC;
	
	
	public Optional<Object> cadastrarProduto(Long idCategoria, Produto newProduto){
		Optional<Categoria> categoriaExistente = repositoriC.findById(idCategoria);
		if(categoriaExistente.isPresent()) {
			newProduto.setGerador(categoriaExistente.get());
			return Optional.ofNullable(repositoryP.save(newProduto));
		}
		else {
			return Optional.empty();
		}
	}
	
	public Optional<Object> atualizarProd (Long idProduto, Produto atualizarProd){
		Optional<Produto> prodExistente = repositoryP.findById(idProduto);
		Optional<Object> nomeProdutoExistente = repositoryP.findByNomeProduto(atualizarProd.getNomeProduto());
		
		if(prodExistente.isPresent() && nomeProdutoExistente.isEmpty()) {
			prodExistente.get().setNomeProduto(atualizarProd.getNomeProduto());
			prodExistente.get().setNomeEstudio(atualizarProd.getNomeEstudio());
			return Optional.ofNullable(repositoryP.save(prodExistente.get()));
		}
		else {
			return Optional.empty();
		}
	}
	
	
}
