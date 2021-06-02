package com.loja.game.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.loja.game.model.Produto;
import com.loja.game.repository.ProdutoRepository;
import com.loja.game.service.CategoriaService;
import com.loja.game.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriaService servicec;
	
	@Autowired
	private ProdutoService servicep;
	
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Produto> findByIdProduto (@PathVariable long id){
		return repository.findById(id)
		.map(produtoId -> ResponseEntity.status(200).body(produtoId))
		.orElse(ResponseEntity.status(400).build());
	}
	
	@GetMapping("/todos")
	public ResponseEntity<List<Produto>> findAllProduto(){
		List<Produto> listaDeProdutos = repository.findAll();
		return ResponseEntity.status(200).body(listaDeProdutos);
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<Produto> findByTitulo(@PathVariable String titulo){
		return repository.findByTitulo(titulo)
				.map (tituloProduto -> ResponseEntity.status(200).body(tituloProduto)) 
				.orElse(ResponseEntity.status(404).build());
	}
	
	@PostMapping("/cadastrar/{idCategoria}")
	public ResponseEntity<Produto> postProduto (@PathVariable(value = "idCategoria") Long idCategoria, @Valid @RequestBody Produto newProduto){
		return servicec.cadastrarProduto(idCategoria, newProduto)
				.map(cadastro -> ResponseEntity.status(201).body(cadastro))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@PutMapping("/atualizar/{idProduto}")
	public ResponseEntity<Produto> putProduto (@PathVariable (value = "idProduto") Long idProduto, @Valid @RequestBody Produto dadosProduto){
		return servicep.atualizarProd(idProduto, dadosProduto)
				.map(dadosAtualizados -> ResponseEntity.status(201).body(dadosAtualizados))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@DeleteMapping("/deletar/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}


