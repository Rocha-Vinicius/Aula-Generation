package com.loja.game.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loja.game.model.Produto;
import com.loja.game.repository.ProdutoRepository;
import com.loja.game.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repositoryP;
	
	@Autowired
	private ProdutoService serviceP;
	
	
	@GetMapping("/id_produto")
	public ResponseEntity<Optional<Produto>> findByIdProdutoId (@PathVariable(value = "id_produto") Long idProduto){
		Optional<Produto> idDoProduto = repositoryP.findById(idProduto);
		if(idDoProduto.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(idDoProduto);
		}
		
	}

	@GetMapping("/buscar/{id_produto}")
	public ResponseEntity<Object> buscarProdutoPorNome(@RequestParam(defaultValue = "") String nomeProduto) {
		List<Produto> listaDeProdutos = repositoryP.findAllByNomeProdutoContaining(nomeProduto);
		
		if(listaDeProdutos.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listaDeProdutos);
		}
	}
	
	@PostMapping("/cadastrar/{id_categoria}")
	public ResponseEntity<Object> postProduto (@PathVariable(value = "id_categoria") Long idCategoria, @Valid @RequestBody Produto newProduto){
		return serviceP.cadastrarProduto(idCategoria, newProduto)
				.map(Cadastro -> ResponseEntity.status(201).body(Cadastro))
				.orElse(ResponseEntity.status(400).body("Categoria já existente"));
	}
	
	
	@PutMapping("/atualizar/{id_produto}")
	public ResponseEntity<Object> putProduto (@PathVariable(value = "id_produto") Long idProduto, @Valid @RequestBody Produto atualizarProduto){
		return serviceP.atualizarProd(idProduto, atualizarProduto)
				.map(dadosAtualizados -> ResponseEntity.status(201).body(dadosAtualizados))
				.orElse(ResponseEntity.status(400).body("Produto Existente"));
	}
	
	@DeleteMapping("/produto/{id_produto}")
	public void delete(@PathVariable long idProduto) {
		repositoryP.deleteById(idProduto);
	}
	
}


