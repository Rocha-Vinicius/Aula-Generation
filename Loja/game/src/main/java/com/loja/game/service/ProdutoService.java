package com.loja.game.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.game.model.Produto;
import com.loja.game.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repositoryp;
	
	public Optional <Produto> atualizarProd (Long idProduto, Produto dadosProduto){
		Optional<Produto> prodExistente = repositoryp.findById(idProduto);
		if(prodExistente.isPresent()) {
			prodExistente.get().setCategoria(dadosProduto.getCategoria());
			prodExistente.get().setTitulo(dadosProduto.getTitulo());
			return Optional.ofNullable(repositoryp.save(prodExistente.get()));
		}
		else {
			return Optional.empty();
		}
	}
}
